//1은 이동, 0은 이동불가
//1이면 큐에서 빼고 count + , 인접노드 확인
//0이면 그냥 큐에서만 빼기

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class N2178 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String xy = br.readLine();
        int x = Integer.parseInt(xy.substring(0,1));
        int y = Integer.parseInt(xy.substring(2,3));
        int[][] value = new int[x][y];
        int[][] value2 = new int[x][y];
        int count = 0;

        for(int i=0; i<x; i++){
            String str = br.readLine();
            value[i] = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        }

        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(value[i][j]==1){
                    count++;
                }else{

                }
            }
        }

    }

}