
import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		char[][] star = print_star(n);
		int size = (n-1)*4+1;
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				sb.append(star[i][j]);
			}sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
	public static char[][] print_star(int num){
		int size = (num-1)*4+1;
		char[][] star = new char[size][size];
		for(int i=0;i<size;i++) {
			Arrays.fill(star[i], ' ');
		}
		
		if(num==1) {
			star[0][0]='*';
			return star;
		}
		
		char[][] pre_star = print_star(num-1);
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i==0 || i==size-1 || j==0 || j==size-1) {
					star[i][j]='*';
				}
				else if(2<=i && i<size-2 && 2<=j && j<size-2) {
					star[i][j]=pre_star[i-2][j-2];
				}
			}
		}
		return star;
		
	}
}