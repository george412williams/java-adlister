package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgers {

    private List<McBurger> burgers = new ArrayList<>();

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
