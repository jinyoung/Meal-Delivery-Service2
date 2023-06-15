package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.DataManagementApplication;
import meal.delivery.service.domain.IngredientCreated;

@Entity
@Table(name = "Ingredient_table")
@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ingredientId;

    private String name;

    private Float quantity;

    private String unit;

    @PostPersist
    public void onPostPersist() {
        IngredientCreated ingredientCreated = new IngredientCreated(this);
        ingredientCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static IngredientRepository repository() {
        IngredientRepository ingredientRepository = DataManagementApplication.applicationContext.getBean(
            IngredientRepository.class
        );
        return ingredientRepository;
    }
}
