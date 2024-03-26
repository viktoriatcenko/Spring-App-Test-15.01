package ru.maxima;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = null;
        try {
            context = new ClassPathXmlApplicationContext(
                    "applicationContext.xml"
            );
        } catch (BeansException e) {
            throw new RuntimeException(e);
        }

        Person teacher = context.getBean("idOfBeanOfTeacher", Person.class);
    }
}
