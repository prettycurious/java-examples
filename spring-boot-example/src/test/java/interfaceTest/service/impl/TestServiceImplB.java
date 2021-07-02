package interfaceTest.service.impl;

import interfaceTest.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 2:40 下午
 */
@Service
public class TestServiceImplB implements TestService {

    @Override
    public String firstStep() {
        return "TestServiceImplB--firstStep";
    }

    @Override
    public String secondStep() {
        return "TestServiceImplB--secondStep";
    }

    @Override
    public String thirdStep() {
        return "TestServiceImplB--thirdStep";
    }

}
