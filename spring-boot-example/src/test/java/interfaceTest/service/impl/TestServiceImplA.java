package interfaceTest.service.impl;

import interfaceTest.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 2:39 下午
 */
@Service
public class TestServiceImplA implements TestService {

    @Override
    public String firstStep() {
        return "TestServiceImplA--firstStep";
    }

    @Override
    public String secondStep() {
        return "TestServiceImplA--secondStep";
    }

    @Override
    public String thirdStep() {
        return "TestServiceImplA--thirdStep";
    }
}
