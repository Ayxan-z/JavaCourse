package programming_langs.dev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programming_langs.dev.business.abstracts.ProgrammingLangService;
import programming_langs.dev.business.requests.programmingLangRequests.CreateProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.DeleteProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.UpdateProgrammingLangRequest;
import programming_langs.dev.business.responses.programmingLangResponses.GetAllProgrammingLangsResponse;


@RestController
@RequestMapping("/api/programminglang")
public class ProgrammingLangController {
    private ProgrammingLangService programmingLangService;

    @Autowired
    public ProgrammingLangController(ProgrammingLangService programmingLangService) {
        this.programmingLangService = programmingLangService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLangsResponse> getAll() {
        return this.programmingLangService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateProgrammingLangRequest createProgrammingLangRequest) {
        this.programmingLangService.add(createProgrammingLangRequest);
    }

    @PostMapping("/update")
    public void update(UpdateProgrammingLangRequest updateProgrammingLangRequest) {
        this.programmingLangService.update(updateProgrammingLangRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteProgrammingLangRequest deleteProgrammingLangRequest) {
        this.programmingLangService.delete(deleteProgrammingLangRequest);
    }
}
