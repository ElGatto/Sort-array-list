import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void sort(ArrayList<Integer> list) {
        // Sorting the list in ascending order
        list.sort(null);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        // Collect 5 numbers from user
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            numList.add(num);
        }

        // Calling sort method to sort the list
        sort(numList);

        // Printing elements in sorted order
        System.out.println("Numbers in increasing order:");
        for (int i = 0; i < numList.size(); i++) {
            System.out.print(numList.get(i) + " ");
        }
    }
}
