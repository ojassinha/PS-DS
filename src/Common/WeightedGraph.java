package Common;

import java.util.LinkedList;

/**
 * @author ojas
 */
public class WeightedGraph {

    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public LinkedList<Pair>[] edges;

    public WeightedGraph(int n){
        this.N = n;
        edges = new LinkedList[N];

        for(int i = 0;i<N;i++){
            edges[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u,int v,int w) {
        edges[u].add(new Pair(v,w));
    }
}
