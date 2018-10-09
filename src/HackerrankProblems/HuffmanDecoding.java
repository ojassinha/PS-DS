package HackerrankProblems;

import Common.Tree;
import CommonService.CommonProblemServices;
import Models.HuffmanRequestBody;

import java.util.Collections;

/**
 * Created by zedray on 10/9/18.
 */
public class HuffmanDecoding implements CommonProblemServices {
    @Override
    public Object createRequestBody() {

        HuffmanRequestBody requestBody = new HuffmanRequestBody();
        requestBody.setEncodedString("1001011");
        Tree root = new Tree(-1);
        Tree node1 = new Tree(-1);
        Tree node2 = new Tree(1);
        Tree node3 = new Tree(2);
        Tree node4 = new Tree(3);

        root.setLeftNode(node1);
        root.setRightNode(node2);
        node1.setLeftNode(node3);
        node1.setRightNode(node4);

        requestBody.setRoot(root);

        return requestBody;
    }

    @Override
    public Object execute(Object request) {
        HuffmanRequestBody root = (HuffmanRequestBody) request;
        Tree node = root.getRoot();
        String str = root.getEncodedString();
        char[] chars = str.toCharArray();
        int i = 0;

        String result = "";


        Tree temp = node;

        for (char c : chars) {
           if(c == '0'){
                if(temp.getLeftNode() != null && isLeaf(temp.getLeftNode())){
                    result += temp.getLeftNode().getData();
                    temp = node;
                }else if(temp.getLeftNode() != null && !isLeaf(temp.getLeftNode())){
                    temp = temp.getLeftNode();
                }
           }
           if(c == '1'){
               if(temp.getRightNode() != null && isLeaf(temp.getRightNode())){
                   result += temp.getRightNode().getData();
                   temp = node;
               }else if(temp.getRightNode() != null && !isLeaf(temp.getRightNode())){
                   temp = temp.getRightNode();
               }
           }
        }

        return result;

    }

    private boolean isLeaf(Tree node){
        if(node.getRightNode() == null && node.getLeftNode() == null)
            return true;
        return false;
    }

    @Override
    public void printResponse(Object result) {

        System.out.print(result);
    }
}
