package meal.delivery.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateRecipeCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String recipeName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String description;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String ingredients;
}
