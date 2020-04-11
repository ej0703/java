import static org.junit.Assert.*;
import org.junit.*;

public class CalculatorEx {
	Calculator obj;
	
	@Before
	public void prepare() {
		System.out.println("Prepare");
		obj = new Calculator();
	}
	@Test
	public void testAdd() {
		System.out.println("add");
		assertEquals(2, obj.add(1, 1));
	}
	@Test
	public void testSub() {
		System.out.println("sub");
		assertEquals(0, obj.sub(1, 1));
	}
	@Test
	public void testMul() {
		System.out.println("mul");
		assertEquals(5*4, obj.mul(5, 4));
	}
	@Test
	public void testDiv() {
		System.out.println("div");
		assertEquals(1/4, obj.div(1, 4));
	}
}
