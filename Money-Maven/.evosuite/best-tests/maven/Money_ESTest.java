/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 10 15:08:40 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money((-2730), "H'");
      Money money1 = new Money(601, "@RW_R:i`Ce^G");
      boolean boolean0 = money0.equals(money1);
      assertEquals(601, money1.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(1, (String) null);
      money0.getCurrency();
      assertEquals(1, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money((-3237), "");
      money0.getCurrency();
      assertEquals((-3237), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(0, "!bfi");
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-3490), "maven.Money");
      int int0 = money0.getAmount();
      assertEquals((-3490), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(0, "!bfi");
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money(1, "KOi*ctNa");
      Money money1 = money0.add(money0);
      assertEquals(2, money1.getAmount());
      assertEquals(1, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(1, "KOi*ctNa");
      Money money1 = new Money(1, (String) null);
      // Undeclared exception!
      try { 
        money0.equals(money1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(1, "");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money(0, "!bfi");
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money(1, "");
      int int0 = money0.getAmount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money(1, "Yf");
      Money money1 = new Money(1, "[f");
      boolean boolean0 = money0.equals(money1);
      assertEquals(1, money1.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money((-5538), "H[");
      boolean boolean0 = money0.equals("H[");
      assertEquals((-5538), money0.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money((-5538), "H[");
      boolean boolean0 = money0.equals(money0);
      assertEquals((-5538), money0.getAmount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money((-5538), "H[");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertEquals((-11076), money1.getAmount());
      assertEquals((-5538), money0.getAmount());
      assertFalse(money1.equals((Object)money0));
      assertFalse(boolean0);
  }
}
