import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author pjose
 *
 */
class GradeBookTester {

	GradeBook gbook1 ;
	GradeBook gbook2 ;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		gbook1 = new GradeBook(5);
		gbook2 = new GradeBook(5);
		
		gbook1.addScore(80.0);
		gbook1.addScore(90.0);
		gbook1.addScore(70.0);
		
		gbook2.addScore(90.0);
		gbook2.addScore(99.0);
		gbook2.addScore(60.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		GradeBook gbook1 = null;
		GradeBook gbook2 = null;
	}

	/**
	 * Test method for {@link GradeBook#addScore(double)}.
	 */
	@Test
	void testAddScore() {
		
		assertTrue(gbook1.toString().equals("80.0 90.0 70.0 "));
		assertTrue(gbook2.toString().equals("90.0 99.0 60.0 "));
		
		
		assertEquals(3, gbook1.getScoreSize());
		assertEquals(3, gbook2.getScoreSize());
	}

	/**
	 * Test method for {@link GradeBook#sum()}.
	 */
	@Test
	void testSum() {
		assertEquals(240, gbook1.sum() );
		assertEquals(249, gbook2.sum() );
	}

	/**
	 * Test method for {@link GradeBook#minimum()}.
	 */
	@Test
	void testMinimum() {
		assertEquals(70, gbook1.minimum() );
		
		assertEquals(60, gbook2.minimum() );
	}

	/**
	 * Test method for {@link GradeBook#finalScore()}.
	 */
	@Test
	void testFinalScore() {
		
		assertEquals(170, gbook1.finalScore() );
		
		assertEquals(189, gbook2.finalScore() );
	}

	/**
	 * Test method for {@link GradeBook#getScoreSize()}.
	 */
	@Test
	void testGetScoreSize() {
		assertEquals(3, gbook1.getScoreSize() );
		assertEquals(3, gbook2.getScoreSize() );
	}

	/**
	 * Test method for {@link GradeBook#toString()}.
	 */
	@Test
	void testToString() {

		assertTrue(gbook1.toString().equals("80.0 90.0 70.0 "));
		assertTrue(gbook2.toString().equals("90.0 99.0 60.0 "));
	}

}
