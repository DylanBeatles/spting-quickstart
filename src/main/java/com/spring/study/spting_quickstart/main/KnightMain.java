/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2016 All Rights Reserved.
 */
package com.spring.study.spting_quickstart.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.study.spting_quickstart.knight.Knight;

/**
 * 
 * @author wb-zhanglu.y
 * @version $Id: KnightMain.java, v 0.1 May 25, 2016 3:15:35 PM wb-zhanglu.y Exp $
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "/META-INF/spring/knight.xml");
        Knight knight = context.getBean(Knight.class);
        System.out.println(knight.fight());
        context.close();
    }
}
