package org.dracula.techshare2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author dk
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotationed {

    String value();

}
