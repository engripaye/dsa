package org.engripaye.TreesAndGraph;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class GraphBfsAndDfsTraversal {

    // you have a graph ( a network of connected point ) and you need to visit all the points(nodes) in an organized way
    // visiting all the node in a tree from top to bottom in ascending order


    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();

        Set<Integer> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(STR."\{node} ");

            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, List.of(6));

        bfs(graph, 1);
    }
}
