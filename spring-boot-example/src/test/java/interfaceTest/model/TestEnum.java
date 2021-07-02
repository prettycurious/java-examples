package interfaceTest.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 4:16 下午
 */
public class TestEnum {
//    A("1", "interfaceTest.service.impl.TestServiceImplA"), B("2", "interfaceTest.service.impl.TestServiceImplB");

    private TestType type;
    private String mark;
    private String path;

    public TestEnum(TestType type, String mark, String path) {
        this.type = type;
        this.mark = mark;
        this.path = path;
    }

    public TestEnum() {
    }

//    public static String getPathByMark(String mark) {
//        for (TestEnum testEnum : TestEnum.values())
//            if (mark.equals(testEnum.getMark()))
//                return testEnum.getPath();
//        return null;
//    }

    public TestType getType() {
        return type;
    }

    public void setType(TestType type) {
        this.type = type;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
