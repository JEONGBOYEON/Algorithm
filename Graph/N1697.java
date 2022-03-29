//가장 빠른 시간
//x+1, x-1, 2*
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int Start;
    static int End;
    static int check[] = new int[100001];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Start = sc.nextInt();
        End = sc.nextInt();

        System.out.print(bfs(Start));
    }

    //넣고, 뺴고, 체
    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = 1;

        while (!q.isEmpty()) {
            int num = q.poll();

            if (num == End) {
                return check[num]-1;
            }

            if (0 < num && num <= 100001 && check[num - 1] == 0) {
                q.add(num - 1);
                check[num - 1] = check[num] + 1;
            }
            if (-1 <= num && num < 100000 && check[num + 1] == 0) {
                q.add(num + 1);
                check[num + 1] = check[num] + 1;
            }
            if (0 <= num && num * 2 <= 100000 && check[num * 2] == 0) {
                q.add(num * 2);
                check[num * 2] = check[num] + 1;
            }
        }
        return -1;
    }
}