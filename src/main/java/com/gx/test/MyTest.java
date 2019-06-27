package com.gx.test;

import com.google.common.base.Enums;

public class MyTest {

    public enum TestEnum{
        A,B,C,D
    }

    public static void main(String[] args) {

        TestEnum a = TestEnum.A;
        System.out.println(Enums.getField(a)); //public static final org.junzerg.Test$TestEnum org.junzerg.Test$TestEnum.A
        //or() 方法来源于Optional类
        System.out.println(Enums.getIfPresent(TestEnum.class, "D").or(TestEnum.A)); // D
        System.out.println(Enums.getIfPresent(TestEnum.class, "C").or(TestEnum.A));//C

    }
}
