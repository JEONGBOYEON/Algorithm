import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int maxIndex = 0, maxValue = 0;
        for(int i=0; i<9; i++){
            int temp = (Integer.parseInt(bf.readLine()));
            if(maxValue < temp){
                maxIndex = i+1;
                maxValue = temp;
            }
        }
        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
