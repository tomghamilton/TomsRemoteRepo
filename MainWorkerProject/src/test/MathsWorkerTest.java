/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tom.workers.MathsWorker;
/**
 * @author Tom
 *
 */
public class MathsWorkerTest {

	MathsWorker worker = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		worker = new MathsWorker();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		worker = null;
	}

	/**
	 * Test method for {@link MathsWorker#adder(int, int)}.
	 */
	@Test
	public void testAdder() {
		assertEquals(worker.adder(1,2),3);
	}

	/**
	 * Test method for {@link MathsWorker#multiplyer(int, int)}.
	 */
	@Test
	public void testTimeser() {
		assertEquals(worker.multiplyer(3,5),15);
	}
	
	/**
	 * Test method for {@link MathsWorker#multiplyer(int, int)}.
	 */
	@Test
	public void testDivider() {
		assertEquals(worker.divider(15,5),3);
	}
	
	/**
	 * Test method for {@link MathsWorker#multiplyer(int, int)}.
	 */
	@Test
	public void testSubtractor() {
		assertEquals(worker.subtracter(5,3),2);
	}
}
