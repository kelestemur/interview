import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class HelloWorldTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		assertEquals("hello", Greetings.SayHello());
	}

}
