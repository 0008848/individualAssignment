package individualAssignment;
import java.util.Scanner;
public class Answer2 {
        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the first number : ");
            int first= in.nextInt();
            System.out.print("Enter the second number: ");
            int second = in.nextInt();
            System.out.println("Result: "+result(first,second));
        }
        public static int result(int f, int s)
        {
            if(f == s)
                return 0;
            if(f % 7 == s % 7)
                return (f < s) ? f : s;
            return (f > s) ? f : s;
        }
    }

