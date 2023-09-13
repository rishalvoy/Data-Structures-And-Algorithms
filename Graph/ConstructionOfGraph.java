package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ConstructionOfGraph
 */

 /*
    8
    7
    0 1
    1 2
    2 3
    0 3
    3 4
    4 5
    5 6
    4 6
 */
public class ConstructionOfGraph {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int noOfEdges = sc.nextInt();
        int noOfVertex = sc.nextInt();

        int[][] edges = new int[noOfEdges][2];
        for(int i=0;i<noOfEdges;i++)
        {
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> graph= new ArrayList<>();
        for(int i=0;i<noOfVertex;i++)
        {
            graph.add(new ArrayList<>());

        }

        for(int i=0;i<noOfEdges;i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            //graph.get(v).add(u);

        }
        System.out.println("This is A Directed Graph ");
        System.out.println(graph);

        for(int i=0;i<graph.size();i++)
        {
            for(int j=0;j<graph.get(i).size();j++)
            {
                System.out.println("Edge is From Node "+i+" To Node "+graph.get(i).get(j));
            }
            
        }
    }
}