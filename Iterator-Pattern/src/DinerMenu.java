public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int noofItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fake) Bacon with lettuce & tomato on whole wheat",
                true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);


    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        if(noofItems >= MAX_ITEMS){
            System.err.println("Menu is full");
        } else {

            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[noofItems] = menuItem;
            noofItems++;
        }
    }

//not needed after implementation of iterator
    //    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }

}
