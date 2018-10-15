package GFGService;

import Common.QueueItemWithIndex;
import Common.Tree;
import CommonService.CommonProblemServices;
import HackerrankProblems.*;
import Models.ArrayRotationRequestBody;
import Models.HuffmanRequestBody;
import Models.LCARequestBody;

import java.util.Map;

/**
 * Created by zedray on 8/1/18.
 */
public class GFGProblemsImpl  implements IGFGProblems{


    @Override
    public void runDjikstraAlgo() {
    }

    @Override
    public void runTreeTopView() {

        CommonProblemServices treeTop = new TreeTopView();

        // Create the request body for the tree top view
        Tree root = (Tree) treeTop.createRequestBody();

        // create the response map containing the
        Map<Integer, Integer> result = (Map<Integer, Integer>) treeTop.execute(root);

        if(result != null){
            treeTop.printResponse(result);
        }

    }

    @Override
    public void runLCA() {

        CommonProblemServices treeLCA = new GFGProblems.LCA();

        LCARequestBody requestBody = (LCARequestBody) treeLCA.createRequestBody();

        int response = (int) treeLCA.execute(requestBody);

        treeLCA.printResponse(response);


    }

    @Override
    public void runMaxSum() {

        CommonProblemServices maxSum = new MaxSubarray();

        int[] arr = (int[]) maxSum.createRequestBody();

        int resultArr = (int) maxSum.execute(arr);

        maxSum.printResponse(resultArr);
    }

    @Override
    public void runStaircase() {
        CommonProblemServices staircase = new StairCaseProblem();
        int[] inputs = (int[]) staircase.createRequestBody();
        int[] result = (int[]) staircase.execute(inputs);
        staircase.printResponse(result);
    }

    @Override
    public void runCheckBST() {
        CommonProblemServices checkbst = new CheckBST();
        Tree inputs = (Tree) checkbst.createRequestBody();
        boolean result = (boolean) checkbst.execute(inputs);
        checkbst.printResponse(result);
    }

    @Override
    public void runHuffman() {

        CommonProblemServices huffman = new HuffmanDecoding();
        HuffmanRequestBody inputs = (HuffmanRequestBody) huffman.createRequestBody();
        String result = (String) huffman.execute(inputs);
        huffman.printResponse(result);

    }

    @Override
    public void runArrayRotation() {

        CommonProblemServices arrayRotation = new ArrayRotation();
        ArrayRotationRequestBody inputs = (ArrayRotationRequestBody) arrayRotation.createRequestBody();
        int[] result = (int[]) arrayRotation.execute(inputs);
        arrayRotation.printResponse(result);
    }

    @Override
    public void runSwapPosition() {
        CommonProblemServices swapPosition = new SwapPositions();
        int[] inputs = (int[]) swapPosition.createRequestBody();
        int result = (int) swapPosition.execute(inputs);
        swapPosition.printResponse(result);
    }


}
