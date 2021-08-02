package com.example.scanner;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/7/14
 * Time: 10:37 上午
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner("aaa bbb ccc,ddd,eee");
        // Scanner默认使用空格作为分割符来分隔文本，但允许你指定新的分隔符
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
