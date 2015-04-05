package clases_internas;

import static org.junit.Assert.assertSame;
import org.junit.Test;

public class StackTest {

    @Test
    public void testStack() {
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.show();
        assertSame(s.peek(), "c");
        assertSame(s.pop(), "c");
        assertSame(s.peek(), "b");
        s.show();
    }
}
