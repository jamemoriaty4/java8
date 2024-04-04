package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x: ");
        int x = sc.nextInt();
        System.out.println("nhap y: ");
        int y = sc.nextInt();

        List<Integer> list = IntStream.range(x,y+1).boxed().toList();
//        List<Integer> list1 = Arrays.stream(list).
        for (int k: list){
            System.out.println(k);
        }
    }
}
