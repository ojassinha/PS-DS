package Common;

/**
 * @author ojas
 */
public class Pair{

    private int K;
    private int V;

    public int getK() {
        return K;
    }

    public void setK(int k) {
        this.K = k;
    }

    public int getV() {
        return V;
    }

    public void setV(int v) {
        this.V = v;
    }

    public Pair(int k, int v) {
        K = k;
        V = v;
    }
}
