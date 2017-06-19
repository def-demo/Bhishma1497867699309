package com.altimetrik.test_app.api;

import com.altimetrik.test_app.model.*;

import com.altimetrik.test_app.api.service.SecureMessageContentDetailsApiService;

import com.altimetrik.test-app.exception.NotFoundException;

import com.altimetrik.test_app.model.SecureMessageContentDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )
public class SecureMessageContentDetailsApi {

   @Autowired
   private SecureMessageContentDetailsApiService service;
  

  @RequestMapping(value = "/secure_message_content_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<SecureMessageContentDetails>> findAllSecureMessageContentDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<SecureMessageContentDetails>>(service.findAllSecureMessageContentDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/secure_message_content_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< SecureMessageContentDetails> updateSecureMessageContentDetails(@RequestBody SecureMessageContentDetails secureMessageContentDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<SecureMessageContentDetails>(service.updateSecureMessageContentDetails(secureMessageContentDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/secure_message_content_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< SecureMessageContentDetails> addSecureMessageContentDetails(@RequestBody SecureMessageContentDetails secureMessageContentDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<SecureMessageContentDetails>(service.addSecureMessageContentDetails(secureMessageContentDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/secure_message_content_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< SecureMessageContentDetails> findByIdSecureMessageContentDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<SecureMessageContentDetails>(service.findByIdSecureMessageContentDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/secure_message_content_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteSecureMessageContentDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteSecureMessageContentDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
