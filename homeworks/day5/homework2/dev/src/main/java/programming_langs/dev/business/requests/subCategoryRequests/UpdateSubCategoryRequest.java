package programming_langs.dev.business.requests.subCategoryRequests;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSubCategoryRequest {
    private int id;
    private int programmingLangId;
    private String name;
}
