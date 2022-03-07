package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
public class Test {
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();	

Validation v;
@Before
public void initialiser()
{
v=new Validation();	

}

@org.junit.Test
public void verifDiv()
{
assertTrue(v.verifdiv(10));	
}
@org.junit.Test
public void verifConversion()
{
	assertTrue(v.conversible("33"));
	
}
@org.junit.Test
public void verifsup()
{
assertEquals(true, v.verifsup(14, 12));	
}
@org.junit.Test
public void verifDifferent()
{
assertTrue(v.verifdiff(12, 10));	
}
@org.junit.Test
public void verifPaire()
{
assertTrue(v.verifparite(6));	
}

@org.junit.Test
public void verifChaine()
{
assertTrue(v.verifEmpty(""));	
}
@SuppressWarnings("deprecation")
@org.junit.Test
public void verifFact()
{
assertTrue(v.factoriel(3)==6);	

}
//methode1
@org.junit.Test(expected = Exception.class)
public void whenExceptionThrown_thenExpectationSatisfied() {
String test = null;
test.length();
}
//methode2
@org.junit.Test
public void whenExceptionThrown_thenRuleIsApplied() {
exceptionRule.expect(Exception.class);
exceptionRule.expectMessage("For input string"); //facultatif
Integer.parseInt("1a");
}

}
