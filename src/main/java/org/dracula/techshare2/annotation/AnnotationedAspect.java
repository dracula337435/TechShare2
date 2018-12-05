package org.dracula.techshare2.annotation;

/**
 * @author dk
 */
public class AnnotationedAspect {

    public void before(Annotationed annotationed){
        System.out.println("before annotation");
        System.out.println(annotationed.value());
    }

}
