package selectionsort;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {10,9,8,7,15,19,1,5,25,30};
        int n = a.length;
        System.out.println("\nunsorted array is:");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+ ",");
        }
        for(int i=0;i<n-1;i++) {
            // for finding minimum
            int min = a[i];
            int pos = i;
            for(int j=i;j<n;j++) {
                if(a[j]<min) {
                    min = a[j];
                    pos = j;
                }
            }
            //swapping
            int t = a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        System.out.println("\nunsorted array is:");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+ ",");
        }






    }
}
