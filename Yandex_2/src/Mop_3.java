import java.util.*;

class Mop_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            int T = scanner.nextInt();

            if (!graph.containsKey(U)) {
                graph.put(U, new HashMap<>());
            }
            if (!graph.containsKey(V)) {
                graph.put(V, new HashMap<>());
            }

            graph.get(U).put(V, T);
            graph.get(V).put(U, T);
        }

        int K = scanner.nextInt();
        List<int[]> proposals = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            int T = scanner.nextInt();
            int C = scanner.nextInt();

            proposals.add(new int[]{U, V, T, C});
        }

        int P = scanner.nextInt();
        List<int[]> requirements = new ArrayList<>();

        for (int i = 0; i < P; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int T = scanner.nextInt();

            requirements.add(new int[]{A, B, T});
        }

        int[] minCostProposal = null;
        int totalCost = 0;

        for (int[] proposal : proposals) {
            int U = proposal[0];
            int V = proposal[1];
            int T = proposal[2];
            int C = proposal[3];

            if (!graph.containsKey(U) || !graph.get(U).containsKey(V)) {
                graph.putIfAbsent(U, new HashMap<>());
                graph.putIfAbsent(V, new HashMap<>());

                graph.get(U).put(V, T);
                graph.get(V).put(U, T);

                int currentMaxSignalTime = Integer.MIN_VALUE;

                for (int[] requirement : requirements) {
                    int A = requirement[0];
                    int B = requirement[1];

                    if (graph.containsKey(A) && graph.containsKey(B)) {
                        int signalTime = calculateSignalTime(graph, A, B);
                        currentMaxSignalTime = Math.max(currentMaxSignalTime, signalTime);
                    }
                }

                if (currentMaxSignalTime <= T) {
                    if (minCostProposal == null || C < minCostProposal[3]) {
                        minCostProposal = proposal;
                    }
                    totalCost += C;
                }

                graph.get(U).remove(V);
                graph.get(V).remove(U);
            }
        }

        if (minCostProposal == null) {
            System.out.println(-1);
        } else {
            System.out.println(proposals.size() - (totalCost == 0 ? 0 : 1));
            if (totalCost > 0) {
                System.out.println(minCostProposal[0] + " " + minCostProposal[1] + " " + minCostProposal[2] + " " + minCostProposal[3]);
            }
        }
    }

    public static int calculateSignalTime(Map<Integer, Map<Integer, Integer>> graph, int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, Integer> distances = new HashMap<>();

        distances.put(start, 0);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == end) {
                return distances.get(current);
            }

            for (int neighbor : graph.get(current).keySet()) {
                int distance = distances.get(current) + graph.get(current).get(neighbor);

                if (!distances.containsKey(neighbor) || distance < distances.get(neighbor)) {
                    distances.put(neighbor, distance);
                    queue.offer(neighbor);
                }
            }
        }

        return Integer.MAX_VALUE;
    }
}