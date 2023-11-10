package day32_constructor;



public class ChainExample {
    int a;



    //this()

    public ChainExample () {
        System.out.println("First");
    }

    public ChainExample (int i) {
        this(); // This is to help up to chain constructors / connect them
        System.out.println("Second");
        a = i;
    }

    public ChainExample (String str) {
        this(6); //
        System.out.println("Third");
    }

}
