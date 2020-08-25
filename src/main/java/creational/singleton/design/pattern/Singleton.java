package creational.singleton.design.pattern;

/*
  Singleton Pattern is a category of Creational pattern.

  Singleton design solution is where an application wants to have
  one and only one instance of any class.

  Please implement Singleton Design Pattern.

 */
public class Singleton {

    private volatile static Singleton singleton = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if(singleton == null ) {
                    singleton = new Singleton();
                    System.out.println("Initiated single instance");
                }
            }
        }
        return singleton;
    }

}
