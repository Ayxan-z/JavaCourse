package programming_langs.dev.business.abstracts;

import java.util.List;

import programming_langs.dev.business.requests.programmingLangRequests.CreateProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.DeleteProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.UpdateProgrammingLangRequest;
import programming_langs.dev.business.responses.programmingLangResponses.GetAllProgrammingLangsResponse;


public interface ProgrammingLangService {
    List<GetAllProgrammingLangsResponse> getAll();
    void add(CreateProgrammingLangRequest createProgrammingLangRequest);
    void update(UpdateProgrammingLangRequest updateProgrammingLangRequest);
    void delete(DeleteProgrammingLangRequest deleteProgrammingLangRequest);
}
