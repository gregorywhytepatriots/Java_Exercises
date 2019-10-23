import org.w3c.dom.ls.LSOutput;

public class MAIN {
    public static void main(String[] args) {
        Pet p = new Pet();
        p.feedAnimal();
    }

    class Mammal {

        System.out.println("Animal is fed");
        void petMammal(){
            System.out.println("Animal is Happy");
        }
    }
    class Animal extends Mammal{
        void FeedAnimal() {
            System.out.println("Animal is fed");
        }
    }

    class Pet extends Animal {
        Pet (){
            super();

        }
        void feedAnimal(){
            System.out.println("Pet is still Hungry");
        }
        void WalkAnimal(){
            FeedAnimal();
            super.feedAnimal();
        }
    }
}
