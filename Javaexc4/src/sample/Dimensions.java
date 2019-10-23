package sample;

public class Dimensions {
    static int i;
    int j;
    static {
        i = 150;
    }

    Dimensions(String str){
        System.out.println(str);
    }

    Dimensions(int num){
        System.out.println(num);
    }
}
