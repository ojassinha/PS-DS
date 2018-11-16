package HackerrankProblems;

import Common.Tree;
import Common.TreeUtility;
import CommonService.CommonProblemServices;
import org.omg.CORBA.INTERNAL;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zedray on 11/16/18.
 */
public class leftViewOfTree implements CommonProblemServices {

    Map<Integer,Integer> hD = new HashMap<>();
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
        Tree rootNode = (Tree) node;

        leftVewUtil(rootNode,0);

        return hD;
    }

    private void leftVewUtil(Tree rootNode,int level){

        if(rootNode == null)
            return;

        if(!hD.containsKey(level))
            hD.put(level,rootNode.getData());

        leftVewUtil(rootNode.getLeftNode(),level+1);
        leftVewUtil(rootNode.getRightNode(),level+1);

    }

    @Override
    public void printResponse(Object result) {

        Map res = (Map) result;

        Iterator itr = res.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer,Integer> entry = (Map.Entry<Integer, Integer>) itr.next();
            System.out.print(entry.getValue()+" ");
        }

    }
}
