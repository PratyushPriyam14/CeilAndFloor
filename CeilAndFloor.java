//by the concept of binary search
import java.io.*;
import java.util.*;
public class CeilAndFloor
{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int data=s.nextInt();
        int ceil=0;
        int floor=0;
        int low=0;
        int high= arr.length-1;
        while(low<=high) {
            int mid = (low + high) / 2;
            if (data < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else if (data > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
            System.out.println(ceil);
            System.out.println(floor);
    }
}
