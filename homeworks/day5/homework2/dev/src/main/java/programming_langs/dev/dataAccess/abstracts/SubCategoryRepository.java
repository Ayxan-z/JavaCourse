package programming_langs.dev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import programming_langs.dev.entities.SubCategory;


public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer> {
    
}
