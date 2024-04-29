import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String s = bf.readLine();
    StringTokenizer  st = new StringTokenizer(s," ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int c = Integer.parseInt(bf.readLine());

    int res = b + c;
    if (b+c > 59) {
      a += (res / 60);
      res %= 60;
      if (a > 23) {
        a -= 24;
      }
    }
    System.out.println(a + " " + res);
  }
}
