package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class BFS {

    public  static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int noOfEdges = sc.nextInt();
        int noOfVertex = sc.nextInt();

        int[][] edges = new int[noOfEdges][2];
        for(int i=0;i<noOfEdges;i++)
        {
            edges[i][0]=sc.nextInt();
            edges[i][1]=sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> graph = ConstructionOfGraph(noOfVertex,noOfEdges,edges);

        System.out.println("This is Final graph from main method");
        System.out.println(graph);


        
    }

    public static ArrayList<ArrayList<Integer>> ConstructionOfGraph(int noOfVertex,int noOfEdges,int[][]edges)
    {
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
            graph.get(v).add(u);

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

        return graph;
    }

    public static void BFS(ArrayList<ArrayList<Integer>>graph)
    {
        
    }
    
}
