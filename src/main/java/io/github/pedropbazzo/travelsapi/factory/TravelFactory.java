package io.github.pedropbazzo.travelsapi.factory;

import io.github.pedropbazzo.travelsapi.model.Travel;

/**
 * Interface that provides method for manipulate an object Travel.
 * 
 * @author Pedro Bazzo
 */
public interface TravelFactory {

	Travel createTravel (String type);
}
