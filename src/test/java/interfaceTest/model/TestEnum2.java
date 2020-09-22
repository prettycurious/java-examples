package interfaceTest.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/9/11
 * Time: 4:16 下午
 */
public enum TestEnum2 {
    A("1", "interfaceTest.service.impl.TestServiceImplA"), B("2", "interfaceTest.service.impl.TestServiceImplB");

    private String mark;
    private String path;

    private TestEnum2(String mark, String path) {
        this.mark = mark;
        this.path = path;
    }

    public static String getPathByMark(String mark) {
        for (TestEnum2 testEnum : TestEnum2.values())
            if (mark.equals(testEnum.getMark()))
                return testEnum.getPath();
        return null;
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
