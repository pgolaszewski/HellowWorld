import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import hellowworld.Greeter;
import org.junit.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }

}