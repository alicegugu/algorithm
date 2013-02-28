/**
 * 
 */
package com.lightea.interview;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author alice
 *
 */
@RunWith(Parameterized.class)
public class CoinChangeTest {
	
    @Parameters
    public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][] {
            		{ 1,	new Object []{	1 				} }, 
            		{ 2,	new Object []{	2 				} }, 
            		{ 3,	new Object []{	1, 2			} }, 
            		{ 45,	new Object []{	5, 10,10,10,10	} }, 
            		{ 5,	new Object []{	5				} }, 
            		{ 6,	new Object []{	1, 5			} },
            		{ 10,	new Object []{	10				} }  
            });
    }

	CoinChange changer;
	Integer value;
	Object [] expected;
	
	
	public CoinChangeTest(Integer value, Object [] expected) {
		this.expected = expected;
		this.value = value;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
        HashSet<Integer> coins = new HashSet<Integer>();
        coins.add(new Integer(1));
        coins.add(new Integer(2));
        coins.add(new Integer(5));
        coins.add(new Integer(10));
        coins.add(new Integer(100));
        changer = new CoinChange(coins);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.lightea.interview.CoinChange#MakeChange(java.lang.Integer)}.
	 */
	@Test
	public void testMakeChange() {
        ArrayList<Integer> changes = changer.MakeChange(this.value);
        assertArrayEquals(changes.toArray(), this.expected);
	}

}
