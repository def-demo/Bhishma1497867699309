package com.altimetrik.test_app.api;

import com.altimetrik.test_app.model.*;

import com.altimetrik.test_app.api.service.TransactionApiService;

import com.altimetrik.test-app.exception.NotFoundException;

import com.altimetrik.test_app.model.Transaction;

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
public class TransactionApi {

   @Autowired
   private TransactionApiService service;
  

  @RequestMapping(value = "/transaction", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Transaction>> findAllTransaction()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Transaction>>(service.findAllTransaction(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transaction", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Transaction> updateTransaction(@RequestBody Transaction transaction
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transaction>(service.updateTransaction(transaction), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transaction", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Transaction> addTransaction(@RequestBody Transaction transaction
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transaction>(service.addTransaction(transaction), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transaction/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Transaction> findByIdTransaction(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Transaction>(service.findByIdTransaction(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/transaction/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTransaction(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteTransaction(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
