package practice;

import java.util.Arrays;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        System.out.println("nhap mang");
        for (int i = 0; i < n; i++) {
            System.out.printf("\na[%s]= ",i+1);
            arr[i] = sc.nextLine();
        }
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
