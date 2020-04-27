package com.cognizant.ormlearn.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.Repository.StockRepository;
import com.cognizant.ormlearn.model.Stock;

@Service
public class StockService {
	
	@Autowired
	StockRepository stockRepository;
	
	@Transactional
	public List<Stock> findAllFBStockTillSep(){
		return stockRepository.findAllFBStockTillSep();
	}
	
	@Transactional
	public List<Stock> findGoogleStockGT1250(){
		return stockRepository.findGoogleStockPriceGT1250();
	}
	
	@Transactional
	public List<Stock> findTop3ByOrderByVolumeDesc(){
		return stockRepository.findTop3ByOrderByVolumeDesc();
	}
//	
	@Transactional
	public List<Stock> findTop3ByCodeOrderByClose(String code){
		return stockRepository.findTop3ByCodeOrderByClose(code);
	}
}
