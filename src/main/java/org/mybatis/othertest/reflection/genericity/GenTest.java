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
package org.mybatis.othertest.reflection.genericity;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class GenTest {

    public static void main(String[] args) throws Exception {

        Class<ClassDemo> clazz = ClassDemo.class;
        Field field = clazz.getDeclaredField("list");
        Type fieldType = field.getGenericType();
        System.out.println(fieldType);
        Class<?> declaringClass = field.getDeclaringClass();
        System.out.println(declaringClass);

    }

    private static class ClassDemo{

      private List<String> list;

      private Map<String,Integer> map;

        public List<String> getList() {
            return list;
        }

        public void setList(List<String> list) {
            this.list = list;
        }

        public Map<String, Integer> getMap() {
            return map;
        }

        public void setMap(Map<String, Integer> map) {
            this.map = map;
        }
    }
}
