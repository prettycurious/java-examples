package com.example.other;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/8/2
 * Time: 3:59 下午
 * <p>
 * \t 水平制表符
 * IntelliJ IDEA： 空格个数不定
 * 以系统自带终端为准
 * MacOS：num = |n-8|%8
 */
public class TabTest {
    public static void main(String[] args) {
        // 9个1
        System.out.println("111111111" + "\t" + "111" + "\t" + "1");
        System.out.println("1\t1\t1");
        // 16个1
        System.out.println("11111111111111111");
        System.out.println("11111111111111111" + "\t" + "11111111111111111");
        // 12个1
        System.out.println("111111111111" + "\t" + "1");
        System.out.println("111111111111" + "\t" + "1" + "\t" + "1");


        System.out.println("123\t.....");
        System.out.println("123     .....");
        System.out.println("123" + "\t" + ".....");
        System.out.println("mouse\t.....");
        System.out.println("\t.....");
        System.out.println("12345678\t.....");
    }
}
