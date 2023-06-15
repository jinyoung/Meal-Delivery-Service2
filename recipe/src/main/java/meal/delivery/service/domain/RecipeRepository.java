package meal.delivery.service.domain;

import meal.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "recipes", path = "recipes")
public interface RecipeRepository
    extends PagingAndSortingRepository<Recipe, String> {}
