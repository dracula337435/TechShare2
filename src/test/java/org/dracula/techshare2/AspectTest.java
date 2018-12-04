package org.dracula.techshare2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author gxk
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "load.xml")
public class AspectTest {

    @Autowired
    TestService testService;

    @Test
    public void test(){
        System.out.println(testService.withoutAspect());
        System.out.println(testService.actualLogic());
    }

}
