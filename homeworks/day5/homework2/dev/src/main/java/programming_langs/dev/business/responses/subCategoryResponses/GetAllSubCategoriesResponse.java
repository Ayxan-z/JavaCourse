package programming_langs.dev.business.responses.subCategoryResponses;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubCategoriesResponse {
    private int id;
    private String name;
    private String programmingLangName;
}