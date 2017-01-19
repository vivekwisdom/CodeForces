package vw.codeforces.contests.cr392;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class HolidayOfEqualityUWI implements Runnable {

    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    void init() throws FileNotFoundException {
//        try {
//            in = new BufferedReader(new FileReader("input.txt"));
//            out = new PrintWriter("output.txt");
//        } catch (Exception e) {
//            in = new BufferedReader(new InputStreamReader(System.in));
//            out = new PrintWriter(System.out);
//        }

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            try {
                tok = new StringTokenizer(in.readLine(), " :");
            } catch (Exception e) {
                return null;
            }
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    int[] readIntArray(int size) throws IOException {
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = readInt();
        }
        return res;
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    <T> List<T>[] createGraphList(int size) {
        List<T>[] list = new List[size];
        for (int i = 0; i < size; i++) {
            list[i] = new ArrayList<>();
        }
        return list;
    }

    public static void main(String[] args) {
        new Thread(null, new HolidayOfEqualityUWI(), "", 1l * 200 * 1024 * 1024).start();
    }

    long timeBegin, timeEnd;

    void time() {
        timeEnd = System.currentTimeMillis();
        System.err.println("Time = " + (timeEnd - timeBegin));
    }

    long memoryTotal, memoryFree;

    void memory() {
        memoryFree = Runtime.getRuntime().freeMemory();
        System.err.println("Memory = " + ((memoryTotal - memoryFree) >> 10)
                + " KB");
    }

    public void run() {
        try {
            timeBegin = System.currentTimeMillis();
            memoryTotal = Runtime.getRuntime().freeMemory();
            init();
            solve();
            out.close();
            if (System.getProperty("ONLINE_JUDGE") == null) {
                time();
                memory();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    void solve() throws IOException {
        int n = readInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = readInt();
            sum += x;
            max = Math.max(max, x);
        }
        out.println(max * n - sum);
    }

}