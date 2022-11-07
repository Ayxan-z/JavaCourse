package programming_langs.dev.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import programming_langs.dev.business.abstracts.SubCategoryService;
import programming_langs.dev.business.requests.subCategoryRequests.CreateSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.DeleteSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.UpdateSubCategoryRequest;
import programming_langs.dev.business.responses.subCategoryResponses.GetAllSubCategoriesResponse;


@RestController
@RequestMapping("/api/category")
public class SubCategoryController {
    private SubCategoryService subCategoryService;

    @Autowired
    public SubCategoryController(SubCategoryService subCategoryService) {
        this.subCategoryService = subCategoryService;
    }

    @GetMapping("/getall")
    public List<GetAllSubCategoriesResponse> getAll() {
        return this.subCategoryService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateSubCategoryRequest createSubCategoryRequest) {
        this.subCategoryService.add(createSubCategoryRequest);
    }

    @PostMapping("/update")
    public void update(UpdateSubCategoryRequest updateSubCategoryRequest) {
        this.subCategoryService.update(updateSubCategoryRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteSubCategoryRequest deleteSubCategoryRequest) {
        this.subCategoryService.delete(deleteSubCategoryRequest);
    }
}
