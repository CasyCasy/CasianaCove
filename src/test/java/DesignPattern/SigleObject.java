package DesignPattern;

public class SigleObject {
    private static SigleObject instance = new SigleObject();

     private SigleObject()  {};

     public static SigleObject getInstance()
     {
         return instance;
     }

     public void showMessage ()

     {
         System.out.println("Hello from Singleton");
     }
}
