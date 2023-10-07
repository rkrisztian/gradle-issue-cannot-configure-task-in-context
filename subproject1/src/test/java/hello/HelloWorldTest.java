package hello;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    void test() {
        assertEquals(3, new HelloWorld().add(1, 2));
    }
}
