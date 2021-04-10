package io.github.pedropbazzo.travelsapi.enumeration;

/**
 * Enum that classifies the travel's type.
 * 
 * @author Pedro Bazzo
 *
 */
public enum TravelTypeEnum {
	
	RETURN("RETURN"), ONE_WAY("ONE-WAY"), MULTI_CITY("MULTI-CITY");
	
	private String value;
	
	private TravelTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	/**
	 * Method that returns the value in the Enum.
	 * 
	 * @author Pedro Bazzo
	 * 
	 * @param value
	 * @return a TravelTypeEnum
	 */
	public static TravelTypeEnum getEnum(String value) {
		
		for(TravelTypeEnum t : values()) {
			if(value.equals(t.getValue())) {
				return t;
			}
		}
		
		throw new RuntimeException("Type not found.");
	}

}
