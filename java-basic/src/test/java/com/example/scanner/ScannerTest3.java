package com.example.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/7/14
 * Time: 10:52 上午
 */
public class ScannerTest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 循环输入
        while (true) {
            System.out.println("请输入字符串：");
            if (scanner.hasNext()) {
                String next = scanner.next();
                if ("quit".equals(next)) {
                    break;
                }
                System.out.println("您输入的字符串是：" + next);
            }
        }
    }
}
