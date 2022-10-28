package kodlama.io.devs.business.abstracts;

import java.util.List;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.exceptions.NameNotValidException;
import kodlama.io.devs.exceptions.NameRepeatException;


public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage add(String name) throws NameNotValidException, NameRepeatException;
    void delete(int id);
    ProgrammingLanguage update(int id, String name) throws NameNotValidException, NameRepeatException;
    ProgrammingLanguage getDetail(int id);
}
