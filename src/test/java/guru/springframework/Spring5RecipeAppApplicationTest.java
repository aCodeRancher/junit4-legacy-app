package guru.springframework;

import guru.springframework.controllers.IndexController;
import guru.springframework.services.RecipeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)

class Spring5RecipeAppApplicationTest {

    @Autowired
    RecipeService recipeService;

    @Autowired
    IndexController indexController;

    @Test
    void recipeServiceNotNull() {
        Assertions.assertNotNull(recipeService);
    }

    @Test
    void indexControllerNotNull(){
        Assertions.assertNotNull(indexController);
    }
}