import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5598 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char input[] = (bf.readLine()).toCharArray();

        for(char value : input) {
            if(value > 67){
                value = (char)(value - 3);
            } else{
                value = (char)(value + 23);
            }

            System.out.print(value);
        }
    }
}
