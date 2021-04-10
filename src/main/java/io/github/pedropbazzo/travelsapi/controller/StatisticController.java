package io.github.pedropbazzo.travelsapi.controller;

import io.github.pedropbazzo.travelsapi.model.Statistic;
import io.github.pedropbazzo.travelsapi.model.Travel;
import io.github.pedropbazzo.travelsapi.service.StatisticService;
import io.github.pedropbazzo.travelsapi.service.TravelService;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * SpringBoot RestController that creates all service end-points related to the statistics.
 * 
 * @author Pedro Bazzo
 */
@RestController
@RequestMapping("/api-travels/statistics")
public class StatisticController {
	
	private static final Logger logger = Logger.getLogger(StatisticController.class);
	
	@Autowired
	private TravelService tripsService;
	
	@Autowired
	private StatisticService statisticsService;
	
	
	/**
	 * Method that returns the statistics based on the trips
	 * 
	 * @author Pedro Bazzo
	 * 
	 * @return ResponseEntity - 200
	 */
	@GetMapping(produces = { "application/json" })
	public ResponseEntity<Statistic> getStatistics() {
		
		List<Travel> trips = tripsService.find();
		Statistic statistics = statisticsService.create(trips);
		
		logger.info(statistics);
		
		return ResponseEntity.ok(statistics);
	}

}
