package com.altimetrik.test_app.api.service.impl;

import com.altimetrik.test_app.api.service.*;
import com.altimetrik.test_app.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.test_app.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.test_app.model.Transaction;

import java.util.List;
import com.altimetrik.test-app.exception.NotFoundException;

@Service
@Transactional
public class TransactionApiServiceImpl implements TransactionApiService {
		  	  
	  @Autowired
	
  	  private TransactionRepository  transactionRepository ;
	   
  
  
				
			
      @Override
      public List<Transaction> findAllTransaction()
      throws NotFoundException {
      
        
  		
  		
  			return transactionRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transaction updateTransaction(Transaction transaction)
      throws NotFoundException {
      
         
        	return transactionRepository.save(transaction);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transaction addTransaction(Transaction transaction)
      throws NotFoundException {
      
         
        	return transactionRepository.save(transaction);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Transaction findByIdTransaction(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return transactionRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTransaction(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
