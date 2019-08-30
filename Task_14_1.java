package home.Task_14;
/*
Создать класс с несколькими методами.
Вызвать метод по имени заданном как строка используя рефлексию
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task_14_1 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClassReflection(myClass, "secondMethod");
    }

    private static void myClassReflection(MyClass myClass, String methodName) {
        try {
            Method method = myClass.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
