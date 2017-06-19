package com.altimetrik.test_app.api.service.impl;

import com.altimetrik.test_app.api.service.*;
import com.altimetrik.test_app.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.test_app.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.test_app.model.BankaccountDd;

import java.util.List;
import com.altimetrik.test-app.exception.NotFoundException;

@Service
@Transactional
public class BankaccountDdApiServiceImpl implements BankaccountDdApiService {
		  	  
	  @Autowired
	
  	  private BankaccountDdRepository  bankaccountDdRepository ;
	   
  
  
				
			
      @Override
      public List<BankaccountDd> findAllBankaccountDd()
      throws NotFoundException {
      
        
  		
  		
  			return bankaccountDdRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public BankaccountDd updateBankaccountDd(BankaccountDd bankaccountDd)
      throws NotFoundException {
      
         
        	return bankaccountDdRepository.save(bankaccountDd);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public BankaccountDd addBankaccountDd(BankaccountDd bankaccountDd)
      throws NotFoundException {
      
         
        	return bankaccountDdRepository.save(bankaccountDd);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public BankaccountDd findByIdBankaccountDd(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return bankaccountDdRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBankaccountDd(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
