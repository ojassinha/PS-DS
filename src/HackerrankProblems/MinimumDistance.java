package HackerrankProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 10/16/18.
 */
public class MinimumDistance implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{3,2,1,2,3};
        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;
        int max = -1;
        for(int a:arr){
            if(max < a)
                max = a;
        }

        int[] hashArr = new int[max+1];

        for(int i =0;i<hashArr.length;i++){
            hashArr[i] = -1;
        }

        for(int i = 0;i<arr.length;i++){
            if(hashArr[arr[i]] == -1)
                hashArr[arr[i]] = i;
        }

        int min = Integer.MAX_VALUE;

        for(int i = arr.length-1;i>=0;i--){
            if(hashArr[arr[i]] != -1){
                int diff  = i - hashArr[arr[i]];
                if(diff < min && diff != 0){
                    min = diff;
                }
            }
        }

        return min;
    }

    @Override
    public void printResponse(Object result) {

        System.out.print(result);

    }
}
