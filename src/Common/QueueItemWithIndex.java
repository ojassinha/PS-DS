package Common;

/**
 * Created by zedray on 9/26/18.
 */
public class QueueItemWithIndex {

    private Tree treeNode;
    private int index;

    public Tree getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(Tree treeNode) {
        this.treeNode = treeNode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public QueueItemWithIndex(Tree treeNode,int index){
        this.setIndex(index);
        this.setTreeNode(treeNode);
    }
}
