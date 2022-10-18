package Interface;

import Modelo.Category;
import org.springframework.data.repository.CrudRepository;



public interface CategoryInterface extends CrudRepository< Category, Integer>{
    
}

