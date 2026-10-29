import java.util.Scanner;

public class Tugas114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        System.out.print("Masukkan bilangan bulat n(n minimal 1) ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) { 
            int j = 1;
            while (j <= i) {

                System.out.print(j + " ");
                j++;
                total++;
            } 
            System.out.println();
            i++;
        }
        System.out.println("Total angka tercetak : " + total);
        sc.close();
    }
}
