package GFGProblems;

import Common.Graph;
import CommonService.CommonProblemServices;
import com.sun.prism.impl.ps.BaseShaderFactory;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zedray on 11/16/18.
 */
public class GraphBBFS implements CommonProblemServices {


    boolean[] visited = null;

    List response = null;

    @Override
    public Object createRequestBody() {
        Graph g = new Graph(13);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(1, 6);

        g.addEdge(2, 7);
        g.addEdge(2, 8);
        g.addEdge(2, 9);

        g.addEdge(8, 10);
        g.addEdge(9, 11);
        g.addEdge(7, 12);
        return g;
    }

    @Override
    public Object execute(Object node) {
        Graph graph = (Graph) node;

        visited = new boolean[graph.getN()];

        response = new LinkedList();

        BFSUtil(graph,0);

        return response;
    }


    private void BFSUtil(Graph g,int source){

        Queue queue = new LinkedList();
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()){
            int val = (int) queue.poll();
            response.add(val);

            Iterator itr = g.edges[val].iterator();

            while (itr.hasNext()){
                int n = (int) itr.next();
                if(!visited[n]) {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }

    }

    @Override
    public void printResponse(Object result) {

        List<Integer> response = (List) result;

        for(int i : response){
            System.out.println(i);
        }

    }
}
