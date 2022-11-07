package programming_langs.dev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import programming_langs.dev.entities.ProgrammingLang;


public interface ProgrammingLangRepository extends JpaRepository<ProgrammingLang, Integer> {
    
}
