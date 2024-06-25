import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][]a;

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		N=Integer.parseInt(br.readLine());
		
		a=new int[N][2];

		for(int i=0;i<N;i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()," ");
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a, (o1,o2)->{
			if(o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		});
		
		for(int i=0;i<N;i++) {
			sb.append(a[i][0]+" "+a[i][1]).append(" \n");
		}
		System.out.println(sb);
		
        br.close();
	}

}
