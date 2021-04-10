package io.github.pedropbazzo.travelsapi.factory.impl;

import io.github.pedropbazzo.travelsapi.enumeration.TravelTypeEnum;
import io.github.pedropbazzo.travelsapi.factory.TravelFactory;
import io.github.pedropbazzo.travelsapi.model.Travel;

/**
 * Factory class for the Travel entity.
 * 
 * @author Pedro Bazzo
 */
public class TravelFactoryImpl implements TravelFactory {

	@Override
	public Travel createTravel (String type) {
		
		if (TravelTypeEnum.ONE_WAY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.ONE_WAY);
		} else if (TravelTypeEnum.MULTI_CITY.getValue().equals(type)) {
			return new Travel(TravelTypeEnum.MULTI_CITY); 
		}
		
		return new Travel(TravelTypeEnum.RETURN);
	}

}
