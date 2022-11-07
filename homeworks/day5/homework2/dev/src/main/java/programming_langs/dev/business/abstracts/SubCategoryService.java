package programming_langs.dev.business.abstracts;

import java.util.List;

import programming_langs.dev.business.requests.subCategoryRequests.CreateSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.DeleteSubCategoryRequest;
import programming_langs.dev.business.requests.subCategoryRequests.UpdateSubCategoryRequest;
import programming_langs.dev.business.responses.subCategoryResponses.GetAllSubCategoriesResponse;


public interface SubCategoryService {
    List<GetAllSubCategoriesResponse> getAll();
    void add(CreateSubCategoryRequest CreateProgrammingLangRequest);
    void update(UpdateSubCategoryRequest updateSubCategoryRequest);
    void delete(DeleteSubCategoryRequest deleteSubCategoryRequest);
}
