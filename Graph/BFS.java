import java.util.*;

public class BFS {
    private int V;
    private LinkedList<Integer> grp[];

    BFS(int v){
        V = v;
        grp = new LinkedList[v];
        for(int i=0; i<v; i++){
            grp[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w){
        grp[v].add(w);
    }

    void bfsStart(int s){
        //visited 확인 배열 생성
        boolean visited[] = new boolean[V];
        //Queue 생성
        LinkedList<Integer> q = new LinkedList();

        visited[s] = true;
        q.add(s);

        while (q.size() != 0) {
            s = q.poll();
            System.out.print(s);

            Iterator<Integer> i = grp[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }


    }

    public static void main(String args[]){
        BFS bfs = new BFS(4);

        bfs.addEdge(0,1);
        bfs.addEdge(0,2);
        bfs.addEdge(1,2);
        bfs.addEdge(2,0);
        bfs.addEdge(2,3);
        bfs.addEdge(3,3);

        bfs.bfsStart(2);

    }
}