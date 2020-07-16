package models;

import java.io.Serializable;
import java.util.List;

public class ListIngredients implements Serializable {

    private List<Ingredient> ingredients;

    @Override
    public Ingredient findById(long id);
    // the daofactory will have this want to be able to call burger by its id
    // wo touching the models themselves; like vacuum tank gloves

    // if we create a burger, return the id so we can
    // do stuff w it

    @Override
    public long createIngredient(Ingredient ingredient){
        return 0;
    };
}
