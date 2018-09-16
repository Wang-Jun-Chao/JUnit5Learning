package wjc.junit5.sample01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <pre>
 *
 * </pre>
 * Author: 王俊超
 * Date: 2018-09-16 09:53
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class FirstJUnit5Tests {
    @Test
    public void myFirstTest() {
        Assertions.assertEquals(2, 1+ 1);
    }
}
