package programming_langs.dev.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import programming_langs.dev.business.abstracts.ProgrammingLangService;
import programming_langs.dev.business.requests.programmingLangRequests.CreateProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.DeleteProgrammingLangRequest;
import programming_langs.dev.business.requests.programmingLangRequests.UpdateProgrammingLangRequest;
import programming_langs.dev.business.responses.programmingLangResponses.GetAllProgrammingLangsResponse;
import programming_langs.dev.dataAccess.abstracts.ProgrammingLangRepository;
import programming_langs.dev.entities.ProgrammingLang;
import programming_langs.dev.entities.SubCategory;


@Service
public class ProgrammingLangManager implements ProgrammingLangService {
    private ProgrammingLangRepository programmingLangRepository;

    @Autowired
    public ProgrammingLangManager(ProgrammingLangRepository programmingLangRepository) {
        this.programmingLangRepository = programmingLangRepository;
    }

    @Override
    public List<GetAllProgrammingLangsResponse> getAll() {
        List<ProgrammingLang> programmingLangs = this.programmingLangRepository.findAll();
        List<GetAllProgrammingLangsResponse> programmingLangsResponses =
            new ArrayList<GetAllProgrammingLangsResponse>();

        for (ProgrammingLang programmingLang : programmingLangs) {
            List<String> subCategoryNames = new ArrayList<String>();
            for (SubCategory subCategory : programmingLang.getSubCategories()) {
                subCategoryNames.add(subCategory.getName());
            }
            programmingLangsResponses.add(
                new GetAllProgrammingLangsResponse(
                    programmingLang.getId(),
                    programmingLang.getName(),
                    subCategoryNames)
            );
        }
        return programmingLangsResponses;
    }

    @Override
    public void add(CreateProgrammingLangRequest createProgrammingLangRequest) {
        ProgrammingLang programmingLang = new ProgrammingLang();

        String programmingLangName = createProgrammingLangRequest.getName();
        if (programmingLangName != "" && programmingLangName != null) {
            programmingLang.setName(programmingLangName);
            this.programmingLangRepository.save(programmingLang);
        }
    }

    @Override
    public void update(UpdateProgrammingLangRequest updateProgrammingLangRequest) {
        ProgrammingLang programmingLang = this.programmingLangRepository.findById(
            updateProgrammingLangRequest.getId()
        ).get();

        String programmingLangName = updateProgrammingLangRequest.getName();
        if (programmingLangName != "" && programmingLangName != null) {
            programmingLang.setName(programmingLangName);
            this.programmingLangRepository.save(programmingLang);
        }
    }

    @Override
    public void delete(DeleteProgrammingLangRequest deleteProgrammingLangRequest) {
        this.programmingLangRepository.deleteById(deleteProgrammingLangRequest.getId());
    }
}
