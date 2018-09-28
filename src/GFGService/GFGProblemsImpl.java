package GFGService;

import Common.QueueItemWithIndex;
import Common.Tree;
import CommonService.CommonProblemServices;
import HackerrankProblems.TreeTopView;

import java.util.Map;

/**
 * Created by zedray on 8/1/18.
 */
public class GFGProblemsImpl  implements GFGProblems{


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


}
