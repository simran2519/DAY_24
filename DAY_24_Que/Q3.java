//
//3.Given an array of integers A.  There is a sliding window of size B which
//
//        is moving from the very left of the array to the very right.
//
//        You can only see the w numbers in the window. Each time the sliding window moves
//
//        rightwards by one position. You have to find the maximum for each window.
//
//        The following example will give you more clarity.
//
//        The array A is [1 3 -1 -3 5 3 6 7], and B is 3.
//
//        Window position			Max
//        ———————————-			————————-
//        [1  3  -1] -3  5  3  6  7	3
//        1 [3  -1  -3] 5  3  6  7	3
//        1  3 [-1  -3  5] 3  6  7	5
//        1  3  -1 [-3  5  3] 6  7	5
//        1  3  -1  -3 [5  3  6] 7	6
//        1  3  -1  -3  5 [3  6  7]	7
//        Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].
//
//        Note: If B > length of the array, return 1 element with the max of the array.
//
//
//
//
//        Input Format
//
//        The first argument given is the integer array A.
//        The second argument given is the integer B.
//        Output Format
//
//        Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1]
//        For Example
//
//        Input 1:
//        A = [1, 3, -1, -3, 5, 3, 6, 7]
//        B = 3
//        Output 1:
//        C = [3, 3, 5, 5, 6, 7]
package DAY_24_Que;

import java.util.Scanner;
import java.util.Vector;

public class Q3
{
    public static void maxinWindow(int arr[],int windowSize)
    {
        Vector<Integer>vec = new Vector<>();
        int count=0;
        int index=0;
        int flag=0;
        while(flag!=1)
        {
            int max=arr[index];
            for(int j=0;j<windowSize;j++)
            {
                if(arr[index]>max)
                {
                    max=arr[index];
                }
                index++;
            }
            vec.add(max);
            count++;
            if(index==arr.length)
            {
                flag=1;
            }
            else
            {
                index=count;
                System.out.println(index);
            }
        }
        System.out.println(vec);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the window size");
        int windowsize= sc.nextInt();
        maxinWindow(arr,windowsize);
    }
}
