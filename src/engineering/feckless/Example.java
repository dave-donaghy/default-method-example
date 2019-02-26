package engineering.feckless;

import engineering.feckless.examples.MyType;

public class Example {

    public static void main(String[] args) {
	MyType myObject = new MyType();

	myObject.foo();
	myObject.bar();
	// myObject.baz(); // This does not compile!
    }
}
