import java.util.Map;

public class Main {
    public static void main(String[] args) {


        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> a = graph.addVertex("A");
        Vertex<String> b = graph.addVertex("B");
        Vertex<String> c = graph.addVertex("C");
        Vertex<String> d = graph.addVertex("D");

        graph.addEdge(a, b, 1);
        graph.addEdge(a, c, 4);
        graph.addEdge(b, c, 2);
        graph.addEdge(b, d, 5);
        graph.addEdge(c, d, 1);

        System.out.println("BFS from A:");
        new BreadthFirstSearch<String>().bfs(a);

        System.out.println("\nDijkstra from A:");
        Map<Vertex<String>, Double> distances = new DijkstraSearch<String>().dijkstra(a);
        for (Map.Entry<Vertex<String>, Double> entry : distances.entrySet()) {
            System.out.println("Distance to " + entry.getKey() + " is " + entry.getValue());
        }
    }
}