package io.github.pedropbazzo.travelsapi.model;

import io.github.pedropbazzo.travelsapi.enumeration.TravelTypeEnum;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * Class that implements the Travel structure.
 * 
 * @author Pedro Bazzo
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	
	private Long id;
	private String orderNumber;
	private BigDecimal amount;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private TravelTypeEnum type;
	
	public Travel(TravelTypeEnum type){
		this.type = type;
	}

}
