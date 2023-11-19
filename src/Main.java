import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;
        double[] w = {1.75, 7.654, 9.986};
        int[] e = {156, 15, 285, 13, 21};
        // Задача 2
        System.out.println("Задача 2");
        System.out.printf(q[0] + ", " + q[1] + ", " + q[2]);
        System.out.println();
        System.out.printf(w[0] + ", " + w[1] + ", " + w[2]);
        System.out.println();
        System.out.printf(e[0] + ", " + e[1] + ", " + e[2] + ", " + e[3] + ", " + e[4]);
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        System.out.printf(q[2] + ", " + q[1] + ", " + q[0]);
        System.out.println();
        System.out.printf(w[2] + ", " + w[1] + ", " + w[0]);
        System.out.println();
        System.out.printf(e[4] + ", " + e[3] + ", " + e[2] + ", " + e[1] + ", " + e[0]);
        System.out.println();
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < q.length; i++)
            if (q[i] % 2 != 0) {
                q[i]++;
            }
        System.out.println(Arrays.toString(q));

    }
}