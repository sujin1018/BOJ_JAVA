import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken()); 
    int w = Integer.parseInt(st.nextToken());
    int h = Integer.parseInt(st.nextToken());

    int dx = Math.min(w-x, x);
    int dy = Math.min(h-y, y);
  
    System.out.println(Math.min(dx, dy));
    } 
}