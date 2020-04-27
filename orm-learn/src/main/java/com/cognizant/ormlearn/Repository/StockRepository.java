package com.cognizant.ormlearn.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Stock;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer>{
	
	@Query("select s from Stock s where "
			+ "s.code='FB' and s.date like '2019-09%' ")
	List<Stock> findAllFBStockTillSep();
	
	@Query("select s from Stock s where "
			+ "s.code='GOOGL' and s.close > 1250")
	List<Stock> findGoogleStockPriceGT1250();
//	
	List<Stock> findTop3ByOrderByVolumeDesc();
//	
	List<Stock> findTop3ByCodeOrderByClose(String code);
}
