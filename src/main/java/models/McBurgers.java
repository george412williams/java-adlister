package models;

public interface McBurgers {

    //this lists the meths that any class who implements it,
    //MUST define or have these meths


    McBurger findById(long id);
        // the daofactory will have this want to be able to call burger by its id
        // wo touching the models themselves; like vacuum tank gloves

        // if we create a burger, return the id so we can
        // do stuff w it

    long createBurger(McBurger burgerNew);
        // this instantiantes a burger object
        // call this method which gives it the id w auto incriment
        // the dao interface will handle giving it the id
        // we send in a burger obj w a title, descript...
        // want to have your code do auto add as much as possible, eff!
        // w spring can do auto increm in there
}
