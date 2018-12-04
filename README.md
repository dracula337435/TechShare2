# aop

小坑，aop中类内部调用，jdk动态代理会绕开aop，导致失效，cglib则不会

均在包org.dracula.techshare2下
TestService的actualLogic()有切面，withoutAspect()无，后者中调用了一下前者
启动测试AspectTest
可看到
* withoutAspect()无切面，actualLogic()有切面
* withoutAspect()中调用了actualLogic()，这次调用，后者切面“失效”

<aop:config>标签中，proxy-target-class默认为"false"，意即使用jdk动态代理，改为"true"意即使用cglib  

查到解决方法，<aop:config>标签中，expose-proxy置"true"  
代码中不直接调用本类，而是找被加切面的代理，((TestService)AopContext.currentProxy()).actualLogic();  
注意其中AopContext.currentProxy()即可得到有切面的代理