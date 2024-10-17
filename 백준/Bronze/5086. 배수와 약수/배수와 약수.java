/**
 * 8 16
 * 32 4
 * 17 5
 * 0 0
 * 
 * factor
 * multiple
 * neither
 * */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            if(first == 0 && second == 0){
                break;
            }

            if(second % first == 0){
                sb.append("factor").append("\n");
            } else if(first % second == 0){
                sb.append("multiple").append("\n");
            }
            else{
                sb.append("neither").append("\n");
            }
        }
        System.out.println(sb);
    }
}
