package models;

public interface Ingredients {

    //this lists the meths that any class who implements it,
    //MUST define or have these meths

    Ingredient findById(long id);

    // if we create an ingredient, return the id so we can
    // do stuff w it

    long createIngredient(Ingredient ingredient);
}
