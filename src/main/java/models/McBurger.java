package models;


import java.io.Serializable;
import java.util.List;


// this bean will represent an indiv burger
// it must implement the serializable class,
// serializing, take data thru a hash and serialize into string to go back/forth btwn things
// beans must implement Serializable

public class McBurger implements Serializable {

// ******* CLASS PROPERTIES ************** //

    // id
    // burger name (title)
    // price in cents, int fine here, long not necessary
    // descript of burger
    // ingredients (list, arraylist)

    // to set up, first set up properties individually

    private long id;
    private String title;
    private int priceInCents;
    private String description;
    private List<Ingredient> ingredients;
        // storing the ingredients of ea burger here

    //next setup constructor for this class cmdN
        // doing this way bc, don't need spec args, use any
            // so java can reserve space in memory for when it's created and defined
        // when you instantiate a burger saying:
        // McBurger thisBurger = new McBurger(); and can add stuff later

// ******* CONSTRUCTOR ************** //

    public McBurger() {}

// ******* GTRS/STRS ************** //

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public int getPriceInCents() { return priceInCents; }

    public void setPriceInCents(int priceInCents) { this.priceInCents = priceInCents; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<Ingredient> getIngredients() { return ingredients; }

    public void setIngredients(List<Ingredient> ingredients) { this.ingredients = ingredients; }
}
