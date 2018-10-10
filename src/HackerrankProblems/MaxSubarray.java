package HackerrankProblems;

import CommonService.CommonProblemServices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by zedray on 10/3/18.
 */
public class MaxSubarray implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
//        File file = new File("/Users/zedray/Documents/data.rtf");
//
//        int[] arr = new int[1000000];
//        try  {
//            boolean x = file.canRead();
//
//            Scanner scan = new Scanner(file);
//             int i = 0;
//            while (scan.hasNextInt()){
//                arr[i] = scan.nextInt();
//                i++;
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        int[] arr = new int[]{2,1,5,8,4};


        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;

        return calculatemax(arr);

    }


    // This method also works and is an alternative solution found on geeksforgeeks

//    int FindMaxSum(int arr[], int n)
//    {
//        int incl = arr[0];
//        int excl = 0;
//        int excl_new;
//        int i;
//
//        for (i = 1; i < n; i++)
//        {
//            /* current max excluding i */
//            excl_new = (incl > excl) ? incl : excl;
//
//            /* current max including i */
//            incl = excl + arr[i];
//            excl = excl_new;
//        }
//
//        /* return max of incl and excl */
//        return ((incl > excl) ? incl : excl);
//    }

    private int calculatemax(int[] arr) {
        int[] sum = new int[arr.length + 1];

        if(arr.length == 1){
            return sum[0];
        }

        if(arr.length == 2){
            return Math.max(sum[0],sum[1]);
        }

        sum[0] = arr[0];
        sum[1] = Math.max(arr[0],arr[1]);

        for (int i = 2; i < arr.length ; i++) {
            sum[i] = Math.max(sum[i - 2] + arr[i], sum[i - 1]);
        }

        return sum[arr.length-1];

    }


    @Override
    public void printResponse(Object result) {

        System.out.print(result);
    }
}
