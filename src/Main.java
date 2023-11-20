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
        for (int i = 0; i < q.length; i++) {
            if (i == q.length - 1) {
                System.out.println(q[i]);
                break;
            }
            System.out.print(q[i] + " ");
        }
        for (int i = 0; i < w.length; i++) {
            if (i == w.length - 1) {
                System.out.println(w[i]);
                break;
            }
            System.out.print(w[i] + " ");
        }
        for (int i = 0; i < e.length; i++) {
            if (i == e.length - 1) {
                System.out.println(e[i]);
                break;
            }
            System.out.print(e[i] + " ");
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i = 2; i < q.length; i--) {
            if (i == q.length +1 ) {
                System.out.println(q[i]);
                break;
            }
            System.out.print(q[i] + " ");
        }
        for (int i = 0; i < w.length; i++) {
            if (i == w.length - 1) {
                System.out.println(w[i]);
                break;
            }
            System.out.print(w[i] + " ");
        }
        for (int i = 0; i < e.length; i++) {
            if (i == e.length - 1) {
                System.out.println(e[i]);
                break;
            }
            System.out.print(e[i] + " ");
        }
        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < q.length; i++)
            if (q[i] % 2 != 0) {
                q[i]++;
            }
        System.out.println(Arrays.toString(q));

    }
}