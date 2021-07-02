package interfaceTest.service;

import interfaceTest.model.TestEnum;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 3:06 下午
 */
public class TestFactory {
//    public static TestService getTestService(String mark) {
//        try {
//            String path = TestEnum.getPathByMark(mark);
//            return (TestService) Class.forName(path).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    private final ApplicationContext context;

    public TestFactory(ApplicationContext context) {
        this.context = context;
    }

    public TestService get(TestEnum fileAttribute) {
        Map<String, TestService> filePreviewMap = context.getBeansOfType(TestService.class);
        return filePreviewMap.get(fileAttribute.getType().getInstanceName());
    }

}
