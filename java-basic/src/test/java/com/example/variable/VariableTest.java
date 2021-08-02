package com.example.variable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/7/9
 * Time: 8:53 上午
 */
public class VariableTest {

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bo;

    public static void main(String[] args) {

        System.out.println("byte的大小：" + Byte.SIZE
                + ";默认值：" + b
                + ";数据范围：" + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);

        System.out.println("short的大小：" + Short.SIZE
                + ";默认值：" + s
                + ";数据范围：" + Short.MIN_VALUE + " - " + Short.MAX_VALUE);

        System.out.println("int的大小：" + Integer.SIZE
                + ";默认值：" + i
                + ";数据范围：" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);

        System.out.println("long的大小：" + Long.SIZE
                + ";默认值：" + l
                + ";数据范围：" + Long.MIN_VALUE + " - " + Long.MAX_VALUE);

        System.out.println("float的大小：" + Float.SIZE
                + ";默认值：" + f
                + ";数据范围：" + Float.MIN_VALUE + " - " + Float.MAX_VALUE);

        System.out.println("double的大小：" + Double.SIZE
                + ";默认值：" + d
                + ";数据范围：" + Double.MIN_VALUE + " - " + Double.MAX_VALUE);

        System.out.println("char的大小：" + Character.SIZE
                + ";默认值：" + c
                + ";数据范围：" + Character.MIN_VALUE + " - " + Character.MAX_VALUE);

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);

        System.out.println("boolean的大小：" + Byte.SIZE
                + ";默认值：" + bo
                + ";数据范围：" + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
    }
}
