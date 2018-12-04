package org.dracula.techshare2;

import org.springframework.aop.framework.AopContext;

/**
 * @author gxk
 */
public class TestServiceImpl implements TestService {

    @Override
    public String whetherWithAspect(boolean withAspect) {
        String temp = null;
        if(withAspect){
            temp = ((TestService)AopContext.currentProxy()).actualLogic();
        }else{
            temp = this.actualLogic();
        }
        System.out.println("in withoutAspect(), " + temp);
        return "without aspect";
    }

    @Override
    public String actualLogic() {
        return "hello gxk";
    }

}
