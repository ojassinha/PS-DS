package GFGProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 11/17/18.
 */
public class BinarySearch implements CommonProblemServices {

    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{1,4,6,23,29,51,72,102};

        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;
        return BSUtil(arr,0,7,29);
    }

    private int BSUtil(int[] arr, int l,int h,int element){

        int mid = (l+h)/2;
        if(arr[mid] == element){
            return mid;
        }

        if(element > arr[l] && element <= arr[mid-1]){
            return BSUtil(arr,l,mid,element);
        }

        return BSUtil(arr,mid,h,element);
    }

    @Override
    public void printResponse(Object result) {

        System.out.println(result);

    }
}
