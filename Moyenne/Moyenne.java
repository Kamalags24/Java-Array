package Moyenne;

public class Moyenne {
    public static void main(String[] args) {
        int ages[] = {20, 18, 22, 33, 54, 26, 12};

        double moy, sum = 0;
        int longueur = ages.length;

        for (int i : ages) {
            sum += i;
        }

        moy = sum / longueur;

        System.out.println("The average age is: " + moy);
    }
}
