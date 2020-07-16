package models;



// this dao class will provide access to our model data
// but will not require accessing the ListBurgersDao / List ingereddao
// directly, instead will reference those interfaces
    // 3 steps
        // set up a value
        // set up meths
        // #3? find out below
public class DaoFactory {

    //access the interface, not base level of the data
    public static McBurgers McBurgersDao;

    // set up method
    public static McBurgers getMcBurgersDao() {
        // will check if empty, if not will get it,
            // from reserving memory the empty method for ex
        // routing the traffic here
        if (McBurgersDao == null) {
            McBurgersDao = new ListBurgers();
        }
        return McBurgersDao;
    }

    public static Ingredients ingredients;

    public static Ingredients getIngredients(){
        if (ingredients == null) {
            ingredients = new ListIngredients();
        }
        return ingredients;
    }

    public static void main(String[] args) {
        // DaoFactory.McBurgersDao.findById(2);
                // we can have an update or delete option like

        Ingredient cheese = DaoFactory.getIngredients().findById(3);
        System.out.println(cheese.getTitle());
    }


}
