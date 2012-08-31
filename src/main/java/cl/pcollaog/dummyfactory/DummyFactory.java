package cl.pcollaog.dummyfactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author pcollaog
 * 
 */
public class DummyFactory {

	/**
	 * 
	 */
	private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	private static Logger logger = LoggerFactory.getLogger(DummyFactory.class);

	private static final String VALUE_OF = "valueOf";

	public static <T> T createDummy(Class<T> clazz) {
		try {
			return createNumberInstance(clazz);
		} catch (SecurityException e) {
			logger.error(e.getMessage(), e);
		} catch (IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
		} catch (NoSuchMethodException e) {
			logger.error(e.getMessage(), e);
		} catch (IllegalAccessException e) {
			logger.error(e.getMessage(), e);
		} catch (InvocationTargetException e) {
			logger.error(e.getMessage(), e);
		} catch (InstantiationException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	private static <T> T createNumberInstance(Class<T> clazz)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, InstantiationException {

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
		} else if (clazz.equals(Long.class)) {
			obj = clazz.getMethod(VALUE_OF, long.class).invoke(null,
					random.nextLong());
		} else if (clazz.equals(Short.class)) {
			obj = clazz.getMethod(VALUE_OF, short.class).invoke(null,
					(short) random.nextInt(Short.MAX_VALUE + 1));
		} else if (clazz.equals(BigInteger.class)) {
			obj = clazz.getMethod(VALUE_OF, long.class).invoke(null,
					random.nextLong());
		} else if (clazz.equals(Character.class)) {
			int index = random.nextInt(ALPHABET.length());
			obj = clazz.getMethod(VALUE_OF, char.class).invoke(null,
					ALPHABET.charAt(index));
		} else if (clazz.equals(Byte.class)) {
			byte[] bytes = new byte[1];
			random.nextBytes(bytes);
			obj = clazz.getMethod(VALUE_OF, byte.class).invoke(null, bytes[0]);
		} else if (clazz.equals(String.class)) {
			obj = clazz.getMethod(VALUE_OF, Object.class).invoke(null,
					UUID.randomUUID());
		} else {
			logger.debug("Not primitive type detected");

			obj = clazz.newInstance();

			Method[] methods = clazz.getMethods();

			for (Method method : methods) {
				if (isSetter(method)) {
					Class<?>[] typeParameters = method.getParameterTypes();

					logger.debug("typeParameter detected [{}]",
							typeParameters[0].getName());

					Object value = DummyFactory
							.createNumberInstance(typeParameters[0]);

					method.invoke(obj, value);
				}
			}
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

	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}
}
