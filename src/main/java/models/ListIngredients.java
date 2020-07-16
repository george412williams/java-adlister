package models;

import java.io.Serializable;
import java.util.List;

public class ListIngredients implements Ingredients {

    private List<Ingredient> ingredients;

    // constructor for any time we initialize this class:
    public ListIngredients(){
        // pickles x3
        // tomatoes x2
        // cheese x1
        // patty x1
        // bun x2
        Ingredient pickles = new Ingredient();
        pickles.setId(1);
        pickles.setTitle("Pickles x3");
        pickles.setQuantity(3);
        // now add to the array list to access later
        ingredients.add(pickles);

        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2);
        tomatoes.setTitle("Tomatoes x2");
        tomatoes.setQuantity(2);
        // add to arraylist
        ingredients.add(tomatoes);

        Ingredient cheese = new Ingredient();
        cheese.setId(3);
        cheese.setTitle("Cheese x1");
        cheese.setQuantity(1);
        ingredients.add(cheese);

        Ingredient patty = new Ingredient();
        patty.setId(4);
        patty.setTitle("Patty x1");
        patty.setQuantity(1);
        ingredients.add(patty);

        Ingredient bun = new Ingredient();
        bun.setId(5);
        bun.setTitle("Bun x2");
        bun.setQuantity(2);
        ingredients.add(bun);

    }

    @Override
    public Ingredient findById(long id){
        return ingredients.get((int)id - 1);
        // [the array of things to demonstrate indexing problem]
    }

    // the daofactory will have this want to be able to call burger by its id
    // wo touching the models themselves; like vacuum tank gloves

    // if we create an ingredient, return the id so we can
    // do stuff w it

    @Override
    public long createIngredient(Ingredient ingredient){
        ingredient.setId(ingredients.size() + 1);
        ingredients.add(ingredient);
        return ingredient.getId();
    }
}
