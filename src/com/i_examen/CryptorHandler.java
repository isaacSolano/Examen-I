package com.i_examen;

import com.i_examen.TestBean.CrypterDependencyBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CryptorHandler {
    static ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
    static BeanFactory factory = context;
    static CrypterDependencyBean crypter = (CrypterDependencyBean) factory.getBean("CrypterDependencyBean");

    public String encrypt (String text) {
        return crypter.encrypt(text);
    }

    public String decrypt (String crypted) {
        return crypter.decrypt(crypted);
    }
}
