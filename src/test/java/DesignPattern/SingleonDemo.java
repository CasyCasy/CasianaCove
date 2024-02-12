package DesignPattern;

public class SingleonDemo {
    public static void main (String []args)
    {
        SigleObject myObject = SigleObject.getInstance();
        myObject.showMessage();
    }


}
