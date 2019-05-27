package GFGService;

import Common.Graph;
import Common.Tree;
import CommonService.CommonProblemServices;
import GFGProblems.BinarySearch;
import GFGProblems.GraphBBFS;
import GFGProblems.GraphDFS;
import GFGProblems.Heapsort;
import HackerrankProblems.ArrayRotation;
import HackerrankProblems.CheckBST;
import HackerrankProblems.CrosswordPuzzle;
import HackerrankProblems.HuffmanDecoding;
import HackerrankProblems.MaxSubarray;
import HackerrankProblems.MinimumDistance;
import HackerrankProblems.StairCaseProblem;
import HackerrankProblems.SwapPositions;
import HackerrankProblems.TreeTopView;
import HackerrankProblems.leftViewOfTree;
import Models.ArrayRotationRequestBody;
import Models.CrosswordRequest;
import Models.HuffmanRequestBody;
import Models.LCARequestBody;

import java.util.List;
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

    @Override
    public void runCrossword() {

        CommonProblemServices crosswordPuzzle = new CrosswordPuzzle();
        CrosswordRequest inputs = (CrosswordRequest) crosswordPuzzle.createRequestBody();
        char[][] result = (char[][]) crosswordPuzzle.execute(inputs);
        crosswordPuzzle.printResponse(result);
    }

    @Override
    public void runMinimumArrayDistance() {

        CommonProblemServices minimumDistance = new MinimumDistance();
        int[] inputs = (int[]) minimumDistance.createRequestBody();
        int result = (int) minimumDistance.execute(inputs);
        minimumDistance.printResponse(result);

    }

    @Override
    public void runLeftViewTree() {
        CommonProblemServices treeLeft = new leftViewOfTree();

        // Create the request body for the tree top view
        Tree root = (Tree) treeLeft.createRequestBody();

        // create the response map containing the
        Map<Integer, Integer> result = (Map<Integer, Integer>) treeLeft.execute(root);

        if(result != null){
            treeLeft.printResponse(result);
        }
    }

    @Override
    public void runGraphBFS() {

        CommonProblemServices bfs = new GraphBBFS();

        Graph graph = (Graph) bfs.createRequestBody();

        List<Integer> response = (List<Integer>) bfs.execute(graph);
        bfs.printResponse(response);

    }

    @Override
    public void runBinarySearch() {
        CommonProblemServices binarySearch = new BinarySearch();

        int[] request = (int[]) binarySearch.createRequestBody();

        int response = (int) binarySearch.execute(request);

        binarySearch.printResponse(response);
    }

    @Override
    public void runDFS() {
        CommonProblemServices dfs = new GraphDFS();

        Graph graph = (Graph) dfs.createRequestBody();
        List<Integer> response = (List<Integer>) dfs.execute(graph);

        dfs.printResponse(response);
    }

    @Override
    public void runHeapify() {
        CommonProblemServices heapify = new Heapsort();
        int[] arr = (int[]) heapify.createRequestBody();
        int[] response = (int[]) heapify.execute(arr);
        heapify.printResponse(response);
    }


}
