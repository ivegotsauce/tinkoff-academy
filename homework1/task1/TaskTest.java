package homework1.task1;


import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void userTest() {
        User u1 = new User(1, "Alexander", "Sharipov");
        User u2 = new User(2, "Alexander", "Sharipov");
        assertEquals(u1, u2);
        assertNotEquals(u1.hashCode(), u2.hashCode());
    }

    @Test
    public void messageTest() {
        Message m1 = new Message(1, "Hello!");
        Message m2 = new Message(4, "Hi!");
        assertNotEquals(m1, m2);
        assertEquals(m1.hashCode(), m2.hashCode());
    }

}
