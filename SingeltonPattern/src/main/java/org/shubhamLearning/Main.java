package org.shubhamLearning;

import org.shubhamLearning.Singleton.SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        String isHashCodeSame = singletonClass.getCode(singletonClass, singletonClass1);
        System.out.println(isHashCodeSame);
    }
}