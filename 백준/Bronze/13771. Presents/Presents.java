
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;






	
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		float [] gift = new float [N];
		
		for(int i=0; i<N; i++) {
			gift[i]=Float.parseFloat(br.readLine());
		}
		
		Arrays.sort(gift);
		
		System.out.printf("%.2f",gift[1]);
		

	}
	
}















