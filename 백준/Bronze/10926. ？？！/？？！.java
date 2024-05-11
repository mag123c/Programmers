import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String id = br.readLine();

        print(id, bw);

        bw.flush();
        bw.close();
    }

    public static void print(String tmp, BufferedWriter bw) throws IOException {
        bw.write(tmp + "??!");
    }
}