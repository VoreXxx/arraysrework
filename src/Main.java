import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task1
        int [] num = new int[]{1, 2, 3};
        double [] arr = {1.57, 7.654, 9.986};
        int [] mass = {1, 4, 6, 7, 9};

//Task2
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i != num.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
            if (i != mass.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

//Task3
        for (int i = num.length-1; i>=0; i--) {
            System.out.print(num[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = mass.length-1; i>=0; i--) {
            System.out.print(mass[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
//Task4
        for (int a = 0; a < num.length; a++) {
            if (num[a] % 2 != 0) {
                num[a]++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}