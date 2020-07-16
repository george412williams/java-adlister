package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgers implements McBurgers{

    private List<McBurger> burgers = new ArrayList<>();

    public ListBurgers() {
        // use ingredients already made, make burgers


        // grab ingredients (before we make the burger)
        Ingredient pickles = DaoFactory.getIngredients().findById(1);
        Ingredient tomatoes = DaoFactory.getIngredients().findById(2);
        Ingredient cheese = DaoFactory.getIngredients().findById(3);
        Ingredient patty = DaoFactory.getIngredients().findById(4);
        Ingredient bun = DaoFactory.getIngredients().findById(5);

        ArrayList<Ingredient> bigMacIngredients = new ArrayList<>();
        // instantiate new burger
        McBurger bigMac = new McBurger(); // reserving its space
        bigMac.setId(1);
        bigMac.setTitle("Big Mac");
        bigMac.setDescription("Big burger with secret sauce");
        bigMac.setPriceInCents(350);
        // define what ingredients are in this burger
        bigMacIngredients.add(patty);
        bigMacIngredients.add(patty);
        bigMacIngredients.add(bun);
        bigMacIngredients.add(cheese);
        bigMacIngredients.add(pickles);
        bigMac.setIngredients(bigMacIngredients);
        burgers.add(bigMac);

        ArrayList<Ingredient> qpIngredients = new ArrayList<>();

        McBurger quarterPounder = new McBurger();

        quarterPounder.setId(2);
        quarterPounder.setTitle("Quarter Pounder");
        quarterPounder.setDescription("The classic go-to when you need protein.");
        quarterPounder.setPriceInCents(300);
        // define what ingredients are in this burger
        qpIngredients.add(patty);
        qpIngredients.add(patty);
        qpIngredients.add(bun);
        qpIngredients.add(cheese);
        qpIngredients.add(pickles);
        quarterPounder.setIngredients(qpIngredients);
        burgers.add(quarterPounder);

        ArrayList<Ingredient> homestyleIngredients = new ArrayList<>();
        McBurger homestyle = new McBurger();
        homestyle.setId(1);
        homestyle.setTitle("Homestyle Burger");
        homestyle.setDescription("The one that got away...");
        homestyle.setPriceInCents(250);
        homestyleIngredients.add(patty);
        homestyleIngredients.add(bun);
        homestyleIngredients.add(pickles);
        homestyleIngredients.add(cheese);
        homestyle.setIngredients(homestyleIngredients);
        burgers.add(homestyle);



    }


    //from mcburgers
    @Override
    public McBurger findById(long id){
        // get the McBurger at the index 'id'
            // where id's need to start at 1
            // ['1' = bigMac, '2' is quarterPounder...
        // return list of burgers at correct id index
        return burgers.get((int)id - 1);
    }

    @Override
    public long createBurger(McBurger burgerNew){
        // need to determine what the id will be of this new burger
        // if adding to arraylist, need +1 to size of
        // arraylist burgers which assure unique ids
        burgerNew.setId(burgers.size() + 1);
            // auto id set here
        // need to add to arraylist
        burgers.add(burgerNew);
            // which now saves this whole burger object to the arraylist

        // return id of our new burger
        return burgerNew.getId();
    }
}
