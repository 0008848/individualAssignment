package individualAssignment;
import java.util.Scanner;
   public class Answer5 {
        int partition (int array[], int start, int end){
            int pivot = array[end];
            int i = (start - 1);

            for (int j = start; j <= end - 1; j++){
                if (array[j] < pivot){
                    i++;
                    int element = array[i];
                    array[i] = array[j];
                    array[j] = element;
                }
            }
            int element = array[i+1];
            array[i+1] = array[end];
            array[end] = element;
            return (i + 1);
        }
        int[] quick(int[] array, int start, int end){
            if (start < end){
                int p = partition(array, start, end);
                quick(array, start, p - 1);
                quick(array, p + 1, end);
            }
            return array;
        }
        void display(int[] array, int n) {
            int i;
            for (i = 0; i < n; i++)
                System.out.print(array[i] + " ");
        }

        public static void binarySearch(int array[],int first,int last,int key){
            int mid=(first+last)/2;
            while(first<=last){
                if (array[mid]<key){
                    first=mid+1;
                }
                else if (array[mid]==key){
                    System.out.println("Element is found at index: " + mid);
                    break;
                }
                else{
                    last=mid-1;
                }
                mid=(first+last)/2;
            }
            if(first>last){
                System.out.println("Element is not found!");
            }
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int array[] = { 98, 43, 69, 67, 17, 59 };
            int n = array.length;
            Answer5 q1 = new Answer5();
            int[] array2=q1.quick(array, 0, n - 1);

            System.out.println("There are 6 elements in array:");

            System.out.println("Enter the search key:");
            int key=sc.nextInt();
            int last=array.length-1;
            binarySearch(array2,0,last,key);
            System.out.println();

            System.out.println("The elements are:");
            q1.display(array, n);

        }
    }

