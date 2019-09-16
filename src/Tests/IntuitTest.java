package Tests;

import Common.Graph;
import Common.Pair;
import Common.WeightedGraph;
import CommonService.CommonProblemServices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ojas
 */
// https://www.geeksforgeeks.org/minimum-edges-reverse-make-path-source-destination/
public class IntuitTest implements CommonProblemServices {


    WeightedGraph graph = null;
    @Override
    public Object createRequestBody() {
        Scanner scanner = new Scanner(System.in);
        String testCase = scanner.nextLine();
        int n = Integer.getInteger(testCase.split(" ")[0]);
        int e = Integer.getInteger(testCase.split(" ")[1]);

        graph = new WeightedGraph(n);
        for(int i = 0;i < e;i++){
            String str = scanner.nextLine();
            int u = Integer.parseInt(str.split(" ")[0]);
            int v = Integer.parseInt(str.split(" ")[1]);
            graph.addEdge(u,v,0);
            graph.addEdge(v,u,1);
        }

        return graph;
    }

    @Override
    public Object execute(Object node) {
        WeightedGraph graph = (WeightedGraph) node;
        return shortestPath((WeightedGraph) createRequestBody());
    }


    private int shortestPath(WeightedGraph graph){
        int[] dist = new int[graph.getN()];
        boolean[] isVisited = new boolean[graph.getN()];

        for(int i = 0;i<dist.length;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[0] = 0;

        for(int i = 0;i < graph.getN();i++){

             LinkedList node = graph.edges[i];

            Iterator itr = node.iterator();
            while (itr.hasNext()){
                Pair p1 = (Pair) itr.next();

                if(!isVisited[p1.getK()] && (dist[i] > dist[i] + p1.getV())){
                    dist[i] = dist[i] + p1.getV();
                    isVisited[p1.getK()] = true;
                }
            }
        }

        return dist[graph.getN()-1];
    }


    @Override
    public void printResponse(Object result) {

    }
}
