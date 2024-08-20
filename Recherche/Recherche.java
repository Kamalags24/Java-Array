package Recherche;

import java.util.Arrays;

public class Recherche {
    public static void main(String[] args) {
        int MyArray[] = {1, 3, 5, 7, 9};
        int search = Arrays.binarySearch(MyArray, 7);
        
        System.out.println(search);

    }
}
