package GFGProblems;

import Common.Graph;
import CommonService.CommonProblemServices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zedray on 11/18/18.
 */
public class GraphDFS implements CommonProblemServices {

    List<Integer> response ;
    boolean[] visited;
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
        response = new LinkedList<>();
        visited = new boolean[graph.getN()];
        DFSUtil(graph,0);

        return response;
    }

    public void DFSUtil(Graph graph,int s){

        visited[s] = true;
        response.add(s);

        Iterator<Integer> itr = graph.edges[s].iterator();

        while (itr.hasNext()){
            int n = itr.next();
            if(!visited[n]){
                visited[n] = true;
                DFSUtil(graph,n);
            }
        }


    }

    @Override
    public void printResponse(Object result) {

        List<Integer> response = (List<Integer>) result;
        for(int io : response){
            System.out.println(io);
        }
    }
}
