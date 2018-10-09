package HackerrankProblems;

import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;

/**
 * Created by zedray on 10/8/18.
 */
public class CheckBST implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = new int[]{10,7,14,5,8,12,15};
        Tree tree = TreeUtility.buildTree(arr);
//        for(int i:arr)
//            tree = TreeUtility.insert(tree,i);

        return tree;
    }

    @Override
    public Object execute(Object node) {
        Tree root = (Tree) node;

        return checkbst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean checkbst(Tree root,int min,int max){
        if(root == null)
            return true;

        if(root.getData() < min || root.getData() > max)
           return false;
        return checkbst(root.getLeftNode(),min,root.getData()-1) && checkbst(root.getRightNode(),root.getData()+1,max);
     }

    @Override
    public void printResponse(Object result) {

        System.out.print(result);
    }
}
