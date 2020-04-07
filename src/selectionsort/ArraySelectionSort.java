package selectionsort;
import java.util.Scanner;

public class ArraySelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("enter the 5 elements in an array:");
        for(int i=0;i<5;i++) {
            a[i]=scanner.nextInt();
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<5;i++) {
            System.out.print(a[i]+ ",");
        }
        for(int i=0;i<5-1;i++) {
            int min = a[i];
            int pos = i;
            for(int j=i;j<5;j++) {
                if(a[j]<min) {
                    min=a[j];
                    pos=j;

                }
            }
            //swapping
            int t=a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println("\nsorted array is:");
        for(int i=0;i<5;i++) {
            System.out.print(a[i]+ ",");
        }
    }
}
