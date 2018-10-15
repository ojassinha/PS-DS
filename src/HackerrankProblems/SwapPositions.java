package HackerrankProblems;

import CommonService.CommonProblemServices;

import java.util.Scanner;

/**
 * Created by zedray on 10/11/18.
 */
public class SwapPositions implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();

        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;

        int max = -1;
//        for(int i =0;i<arr.length;i++){
//            if(arr[i] > max)
//                max =arr[i];
//        }
//
//        int[] hashArr = new int[max];
//
//        int countOfSwap = 0;
//        for(int i =0;i<max;i++){
//            if(arr[i] != i+1 && arr[i] > i){
//
//                if(arr[i] - i-1 > 2)
//                    return -1;
//                countOfSwap += arr[i] - i-1;
//            }
//        }

        int ans = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] - (i + 1) > 2) {


                return -1;
            }
            for (int j = Math.max(0, arr[i] - 2); j < i; j++)
                if (arr[j] > arr[i]) ans++;
        }


        return  ans;
    }

    @Override
    public void printResponse(Object result) {
        int num = (int) result;
        if(num == -1)
            System.out.print("Too chaotic");
        else
        System.out.println(result);
    }
}
