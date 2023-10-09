package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldIntTest {
    @Test
    void test() {
        assertEquals(3, new HelloWorld().add(1, 2));
    }
}
