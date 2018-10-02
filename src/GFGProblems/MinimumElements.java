package GFGProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 10/1/18.
 */
public class MinimumElements implements CommonProblemServices {

    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{1,3,5,7,9};
        return arr;
    }

    @Override
    public Object execute(Object node) {
       int[] arr = (int[]) node;
       return null;
    }

    @Override
    public void printResponse(Object result) {

    }
}
