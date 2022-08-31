package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="STOCK_PRICE_DTLS")
public class StockPriceEntity {
     @Id
	@Column(name="STOCK_PRICE_ID")
	private Integer stockPriceId;
	
	@Column(name="COMPANY_NAME")
	private String companyName;
	
	@Column(name="COMPANY_STOCK_PRICE")
	private Double companyStockPrice;
}
