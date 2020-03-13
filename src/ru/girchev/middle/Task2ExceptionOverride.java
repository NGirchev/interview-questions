package ru.girchev.middle;

public class Task2ExceptionOverride {

    static class UncheckedParent {
        void method1() throws NullPointerException { throw new NullPointerException(); }
        void method2() throws RuntimeException { throw new RuntimeException(); }
    }
    static class UncheckedChild extends UncheckedParent {
        // Can be wider? Can I uncomment 12 line?
        void method1()
//                throws RuntimeException
        { super.method1(); }
        // Can be narrower? Can I uncomment 16 line?
        void method2()
//                throws NullPointerException
        { super.method2(); }
    }

    static class CheckedParent {
        void method1() throws Throwable { throw new Throwable(); }
        void method2() throws Exception { throw new Exception(); }
    }
    static class CheckedChild extends CheckedParent {
        // Can be narrower? Can I uncomment 27 and 35 line?
        void method1()
//                throws Exception
        {
            try {
                super.method1();
            } catch (Throwable throwable) {
//                throw new Exception(throwable);
            }
        }
        // Can be wider? Can I uncomment 37 and 42 line?
        void method2()
//                throws Throwable
        {
            try {
                super.method2();
            } catch (Exception e) {
//                throw new Throwable();
            }
        }
    }
}
