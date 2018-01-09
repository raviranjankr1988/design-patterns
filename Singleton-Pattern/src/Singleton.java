public class Singleton {

    //method 1 to solve multithreading issue
    /*
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance(){

        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    */

    //method 2 to solve multithreading issue
    /*
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        return singleton;
    }
    */

    //method 3 to solve multithreading issue
    //double checked locking
    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
