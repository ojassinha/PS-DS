package GFGProblems;

import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;
import Models.LCARequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zedray on 10/2/18.
 */
public class LCA implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = {8 ,4, 9, 1, 2, 3, 6, 5};
        //Tree root = TreeUtility.buildTree(arr);

        Tree root = null;
        for (int i:arr) {

           root = TreeUtility.insert(root,i);

        }

        LCARequestBody reqwuestBody = new LCARequestBody(1,2,root);
        return reqwuestBody;
    }

    @Override
    public Object execute(Object node) {

        LCARequestBody requestBody = (LCARequestBody) node;

        List<Integer> firstPath = new ArrayList<>();
        findNodePath(requestBody.getNode(),requestBody.getOne(),firstPath);
        List<Integer> secondPath = new ArrayList<>();
        findNodePath(requestBody.getNode(),requestBody.getTwo(),secondPath);

        List<Integer> commonElements = new ArrayList<>(firstPath);
        commonElements.retainAll(secondPath);

        return commonElements.get(0);


    }

    private static void findNodePath(Tree tree,int data,List<Integer> list){

        if(tree == null)
            return;

        if(tree.getData() == data) {
            list.add(tree.getData());
            return;
        }


        if(tree.getData() > data){
            findNodePath(tree.getLeftNode(),data,list);
        }
        if(tree.getData() < data){
            findNodePath(tree.getRightNode(),data,list);
        }

        list.add(tree.getData());
    }

    @Override
    public void printResponse(Object result) {

        System.out.print(result.toString());

    }
}
