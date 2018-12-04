package org.dracula.techshare2;

/**
 * @author gxk
 */
public class TestServiceImpl implements TestService {

    @Override
    public String withoutAspect() {
        System.out.println("in withoutAspect(), "+actualLogic());
        return "without aspect";
    }

    @Override
    public String actualLogic() {
        return "hello gxk";
    }

}
