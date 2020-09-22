import com.example.HelloWorldMainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tianwenyuan
 * Date: 2020/3/30
 * Time: 5:12 下午
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HelloWorldMainApplication.class)
public class DateTest {

    @Test
    public void dateTest() {
        System.out.println("Java Date Test");

        String beginTime = "2020-03-30 16:31:48";
        String endTime = "2020-03-31 16:31:55";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);

            // before:d1.before(d2) 只有d1在d2之前才返回true  否则false 相当于 d1 < d2
            // after: d1.after(d2) 只有d1在d2之后才返回true  否则false  相当于 d1 > d2
            // 这两个函数在不使用!(非运算符)的情况下且单独使用时  均不包含=的情况(如<= >=)
            boolean before1 = date1.before(date2);
            System.out.println("before1===" + before1);
            boolean before2 = date2.before(date1);
            System.out.println("before2===" + before2);
            boolean before3 = date1.before(date1);
            System.out.println("before3===" + before3);

            boolean after1 = date1.after(date2);
            System.out.println("after1===" + after1);
            boolean after2 = date2.after(date1);
            System.out.println("after2===" + after2);
            boolean after3 = date1.after(date1);
            System.out.println("after3===" + after3);

            long beginMillisecond = date1.getTime();
            long endMillisecond = date2.getTime();
            System.out.println(beginMillisecond);
            System.out.println(endMillisecond);
            System.out.println(beginMillisecond > endMillisecond);

            // java.util.Date类实现了Comparable接口，可以直接调用Date的compareTo()方法来比较大小，
            // compareTo()方法的返回值，date1小于date2返回-1，date1大于date2返回1，相等返回0
            int compareTo1 = date1.compareTo(date2);
            System.out.println(compareTo1);
            int compareTo2 = date2.compareTo(date1);
            System.out.println(compareTo2);
            int compareTo3 = date1.compareTo(date1);
            System.out.println(compareTo3);

            boolean equals1 = date1.equals(date2);
            System.out.println("equals1===" + equals1);
            boolean equals2 = date1.equals(date1);
            System.out.println("equals2===" + equals2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void beforeAndAfterTest() {
        System.out.println("Java Date Test");

        String beginTime = "2020-03-30 16:31:48";
        String endTime = "2020-03-31 16:31:55";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date1 = format.parse(beginTime);
            Date date2 = format.parse(endTime);

            // before and after 使用非
            boolean before1 = !date1.before(date2);
            System.out.println("before1===" + before1);
            boolean before2 = !date2.before(date1);
            System.out.println("before2===" + before2);
            boolean before3 = !date1.before(date1);
            System.out.println("before3===" + before3);

            boolean after1 = !date1.after(date2);
            System.out.println("after1===" + after1);
            boolean after2 = !date2.after(date1);
            System.out.println("after2===" + after2);
            boolean after3 = !date1.after(date1);
            System.out.println("after3===" + after3);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
