package org.shubhamLearning.Singleton;

import java.util.Objects;

/*

    When to use Singleton Class?
    Suppose we want only one object throughout the application @ that time we can crete Singleton Class
    Example :
        Creating DataBase Connection
        No matter what kind of request comes, but we'll connect to the same database each time
        So why create n number of objects for it let the one object do all the connection work
        and whenever I need to execute any query I'll use the same db connection object.


        How to create Singleton class
        1) Create one static class variable
        2) Make the constructor private
        3) Create on static method which will return us the object whenever we need it
            3.1) check if the class variable is null if it's than initialize it

 */
public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if (Objects.isNull(singletonClass)){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public String getCode(SingletonClass A,SingletonClass B){
        return A.hashCode() == B.hashCode() ? "We have got same object" : "Objects differ";
    }


}
