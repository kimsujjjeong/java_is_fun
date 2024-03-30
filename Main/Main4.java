import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Buffer example
public class Main4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String st = br.readLine();
		br.close();
				
		System.out.println(st.length());
		
		
	}
}