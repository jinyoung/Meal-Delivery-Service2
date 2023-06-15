package meal.delivery.service.domain;

import meal.delivery.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "ingredients",
    path = "ingredients"
)
public interface IngredientRepository
    extends PagingAndSortingRepository<Ingredient, String> {}
