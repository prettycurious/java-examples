package com.basic.javap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2022/7/5
 * Time: 11:02
 */
public class JavapTest {
    private int num;
    boolean flag;
    protected char gender;
    public String info;

    public static final int COUNTS = 1;

    static {
        String url = "www.atguigu.com";
    }

    {
        info = "java";
    }

    public JavapTest() {

    }

    private JavapTest(boolean flag) {
        this.flag = flag;
    }

    private void methodPrivate() {

    }

    int getNum(int i) {
        return num + i;
    }

    protected char showGender() {
        return gender;
    }

    public void showInfo() {
        int i = 10;
        System.out.println(info + i);
    }
}