package Models;

import Common.Tree;

/**
 * Created by zedray on 10/9/18.
 */
public class HuffmanRequestBody {

    private String encodedString;

    private Tree root;

    public String getEncodedString() {
        return encodedString;
    }

    public void setEncodedString(String encodedString) {
        this.encodedString = encodedString;
    }

    public Tree getRoot() {
        return root;
    }

    public void setRoot(Tree root) {
        this.root = root;
    }
}
