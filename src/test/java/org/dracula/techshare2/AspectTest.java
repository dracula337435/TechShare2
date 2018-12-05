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
        System.out.println("首先说明actualLogic()确有切面");
        System.out.println(testService.actualLogic());
        System.out.println("然后说明whetherWithAspect(...)自身没有切面，而且actualLogic()切面“失效”");
        System.out.println(testService.whetherWithAspect(false));
        System.out.println("已经说明whetherWithAspect(...)自身没有切面，用了手段后actualLogic()确有切面");
        System.out.println(testService.whetherWithAspect(true));
    }

    @Test
    public void testSim(){
        DemoClass demoClass = new DemoClass();
        System.out.println(demoClass.whetherWithAspect(false));
    }

    /**
     * 本意是说明子类的问题。
     * @author dk
     */
    public static class DemoClass extends TestServiceImpl{

        @Override
        public String actualLogic() {
            System.out.println("sim aspect");
            return super.actualLogic();
        }
    }

}
