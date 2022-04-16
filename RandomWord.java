import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String survived = "";
        int i = 0;

        while (!StdIn.isEmpty()) {
            i++;
            String next = StdIn.readString();
            double probability = 1.0 / i;
            if (StdRandom.bernoulli(probability)) {
                survived = next;
            }
        }

        StdOut.println(survived);
    }
}
