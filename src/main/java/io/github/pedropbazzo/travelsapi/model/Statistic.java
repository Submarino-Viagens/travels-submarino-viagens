package io.github.pedropbazzo.travelsapi.model;

import java.math.BigDecimal;


/**
 * Class that implements the Statistic structure.
 * 
 * @author Pedro Bazzo
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Statistic {
	
	private BigDecimal sum;
	private BigDecimal avg;
	private BigDecimal max;
	private BigDecimal min;
	private long count;

}
