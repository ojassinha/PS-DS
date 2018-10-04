package HackerrankProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 10/3/18.
 */
public class MaxSubarray implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{3, 7, 4, 6, 5};
        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;

        return calculatemax(arr);

    }

    private int[] calculatemax(int[] arr) {
        int[] sum = new int[arr.length + 1];

        sum[0] = arr[0];
        sum[1] = arr[1];
        if (arr.length <= 1) {
            return sum;
        }

        for (int i = 2; i < arr.length ; i++) {
            sum[i] = Math.max(sum[i - 2] + arr[i], sum[i - 1]);

        }

        return sum;
    }


    @Override
    public void printResponse(Object result) {

        int[] resultArr = (int[]) result;
        int sum = -1000;
        for (int i : resultArr) {
            if(sum < i)
                sum = i;
        }

        System.out.print(sum);
    }
}
