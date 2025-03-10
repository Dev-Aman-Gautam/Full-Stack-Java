import java.util.*;

class Graph {
    private final Map<String, List<Edge>> adjList;

    public Graph() {
        this.adjList = new HashMap<>();
    }

    public void addEdge(String u, String v, int weight) {
        this.adjList.putIfAbsent(u, new ArrayList<>());
        this.adjList.get(u).add(new Edge(v, weight));
    }

    public Map<String, Integer> dijkstra(String start) {
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            if (distances.containsKey(current.node)) continue;
            distances.put(current.node, current.weight);
            
            for (Edge neighbor : adjList.getOrDefault(current.node, new ArrayList<>())) {
                if (!distances.containsKey(neighbor.node)) {
                    pq.add(new Edge(neighbor.node, current.weight + neighbor.weight));
                }
            }
        }
        return distances;
    }

    public Map<String, Integer> bellmanFord(String start) {
        Map<String, Integer> distances = new HashMap<>();
        for (String node : adjList.keySet()) distances.put(node, Integer.MAX_VALUE);
        distances.put(start, 0);
        
        for (int i = 0; i < adjList.size() - 1; i++) {
            for (String u : adjList.keySet()) {
                for (Edge edge : adjList.get(u)) {
                    if (distances.get(u) != Integer.MAX_VALUE && distances.get(u) + edge.weight < distances.get(edge.node)) {
                        distances.put(edge.node, distances.get(u) + edge.weight);
                    }
                }
            }
        }
        return distances;
    }

    public int[][] floydWarshall() {
        int size = adjList.size();
        List<String> nodes = new ArrayList<>(adjList.keySet());
        int[][] dist = new int[size][size];
        
        for (int i = 0; i < size; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
        for (int i = 0; i < size; i++) dist[i][i] = 0;
        
        for (String u : adjList.keySet()) {
            int uIdx = nodes.indexOf(u);
            for (Edge e : adjList.get(u)) {
                int vIdx = nodes.indexOf(e.node);
                dist[uIdx][vIdx] = e.weight;
            }
        }
        
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE)
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        return dist;
    }
}

class Edge {
    String node;
    int weight;
    
    public Edge(String node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
