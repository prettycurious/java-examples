package interfaceTest.service;

import interfaceTest.model.TestEnum2;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 3:06 下午
 */
public class TestFactory2 {
    public static TestService getTestService(String mark) {
        try {
            String path = TestEnum2.getPathByMark(mark);
            return (TestService) Class.forName(path).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
