package testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestException {
	@Rule
	public ExpectedException except = ExpectedException.none();
	//methode1
@Test(expected =Exception.class )
public void testNumber()
{
	Integer.parseInt("22a");

}
//methode2

@Test
public void testException()
{
except.expect(Exception.class);
String a="hello";
a.lastIndexOf(0);

}
}
