package programming_langs.dev.business.responses.programmingLangResponses;

import lombok.Data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLangsResponse {
    private int id;
    private String name;
    private List<String> subCategoriyNames;
}
