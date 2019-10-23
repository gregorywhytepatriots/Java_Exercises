import org.w3c.dom.ls.LSOutput;

public class Constructor {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("Static block is called");
    }
    ConstructTest() {
        System.out.println("This is a constuctor");

    }
}

class Main {

    public static void Main(String args[]){
        ConstructTest t1 = new ConstructTest();
        ConstructTest t2 = new ConstructTest();
    }
}
