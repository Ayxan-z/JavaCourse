package kodlama.io.devs.webApi.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.exceptions.NameNotValidException;
import kodlama.io.devs.exceptions.NameRepeatException;


@RestController
@RequestMapping("/api/programming-languages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public ProgrammingLanguage add(String name) throws NameNotValidException, NameRepeatException {
        return programmingLanguageService.add(name);
    }

    @GetMapping("/getdetail/{id}")
    public ProgrammingLanguage getDetail(@PathVariable("id") int id) {
        return programmingLanguageService.getDetail(id);
    }

    @PostMapping("/update/{id}")
    public ProgrammingLanguage update(@PathVariable("id") int id, String name) throws NameNotValidException, NameRepeatException {
        return programmingLanguageService.update(id, name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        programmingLanguageService.delete(id);
    }

    @ExceptionHandler(value = NameNotValidException.class)
    public String nameNotValid(Model theModel) {       
        theModel.addAttribute("err", "Name");
        return "name can't be null";
    }

    @ExceptionHandler(value = NameRepeatException.class)
    public String nameRepeat(Model theModel) {       
        theModel.addAttribute("err", "Name");
        return "name cannot be repeated";
    }
}
