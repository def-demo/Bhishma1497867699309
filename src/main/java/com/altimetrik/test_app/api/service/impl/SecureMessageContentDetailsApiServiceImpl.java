package com.altimetrik.test_app.api.service.impl;

import com.altimetrik.test_app.api.service.*;
import com.altimetrik.test_app.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.test_app.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.test_app.model.SecureMessageContentDetails;

import java.util.List;
import com.altimetrik.test-app.exception.NotFoundException;

@Service
@Transactional
public class SecureMessageContentDetailsApiServiceImpl implements SecureMessageContentDetailsApiService {
		  	  
	  @Autowired
	
  	  private SecureMessageContentDetailsRepository  secureMessageContentDetailsRepository ;
	   
  
  
				
			
      @Override
      public List<SecureMessageContentDetails> findAllSecureMessageContentDetails()
      throws NotFoundException {
      
        
  		
  		
  			return secureMessageContentDetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public SecureMessageContentDetails updateSecureMessageContentDetails(SecureMessageContentDetails secureMessageContentDetails)
      throws NotFoundException {
      
         
        	return secureMessageContentDetailsRepository.save(secureMessageContentDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public SecureMessageContentDetails addSecureMessageContentDetails(SecureMessageContentDetails secureMessageContentDetails)
      throws NotFoundException {
      
         
        	return secureMessageContentDetailsRepository.save(secureMessageContentDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public SecureMessageContentDetails findByIdSecureMessageContentDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return secureMessageContentDetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteSecureMessageContentDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}
