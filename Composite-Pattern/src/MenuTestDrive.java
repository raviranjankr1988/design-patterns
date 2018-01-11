public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner");
        MenuComponent dessertMenu = new Menu("DessertMenu", "Dessert");

        MenuComponent allMenus = new Menu("All Menus", "All Menu combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("pancake breakfast with egg",
                "pancake with scrambled eggs and toast",
                false, 2.99));

        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fake) Bacon with lettuce & tomato on whole wheat",
                true, 2.99));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple pie", "Apple pie desert",
                true,1.59));

        Waitress waitress = new Waitress(allMenus);

        //waitress.printMenu();

        waitress.printVegetarianMenu();
    }


}
