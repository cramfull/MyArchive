
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		String N = str.nextToken();
		String M = str.nextToken();
		
		if(N.equals(M)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		
	}
	
	
	
}