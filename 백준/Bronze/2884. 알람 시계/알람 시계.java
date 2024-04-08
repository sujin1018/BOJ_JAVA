import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    StringTokenizer st = new StringTokenizer(str," ");
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    if (m < 45) {
      h-=1;
      m=(m+15);
      if(h < 0) {
        h = 23;
      }
      System.out.println(h + " " + m);
    }
    else {
      System.out.println(h + " " + (m - 45));
    }
  }
}
