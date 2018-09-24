package HackerrankProblems;

import Common.Graph;
import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;

/**
 * Created by zedray on 9/12/18.
 */
public class TreeTopView implements CommonProblemServices {



    @Override
    public Object createRequestBody(Object inputData) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        Tree root = TreeUtility.buildTree(arr);
//        Tree tree = new Tree(1);
//        Tree tree1 = new Tree(2);
//        Tree tree2 = new Tree(3);
//        Tree tree3 = new Tree(4);
//        Tree tree4 = new Tree(5);
//        Tree tree5 = new Tree(6);
//
//        tree.setLeftNode(tree1);
//        tree.setRightNode(tree2);
//        tree1.setLeftNode(tree3);

        return null;

    }

    @Override
    public Object execute() {
        return null;
    }

    @Override
    public void printResponse() {

    }
}
