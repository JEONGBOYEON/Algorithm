import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10872 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        System.out.println(myFunc(num));
    }

    public static int myFunc(int num){
        if(num > 0) return num * myFunc(num-1);
        else return 1;
    }
}
