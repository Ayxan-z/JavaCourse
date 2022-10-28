package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.exceptions.NameNotValidException;
import kodlama.io.devs.exceptions.NameRepeatException;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage add(String name) throws NameNotValidException, NameRepeatException;
    void delete(int id);
    ProgrammingLanguage update(int id, String name) throws NameNotValidException, NameRepeatException;
    ProgrammingLanguage getDetail(int id);
}
