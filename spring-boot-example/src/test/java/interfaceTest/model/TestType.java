package interfaceTest.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 5:04 下午
 */
public enum TestType {
    A("interfaceTest.service.impl.TestServiceImplA"),
    B("interfaceTest.service.impl.TestServiceImplB");

    private final String instanceName;

    TestType(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceName() {
        return instanceName;
    }
}
