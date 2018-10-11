package HackerrankProblems;

import CommonService.CommonProblemServices;
import Models.ArrayRotationRequestBody;

import java.util.Arrays;

/**
 * Created by zedray on 10/11/18.
 */
public class ArrayRotation implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{3,4,5,6,7,8,9,10};
        int d= 4;
        ArrayRotationRequestBody request = new ArrayRotationRequestBody();
        request.setArr(arr);
        request.setD(d);
        return request;
    }

    @Override
    public Object execute(Object request) {
        ArrayRotationRequestBody arr = (ArrayRotationRequestBody) request;
        int d = arr.getD();
        int[] a = arr.getArr();
        int[] tempArr = new int[d];
        for(int i = 0;i<d;i++){
            tempArr[i] = a[i];
        }

        for(int i = d;i<a.length ;i++){
            a[i-d] = a[i];
        }

        for(int i = a.length-d ;i < a.length;i++){
            a[i] = tempArr[i - a.length + d];
        }


        return a;

    }

    @Override
    public void printResponse(Object result) {

        int[] arr = (int[]) result;
        Arrays.stream(arr).forEach(a -> System.out.print(a+ " "));

    }
}
