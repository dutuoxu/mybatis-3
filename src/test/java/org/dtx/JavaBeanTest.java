package org.dtx;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class JavaBeanTest {

    @Test
    public void test1(){

        ArrayList<Object> list = new ArrayList<>();
        System.out.println(Collection.class.isAssignableFrom(list.getClass()));
    }
}
