import org.junit.*;
import static org.junit.Assert.*;

public class HelloWorldTest {
	@Test
	public void helloWorldTest(){
		HelloWorld hello = new HelloWorld();
		assertEquals("hello", hello.hello());
	}
}
