import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1037 {
    public static void main(String args[]) throws Exception{
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
//
//        while (num-- > 0){
//            int temp = sc.nextInt();
//            max = max < temp ? temp : max;
//            min = min > temp ? temp : min;
//        }
//
//        System.out.println(max*min);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(num-- > 0){
            int temp = Integer.parseInt(st.nextToken());
            max = temp > max ? min : max;
            min = temp < min ? temp : min;
        }
    }
}







/*




*/