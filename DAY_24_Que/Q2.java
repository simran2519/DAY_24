//
//2.Given an array of integers A .
//
//        A represents a histogram i.e A[i] denotes height of the ith histogram's bar. Width of each bar is 1.
//
//        Find the area of the largest rectangle formed by the histogram.

//        Problem Constraints
//        1 <= |A| <= 100000
//
//        1 <= A[i] <= 1000000000
//
//        Input Format
//        The only argument given is the integer array A.

//        Output Format
//        Return the area of largest rectangle in the histogram.

//        Example Input
//        Input 1:
//
//        A = [2, 1, 5, 6, 2, 3]
//        Input 2:
//
//        A = [2]
//
//
//        Example Output
//        Output 1:
//
//        10
//        Output 2:
//        2

//        Example Explanation
//        Explanation 1:
//
//        The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
//        Explanation 2:
//
//        Largest rectangle has area 2.
package DAY_24_Que;
import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
import java.util.Stack;

public class Q2
{
   public static int Arae(int arr[] ,int n)
    {
        int result = 0;
        for(int i=0 ;i<n;i++)
        {
            int curr = arr[i];
            for(int j = i-1;j>=arr[i] ;j--)
            {
                if(arr[j] >= arr[i])
                {
                    curr = curr + arr[i];
                }
                else
                {
                    break;
                }
            }
            for (int j = i+1;j<n;j++)
            {
                if(arr[j] >= arr[i])
                {
                    curr += arr[i];
                } else
                {
                    break;
                }
            }
            result = Math.max(result, curr);
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the element of array : ");
        for(int i=0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Q2 obj = new Q2();
        System.out.println(obj.Arae(arr,n));
    }
}