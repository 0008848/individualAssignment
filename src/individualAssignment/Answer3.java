package individualAssignment;
import java.util.Scanner;
public class Answer3 {
    public static void main(String args[]) {
        int n=5;
        String temp;
        System.out.println("Enter five  names:");
        Scanner sc = new Scanner(System.in);
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in Sorted Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(names[i]);
        }
        System.out.println(names[n - 1]);
    }
}
