package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import meal.delivery.service.RecipeApplication;
import meal.delivery.service.domain.RecipeCreated;

@Entity
@Table(name = "Recipe_table")
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String recipeId;

    private String recipeName;

    private String description;

    private String ingredients;

    @PostPersist
    public void onPostPersist() {
        RecipeCreated recipeCreated = new RecipeCreated(this);
        recipeCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RecipeRepository repository() {
        RecipeRepository recipeRepository = RecipeApplication.applicationContext.getBean(
            RecipeRepository.class
        );
        return recipeRepository;
    }
}
