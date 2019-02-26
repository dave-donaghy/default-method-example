package engineering.feckless.examples;

public interface SomeInterface {

    public abstract void foo();

    public default void bar() {
        System.out.println("In default method SomeInterface.bar()");
    }

    public static void baz() {
        System.out.println("In static method SomeInterface.baz");
    }
}
