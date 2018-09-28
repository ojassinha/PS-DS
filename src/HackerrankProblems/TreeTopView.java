package HackerrankProblems;

import Common.Graph;
import Common.QueueItemWithIndex;
import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;

import java.util.*;

/**
 * Created by zedray on 9/12/18.
 */
public class TreeTopView implements CommonProblemServices {



    @Override
    public Object createRequestBody() {

        // replace this with your own level order data
        // out put should be 8 4 2 1 3 7
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Tree root = TreeUtility.buildTree(arr);
        return root;
    }

    @Override
    public Object execute(Object node) {

        if(node == null){
            return null;
        }

        Tree rootNode = (Tree) node;

        Queue<QueueItemWithIndex> queue = new LinkedList<>();
        queue.add(new QueueItemWithIndex(rootNode,0));

        Map<Integer,Integer> resultMap = new HashMap<>();

        int leftCount = 0;
        int rightCount = 0;

        while(!queue.isEmpty()){

            QueueItemWithIndex nodeP = queue.poll();

            if(!resultMap.containsKey(nodeP.getIndex())){
                resultMap.put(nodeP.getIndex(),nodeP.getTreeNode().getData());
            }

            if(nodeP.getTreeNode().getLeftNode() != null){
                queue.add(new QueueItemWithIndex(nodeP.getTreeNode().getLeftNode(),nodeP.getIndex() - 1));
            }

            if(nodeP.getTreeNode().getRightNode() != null){
                queue.add(new QueueItemWithIndex(nodeP.getTreeNode().getRightNode(),nodeP.getIndex() + 1));
            }

        }

        return resultMap;
    }

    @Override
    public void printResponse(Object results) {

        Map<Integer,Integer> result = (Map<Integer, Integer>) results;

        if(result != null){
           for(Map.Entry<Integer,Integer> entry:result.entrySet()){

               System.out.print(entry.getValue());

           }
        }
    }
}
