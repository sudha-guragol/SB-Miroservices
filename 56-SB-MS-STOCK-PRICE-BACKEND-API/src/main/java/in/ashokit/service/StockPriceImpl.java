package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.StockPriceResponse;
import in.ashokit.repository.StockPriceRepository;

@Service
public class StockPriceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepo;
	
	@Autowired
	private Environment env;
	
	@Override
	public StockPriceResponse getStockPrice(String companyName) {
		Double stockPrice = stockPriceRepo.findStockPriceByCompanyName(companyName);
		
		StockPriceResponse response =new StockPriceResponse();
		
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPrice);
		
		//to know how load balancing is done
		String port = env.getProperty("server.port");
		response.setPortNumber(Integer.parseInt(port));
		
		return response;
	}

}
