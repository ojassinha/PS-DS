package HackerrankProblems;

import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ojas
 */
public class LevelOrderTraversal implements CommonProblemServices {
    @Override
    public Object createRequestBody() {
        int[] arr = {8 ,4, 9, 1, 2, 3, 6, 5};
        Tree root = null;
        for (int i:arr) {

            root = TreeUtility.insert(root,i);

        }
        return root;
    }

    @Override
    public Object execute(Object node) {

        if(node == null)
            return null;
        Tree root = (Tree) node;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Tree currNode =  queue.poll();
            if(currNode != null) {
                System.out.println(currNode.getData());
                queue.add(currNode.getLeftNode());
                queue.add(currNode.getRightNode());
            }
        }

        return null;

    }

    @Override
    public void printResponse(Object result) {

    }
}
