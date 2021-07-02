package interfaceTest.controller;

import interfaceTest.service.TestFactory2;
import interfaceTest.service.TestService;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 2:43 下午
 */
public class TestController2 {

    public static void main(String[] args) {
        TestService t1 = TestFactory2.getTestService("1");
        System.out.println(t1.firstStep());
        System.out.println(t1.secondStep());
        System.out.println(t1.thirdStep());
        System.out.println("-----------");
        TestService t2 = TestFactory2.getTestService("2");
        System.out.println(t2.firstStep());
        System.out.println(t2.secondStep());
        System.out.println(t2.thirdStep());
    }

}
