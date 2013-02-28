package com.sohu.suc.wenpingliu.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: wenpingliu
 * Date: 3/1/13
 * Time: 12:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Translater {
   public String translate(TestBean person){

       for(Method method : person.getClass().getMethods()){
           System.out.println("method: " + method.getName());
           if(method.isAnnotationPresent(isTranslate.class)){
                System.out.println("find Annotation" + method.getName());
            }
       }

       for(Field field : person.getClass().getFields()){
           System.out.println("field: " + field.getName());
           if(field.isAnnotationPresent(isTranslate.class)){
               System.out.println("find Annotation" + field.getName());
           }
       }

       StringBuilder stringBuilder = new StringBuilder();

       for(Field field : person.getClass().getDeclaredFields()){
           if(needTranslate(field)){
               try {
                   stringBuilder.append(field.get(person));
                   stringBuilder.append("_");
               } catch (IllegalAccessException e) {
                   e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
               }
           }
       }

       return stringBuilder.toString();

   }

   //filter
   private boolean needTranslate(Field filed){
       if (filed.isAnnotationPresent(isTranslate.class)){
           filed.getAnnotations();
           return false;
       }
       return true;
   }
}
