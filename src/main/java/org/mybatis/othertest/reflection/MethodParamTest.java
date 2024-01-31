/**
 *    Copyright 2009-2023 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.mybatis.othertest.reflection;

import org.apache.ibatis.reflection.ParamNameUtil;
import org.mybatis.othertest.reflection.anno.Param1;
import org.mybatis.othertest.reflection.anno.Param2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

public class MethodParamTest {

    public static void main(String[] args) throws Exception{

        Class<?> clazz = Class.forName("org.apache.ibatis.reflection.ParamNameUtil");

        Method method = clazz.getMethod("getParamNames", Method.class);

        List<String> paramNames = ParamNameUtil.getParamNames(method);
        //paramNames.forEach(System.out::println);
        Class<? extends MethodParamTest> clazz1 = MethodParamTest.class;
        Method method1 = clazz1.getDeclaredMethod("test", String.class, String.class, Integer.class, Integer.class);

        Class<?>[] parameterTypes = method1.getParameterTypes();

        System.out.println(Arrays.toString(parameterTypes));

        Annotation[][] parameterAnnotations = method1.getParameterAnnotations();

        System.out.println(Arrays.toString(parameterAnnotations));
    }

    void test(@Param2 @Param1 String a, @Param1 String b, @Param1 @Param2 Integer a1, Integer b1){

    }
}
