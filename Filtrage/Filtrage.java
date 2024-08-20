package Filtrage;


public class Filtrage {
    public static void main(String[] args) {
        int myNum[] = {1, 2, 3, 4, 5, 6};

       for (int i : myNum) {
        if (i % 2 ==0) {
            System.out.println(i);            
        }
       }

    //    for (int i = 0; i < myNum.length; i % 2 ==0) {
    //     System.out.println(i);
    //    }
    }
}
