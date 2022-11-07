package programming_langs.dev.business.requests.programmingLangRequests;

import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLangRequest {
    private String name;
}