package programming_langs.dev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import programming_langs.dev.business.abstracts.SubCategoryService;
import programming_langs.dev.business.requests.subCategoryRequests.CreateSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.DeleteSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.UpdateSubCategoryRequest;
import programming_langs.dev.business.responses.subCategoryResponses.GetAllSubCategoriesResponse;
import programming_langs.dev.dataAccess.abstracts.ProgrammingLangRepository;
import programming_langs.dev.dataAccess.abstracts.SubCategoryRepository;
import programming_langs.dev.entities.SubCategory;


@Service
public class SubCategoryManager implements SubCategoryService {
    private SubCategoryRepository subCategoryRepository;
    private ProgrammingLangRepository programmingLangRepository;

    public SubCategoryManager(SubCategoryRepository subCategoryRepository, ProgrammingLangRepository programmingLangRepository) {
        this.subCategoryRepository = subCategoryRepository;
        this.programmingLangRepository = programmingLangRepository;
    }

    @Override
    public List<GetAllSubCategoriesResponse> getAll() {
        List<SubCategory> subCategories = this.subCategoryRepository.findAll();
        List<GetAllSubCategoriesResponse> subCategoriesResponses =
            new ArrayList<GetAllSubCategoriesResponse>();

        for (SubCategory subCategory : subCategories) {
            subCategoriesResponses.add(
                new GetAllSubCategoriesResponse(
                    subCategory.getId(),
                    subCategory.getName(),
                    subCategory.getProgrammingLang().getName())
            );
        }
        return subCategoriesResponses;
    }

    @Override
    public void add(CreateSubCategoryRequest createSubCategoryRequest) {
        SubCategory subCategory = new SubCategory();
        String subCategoryName = createSubCategoryRequest.getName();

        if (subCategoryName != "" && subCategoryName != null) {
            subCategory.setName(subCategoryName);
            subCategory.setProgrammingLang(
                this.programmingLangRepository.findById(
                    createSubCategoryRequest.getProgrammingLangId()
                ).get()
            );
            this.subCategoryRepository.save(subCategory);
        }
    }

    @Override
    public void update(UpdateSubCategoryRequest updateSubCategoryRequest) {
        SubCategory subCategory = this.subCategoryRepository.findById(
            updateSubCategoryRequest.getId()).get();

        String subCategoryName = updateSubCategoryRequest.getName();
        if (subCategoryName != "" && subCategoryName != null) {
            subCategory.setName(subCategoryName);
            subCategory.setProgrammingLang(
                this.programmingLangRepository.findById(
                    updateSubCategoryRequest.getProgrammingLangId()
                ).get()
            );
        }

        this.subCategoryRepository.save(subCategory);
    }

    @Override
    public void delete(DeleteSubCategoryRequest deleteSubCategoryRequest) {
        this.subCategoryRepository.deleteById(deleteSubCategoryRequest.getId());
    }
}
