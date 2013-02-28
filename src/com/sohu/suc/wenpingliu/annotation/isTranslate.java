package com.sohu.suc.wenpingliu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: wenpingliu
 * Date: 2/28/13
 * Time: 11:36 PM
 * To change this template use File | Settings | File Templates.
 */

@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface isTranslate {
      String value();
}
