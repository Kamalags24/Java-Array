package Triage;

import java.util.Arrays;

public class Triage {
    public static void main(String[] args) {
        int myNumber[] = {5, 2, 9, 1, 5, 6};
        Arrays.sort(myNumber);

        for (int i : myNumber) {
            System.out.println(i);
        }
    }
}
