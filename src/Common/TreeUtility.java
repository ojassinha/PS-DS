package Common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zedray on 9/24/18.
 */
public class TreeUtility {

    public static Tree buildTree(int[] data){

        int size = data.length;
        List<Tree> nodes = createNodeFromData(data);
        for(int i = 0;i<size/2;i++){
            nodes.get(i).setLeftNode(nodes.get(2*i + 1));
            nodes.get(i).setRightNode(nodes.get(2*i + 2));
        }

        return nodes.get(0);
    }

    private static List<Tree> createNodeFromData(int[] data){

        List<Tree> nodes = new ArrayList<>();

        for(int i=0;i<data.length;i++){
            Tree tree = new Tree(data[i]);
            nodes.add(tree);
        }

        return nodes;
    }
}
