package Models;

import Common.Tree;

/**
 * Created by zedray on 10/3/18.
 */
public class LCARequestBody {

    private int one;

    private int two;
    private Tree node;

    public int getOne() {
        return one;
    }

    public void setOne(int one) {
        this.one = one;
    }

    public int getTwo() {
        return two;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public Tree getNode() {
        return node;
    }

    public void setNode(Tree node) {
        this.node = node;
    }

    public LCARequestBody(int one,int two, Tree node) {
        this.one = one;
        this.two = two;
        this.node = node;
    }
}
