package com.example.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2021/7/14
 * Time: 3:33 下午
 *
 * 在java目录下执行：java -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError com.com.example.array.jvm.HeapOOM
 * 单位m没写报错：Error occurred during initialization of VM
 *             Too small initial heap
 */
public class HeapOOM {
    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
