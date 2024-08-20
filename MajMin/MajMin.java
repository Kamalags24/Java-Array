package MajMin;

import java.util.Arrays;

import MyArray.Myarray;

public class MajMin {
    public static void main(String[] args) {
        int MyArray[] = {3, 5, 7, 2, 8};
        Arrays.sort(MyArray);

        int Min = MyArray[0];
        int Max = MyArray[MyArray.length-1];

        System.out.println("Le plus petit nombre min est: " + Min );
        System.out.println("Le plus grand nombre max est: " + Max );
        // System.out.println(Math.max(2.0, 0.25));
    }
}
