package game;

import algorithim.search.BinarySearch;
import algorithim.search.BinarySearchString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BinarySearchString binaryString = new BinarySearchString();

    Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word from the following list: 'The', 'Why', 'No', 'Hi', 'Hello'");
    String key = input.next();

    String array[] = {"The", "No", "Why"," Hi"};
     Arrays.sort(array);



    int searchIndex = binaryString.binarySearchString(array, key);

        System.out.println(searchIndex != -1 ? array[searchIndex] + " Index is " + searchIndex : "Not found");



    }
    /*    BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch.binarySearch(arr, 0, n-1, x);
        if (result == -1){
            System.out.println("Element is not present");
        }
        else
            System.out.println("Element is found at index" + result);
    }*/
}
