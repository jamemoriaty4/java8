package practice;

import java.util.Arrays;
import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        System.out.println("nhap mang");
        for (int i = 0; i < n; i++) {
            System.out.printf("\na[%d]= ",i+1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("xuat mang");
        Arrays.stream(arr).forEach(System.out::println);
    }
}
