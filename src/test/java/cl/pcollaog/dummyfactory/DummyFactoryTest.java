package cl.pcollaog.dummyfactory;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author pcollaog
 * 
 */
public class DummyFactoryTest {

	@Test
	public void testDummyFactoryInteger() {
		Integer value = DummyFactory.createDummy(Integer.class);
		assertNotNull(value);
	}

	@Test
	public void testDummyFactoryDouble() {
		Double value = DummyFactory.createDummy(Double.class);
		assertNotNull(value);
	}

	@Test
	public void testDummyFactoryBoolean() {
		Boolean value = DummyFactory.createDummy(Boolean.class);
		assertNotNull(value);
	}

}
