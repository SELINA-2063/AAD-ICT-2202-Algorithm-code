package dijkstras.shortestpath.algorithm;

public class DijkstraMain {

    public static void main(String[] args) {
        
        int graph [][]  = new int[][] 
        		
        {
            // A  B  C  D  E  F
            { 0, 4, 5, 0, 0, 0 }, // A
            { 4, 0,11, 9, 7, 0 }, // B
            { 5,11, 0, 0, 3, 0 }, // C
            { 0, 9, 0, 0, 13, 2 }, // D
            { 0, 7, 3, 13, 0, 6 }, // E
            { 0, 0, 0, 2, 6, 0 }  // F
        };

        ShortestPath sp = new ShortestPath();
        sp.dijkstra(graph, 0); // Source is A (index 0)
    }
}
