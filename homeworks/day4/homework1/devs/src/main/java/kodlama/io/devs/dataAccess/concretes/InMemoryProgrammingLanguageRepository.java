package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.exceptions.NameNotValidException;
import kodlama.io.devs.exceptions.NameRepeatException;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage add(String name) throws NameNotValidException, NameRepeatException{
        int id = 1;
        if (name == null) {
            throw new NameNotValidException();
        }
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (name.equals(programmingLanguage.getName())) {
                throw new NameRepeatException(name);
            }
        }
        if (programmingLanguages.size() > 0) {
            id =
            programmingLanguages.get(programmingLanguages.size() - 1).getId() + 1;
        }
        ProgrammingLanguage programmingLanguage = 
        new ProgrammingLanguage(id, name);
        programmingLanguages.add(programmingLanguage);
        return programmingLanguage;
    }

    @Override
    public void delete(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                programmingLanguages.remove(programmingLanguage);
            }
        }
    }

    @Override
    public ProgrammingLanguage update(int id, String name) throws NameNotValidException, NameRepeatException {
        if (name == null) {
            throw new NameNotValidException();
        }
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (name.equals(programmingLanguage.getName())) {
                throw new NameRepeatException(name);
            }
        }
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getName() == name) {
                throw new NameRepeatException(name);
            }
        }
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                programmingLanguage.setName(name);
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public ProgrammingLanguage getDetail(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
