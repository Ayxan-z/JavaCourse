package kodlama.io.devs.business.concrets;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.exceptions.NameNotValidException;
import kodlama.io.devs.exceptions.NameRepeatException;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage add(String name) throws NameNotValidException, NameRepeatException {
        return programmingLanguageRepository.add(name);
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public ProgrammingLanguage update(int id, String name) throws NameNotValidException, NameRepeatException {
        return programmingLanguageRepository.update(id, name);
    }

    @Override
    public ProgrammingLanguage getDetail(int id) {
        return programmingLanguageRepository.getDetail(id);
    }
}
