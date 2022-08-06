import java.util.*;

class Pair{
    int nbr; int weight;

    // unweighted edge
    Pair(int nbr){
        this.nbr= nbr;
        this.weight= 1;
    }
    
    // weighted edge
    Pair(int nbr, int weight){
        this.nbr= nbr;
        this.weight= weight;
    }
}

class Graph{

    // Initialised an array reference variable pointing null
    ArrayList<Pair>[] adj;

    // constructor
    Graph(int n){
        // array of size n
        adj= new ArrayList[n];
        for(int i=0; i<adj.length; i++){
            // putting empty arraylists in the adjacency list
            adj[i]= new ArrayList<>();
        }
    }

    // unweighted
    public void addEdge(int src, int des, boolean isDirected){
        adj[src].add(new Pair(des));
         if(!isDirected){
            adj[des].add(new Pair(src));
         }
         
    }
    // weighted
    public void addEdge(int src, int des, int weight, boolean isDirected){
        adj[src].add(new Pair(des, weight));
        if(!isDirected){
            adj[des].add(new Pair(src, weight));
        }
    }

}

public class graphs {
    public static void main(String[] args) throws Exception {;
        Scanner scn= new Scanner(System.in);
        int vertices= scn.nextInt();
        Graph g= new Graph(vertices);

        for(int i=0; i<vertices; i++){
            int src= scn.nextInt();
            int des= scn.nextInt();
            int weight= scn.nextInt();

            g.addEdge(src, des, weight, false);
        }
        
    }
}