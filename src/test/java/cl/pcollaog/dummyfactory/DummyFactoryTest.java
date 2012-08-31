package cl.pcollaog.dummyfactory;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pcollaog
 * 
 */
public class DummyFactoryTest {

	private static Logger logger = LoggerFactory
			.getLogger(DummyFactoryTest.class);

	@Test
	public void testDummyFactoryInteger() {
		Class<Integer> type = Integer.class;
		Integer value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryDouble() {
		Class<Double> type = Double.class;
		Double value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryBoolean() {
		Class<Boolean> type = Boolean.class;
		Boolean value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryFloat() {
		Class<Float> type = Float.class;
		Float value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryShort() {
		Class<Short> type = Short.class;
		Short value = DummyFactory.createDummy(type);
		assertNotNull(value);
		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryByte() {
		Class<Byte> type = Byte.class;
		Byte value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryCharacter() {
		Class<Character> type = Character.class;
		Character value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryString() {
		Class<String> type = String.class;
		String value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryBigInteger() {
		Class<BigInteger> type = BigInteger.class;
		BigInteger value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

	@Test
	public void testDummyFactoryBigDecimal() {
		Class<BigDecimal> type = BigDecimal.class;
		BigDecimal value = DummyFactory.createDummy(type);
		assertNotNull(value);

		logger.info("Type [{}] Value [{}]", type, value);
	}

}
