

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set<Integer> set = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		boolean isFind = false;
		for(int i=0; i<M; i++) {
			isFind=set.contains(Integer.parseInt(st.nextToken()));
			if(isFind) {
				sb.append("1 ");
			}else {
				sb.append("0 ");
			}
		}
		System.out.println(sb.toString());
		
		
	}
	
}