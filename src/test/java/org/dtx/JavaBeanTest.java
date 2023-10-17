package org.dtx;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.junit.Test;

import java.util.Arrays;

public class JavaBeanTest {

    @Test
    public void test1(){

        Class<XMLMapperEntityResolver> clazz = XMLMapperEntityResolver.class;

        System.out.println(Arrays.toString(clazz.getDeclaredConstructors()));
    }
}
