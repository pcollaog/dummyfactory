package cl.pcollaog.dummyfactory.dto;

/**
 * @author pcollaog
 * 
 */
public class DummyDTO {

	private String _dummyString;

	private Long _dummyLong;

	private Integer _dummyInteger;

	/**
	 * @return the dummyString
	 */
	public final String getDummyString() {
		return _dummyString;
	}

	/**
	 * @param dummyString
	 *            the dummyString to set
	 */
	public final void setDummyString(String dummyString) {
		_dummyString = dummyString;
	}

	/**
	 * @return the dummyLong
	 */
	public final Long getDummyLong() {
		return _dummyLong;
	}

	/**
	 * @param dummyLong
	 *            the dummyLong to set
	 */
	public final void setDummyLong(Long dummyLong) {
		_dummyLong = dummyLong;
	}

	/**
	 * @return the dummyInteger
	 */
	public final Integer getDummyInteger() {
		return _dummyInteger;
	}

	/**
	 * @param dummyInteger
	 *            the dummyInteger to set
	 */
	public final void setDummyInteger(Integer dummyInteger) {
		_dummyInteger = dummyInteger;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DummyDTO [");
		if (_dummyString != null) {
			builder.append("_dummyString=");
			builder.append(_dummyString);
			builder.append(", ");
		}
		if (_dummyLong != null) {
			builder.append("_dummyLong=");
			builder.append(_dummyLong);
			builder.append(", ");
		}
		if (_dummyInteger != null) {
			builder.append("_dummyInteger=");
			builder.append(_dummyInteger);
		}
		builder.append("]");
		return builder.toString();
	}

}
