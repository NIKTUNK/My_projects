import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Set<Integer>> player1 = new HashMap<>();
        Map<Integer, Set<Integer>> player2 = new HashMap<>();
        boolean gameOver = false;


        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (i % 2 == 0) {
                if (checkWin(player1, r, c)) {
                    System.out.println("First");
                    return;
                }
                player1.putIfAbsent(r, new HashSet<>());
                player1.get(r).add(c);
            } else {
                if (checkWin(player2, r, c)) {
                    System.out.println("Second");
                    return;
                }
                player2.putIfAbsent(r, new HashSet<>());
                player2.get(r).add(c);
            }
        }

        if (!gameOver) {
            System.out.println("Draw");
        }
    }

    public static boolean checkWin(Map<Integer, Set<Integer>> player, int r, int c) {
        if (checkRow(player.get(r)) || checkCol(player, c) || checkDiagonals(player)) {
            return true;
        }
        return false;
    }

    public static boolean checkRow(Set<Integer> row) {
        if (row == null) {
            return false;
        }
        if (row.size() < 5) {
            return false;
        }
        List<Integer> list = new ArrayList<>(row);
        Collections.sort(list);
        for (int i = 0; i < list.size()-4; i++) {
            if (list.get(i) + 1 == list.get(i+1) && list.get(i) + 2 == list.get(i+2) && list.get(i) + 3 == list.get(i+3) && list.get(i) + 4 == list.get(i+4)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(Map<Integer, Set<Integer>> player, int c) {
        List<Integer> rows = new ArrayList<>(player.keySet());
        Collections.sort(rows);
        for (int i = 0; i < rows.size(); i++) {
            int r = rows.get(i);
            if (player.get(r).contains(c) && player.getOrDefault(r+1, new HashSet<>()).contains(c) &&
                    player.getOrDefault(r+2, new HashSet<>()).contains(c) && player.getOrDefault(r+3, new HashSet<>()).contains(c) &&
                    player.getOrDefault(r+4, new HashSet<>()).contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(Map<Integer, Set<Integer>> player) {
        List<Integer> rows = new ArrayList<>(player.keySet());
        Collections.sort(rows);
        for (int i = 0; i < rows.size(); i++) {
            int r = rows.get(i);
            Set<Integer> columns = player.get(r);
            for (int c : columns) {
                if (player.getOrDefault(r+1, new HashSet<>()).contains(c+1) && player.getOrDefault(r+2, new HashSet<>()).contains(c+2) &&
                        player.getOrDefault(r+3, new HashSet<>()).contains(c+3) && player.getOrDefault(r+4, new HashSet<>()).contains(c+4)) {
                    return true;
                }
                if (player.getOrDefault(r+1, new HashSet<>()).contains(c-1) && player.getOrDefault(r+2, new HashSet<>()).contains(c-2) &&
                        player.getOrDefault(r+3, new HashSet<>()).contains(c-3) && player.getOrDefault(r+4, new HashSet<>()).contains(c-4)) {
                    return true;
                }
            }
        }
        return false;
    }
}