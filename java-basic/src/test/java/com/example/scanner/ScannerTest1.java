package com.example.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/7/14
 * Time: 10:19 上午
 */
public class ScannerTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数类型：");
        if (scanner.hasNextInt()) {
            int nextInt = scanner.nextInt();
            System.out.println("您输入的整数是：" + nextInt);
        } else {
            System.out.println("您输入的不是整数！");
        }
        scanner.close();
    }
}
