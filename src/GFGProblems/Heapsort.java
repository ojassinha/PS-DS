package GFGProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 11/19/18.
 */
public class Heapsort implements CommonProblemServices {

    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{4,10,3,5,1};
        return arr;
    }

    @Override
    public Object execute(Object node) {
        int[] arr = (int[]) node;

        for(int i = arr.length/2 -1; i >=0 ;i--){
            heapify(arr,i);
        }

        return arr;
    }

    public void heapify(int[] arr,int i){

        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if(l< arr.length && arr[l] > arr[largest]){
            largest = l;
        }

        if(r < arr.length && arr[r] > arr[largest] ){
            largest = r;
        }

        if(largest != i){

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,largest);
        }

    }

    @Override
    public void printResponse(Object result) {

    }
}
