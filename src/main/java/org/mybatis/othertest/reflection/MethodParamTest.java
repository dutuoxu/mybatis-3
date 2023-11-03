package org.mybatis.othertest.reflection;

import org.apache.ibatis.reflection.ParamNameUtil;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class MethodParamTest {

    public static void main(String[] args) throws Exception{

        Class<?> clazz = Class.forName("org.apache.ibatis.reflection.ParamNameUtil");

        Method method = clazz.getMethod("getParamNames", Method.class);

        List<String> paramNames = ParamNameUtil.getParamNames(method);
        paramNames.forEach(System.out::println);
    }
}
