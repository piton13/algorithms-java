import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        // System.out.println("Hello " + args[0] + " length " + args.length);
        Scanner input = new Scanner(System.in);
        // String inputString = scanner.nextLine();
        // boolean b1 = StdIn.isEmpty();
        // StdOut.println("Before reading:" + b1);
        // String abc = StdIn.readString();
        // boolean b2 = StdIn.isEmpty();
        // StdOut.println("After reading:" + b2);

        // System.out.println("Out :" + inputString);
        // StdOut.println("Out :" + abc);
        while (input.hasNext()) {
            String s = input.nextLine();
            String[] strArray = s.split(" ");
            String survived = strArray[0];

            for (int i = 0; i < strArray.length; i++) {
                survived = strArray[i];
                System.out.println("Iteration: " + i + "; Item: " + survived);
            }
            System.out.println("Survived: " + survived);
        }
    }
}
