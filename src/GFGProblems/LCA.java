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
        int[] arr = {4,2,7,1,3,6};
        Tree root = TreeUtility.buildTree(arr);

        LCARequestBody reqwuestBody = new LCARequestBody(6,2,root);
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

        return commonElements.get(commonElements.size()-1);


    }

    private void findNodePath(Tree tree,int data,List<Integer> list){

        if(tree == null)
            return;

        if(tree.getData() == data)
            return;


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

        System.out.print(result);

    }
}
