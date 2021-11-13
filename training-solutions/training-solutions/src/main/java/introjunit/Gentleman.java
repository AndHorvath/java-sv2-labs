package introjunit;

public class Gentleman {

    public String sayHello(String name) {
        if (name != null){
            return "Hello, " + name + "!"/* + "!"*/; // The part commented out has been used for testing JUnit.
        } else {
            return "Hello, Anonymous!";
        }
    }
}