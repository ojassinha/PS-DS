package Common;

/**
 * Created by zedray on 9/21/18.
 */
public class Tree {

    int data;

    private Tree leftNode;
    private Tree rightNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Tree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Tree leftNode) {
        this.leftNode = leftNode;
    }

    public Tree getRightNode() {
        return rightNode;
    }

    public void setRightNode(Tree rightNode) {
        this.rightNode = rightNode;
    }

    public Tree(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }


}
