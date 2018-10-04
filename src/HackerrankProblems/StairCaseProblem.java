package HackerrankProblems;

import CommonService.CommonProblemServices;

/**
 * Created by zedray on 10/4/18.
 */
public class StairCaseProblem implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] input = new int[1];
        input[0] = 3;

        return input;
    }

    @Override
    public Object execute(Object node) {
        int[] inputs = (int[]) node;
        int[] results = new int[inputs.length];
        for(int i = 0;i<inputs.length;i++){

            int[] sums = new int[inputs[i]];
            results[i] = countClimbWays(inputs[i]);
        }

        return results;
    }

    private int countClimbWays(int number){

//        if(number < 0)
//            return 0;
//
//        if(number == 0){
//            return 1;
//        }
//
//        int ways = countClimbWays(number-1)+countClimbWays(number-2)+countClimbWays(number-3);
//
//        return (int) (ways % 10000000007L);

        if(number == 0 || number == 1)
            return 1;

        int[] sums = new int[number+1];
        sums[0] = sums[1] = 1;
        sums[2] = 2;


        for(int j = 3;j<=number;j++){
            sums[j] = sums[j-1] + sums[j-2] + sums[j-3];
        }


        return sums[sums.length-1];

    }

    @Override
    public void printResponse(Object result) {

        int[] results = (int[]) result;
        for (int i:results) {
            System.out.println(i);
        }

    }
}
