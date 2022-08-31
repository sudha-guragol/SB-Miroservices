package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.StockPriceEntity;

//giving @repository is optional
public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Serializable> {
	
	
//hql query(takes company name as i/p and o/p as companystockprice
	//if v have a primaey key v have predefined method to aceess ,company name is not a primary key so we need to go for findBy method or customQueries
	//this is a custom query
	
	@Query("select companyStockPrice from StockPriceEntity where companyName=:companyName")
	public Double findStockPriceByCompanyName(String companyName);
	
}
