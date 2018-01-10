import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("pancake breakfast with egg",
                "pancake with scrambled eggs and toast",
                false, 2.99);

        addItem("regular pancake breakfast",
                "pancake with fried eggs and sausage",
                false, 2.99);

        addItem("blueberry pancake",
                "pancake made with fresh blueberries",
                true, 3.49);

        addItem("waffles",
                "waffles with blueberries or strawberries",
                true, 3.59);

    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //not needed after implementation of iterator
//    public ArrayList<MenuItem> getMenuItems() {
//        return menuItems;
//    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }


}
