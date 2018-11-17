package Common;
import java.util.LinkedList;

/**
 * Created by zedray on 8/12/18.
 */
public class Graph {

    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public LinkedList<Integer>[] edges;

    public Graph(int n){
        this.N = n;
        edges = new LinkedList[N];

        for(int i = 0;i<N;i++){
            edges[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u,int v){
        edges[u].add(v);
    }
}
