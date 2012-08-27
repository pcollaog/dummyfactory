package cl.pcollaog.dummyfactory;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pcollaog
 * 
 */
public class DummyFactory {

	private static Logger logger = LoggerFactory.getLogger(DummyFactory.class);

	private static final String VALUE_OF = "valueOf";

	public static <T> T createDummy(Class<T> clazz) {
		try {
			return createNumberInstance(clazz);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static <T> T createNumberInstance(Class<T> clazz)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {

		logger.debug("Create Random instance");
		Random random = new Random();

		Object obj = null;
		if (clazz.equals(Integer.class)) {
			obj = clazz.getMethod(VALUE_OF, int.class).invoke(null,
					random.nextInt());
		} else if (clazz.equals(Double.class)) {
			obj = clazz.getMethod(VALUE_OF, double.class).invoke(null,
					random.nextDouble());
		} else if (clazz.equals(Boolean.class)) {
			obj = clazz.getMethod(VALUE_OF, boolean.class).invoke(null,
					random.nextBoolean());
		} else if (clazz.equals(Float.class)) {
			obj = clazz.getMethod(VALUE_OF, float.class).invoke(null,
					random.nextFloat());
		} else if (clazz.equals(Short.class)) {
			obj = clazz.getMethod(VALUE_OF, short.class).invoke(null,
					(short) random.nextInt(Short.MAX_VALUE + 1));
		} else if (clazz.equals(String.class)) {
			obj = clazz.getMethod(VALUE_OF, Object.class).invoke(null,
					UUID.randomUUID());
		}

		if (obj != null) {
			logger.debug("Random value invoke static method valueOf [{}]",
					obj.toString());
			logger.debug("Cast to return type [{}]", clazz.toString());
			return clazz.cast(obj);
		}

		logger.debug("Not implemented yet... other object types");
		logger.debug("Returning null, implement me!");

		return null;
	}
}
