package MyArray;

public class Myarray {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Mercedes"};
        int[] myNum = {10, 20, 30, 40};


        System.out.println(cars[2]);
        System.out.println(myNum[1]);
        
        cars[0]= "Toyota";
        System.out.println(cars[0]);

        System.out.println(cars.length);

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }


        for (int i=0; i<cars.length; i++) {
            System.out.println("L'élément a l'index " + i + " est: " + cars[i]);
        }


        for (int i : myNum) {
            System.out.println(i);
        }

        // for (int i : myNum) {
        //     for (int j = 0; j < myNum.length;) { 
        //         j++;
        //         System.out.println("L'élément a l'index " + j + " est: " + i);
        //     }
        // }

        
    }
}
