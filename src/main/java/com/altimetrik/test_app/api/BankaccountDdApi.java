package com.altimetrik.test_app.api;

import com.altimetrik.test_app.model.*;

import com.altimetrik.test_app.api.service.BankaccountDdApiService;

import com.altimetrik.test-app.exception.NotFoundException;

import com.altimetrik.test_app.model.BankaccountDd;

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
public class BankaccountDdApi {

   @Autowired
   private BankaccountDdApiService service;
  

  @RequestMapping(value = "/bankaccount_dd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<BankaccountDd>> findAllBankaccountDd()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<BankaccountDd>>(service.findAllBankaccountDd(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankaccount_dd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< BankaccountDd> updateBankaccountDd(@RequestBody BankaccountDd bankaccountDd
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<BankaccountDd>(service.updateBankaccountDd(bankaccountDd), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankaccount_dd", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< BankaccountDd> addBankaccountDd(@RequestBody BankaccountDd bankaccountDd
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<BankaccountDd>(service.addBankaccountDd(bankaccountDd), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankaccount_dd/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< BankaccountDd> findByIdBankaccountDd(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<BankaccountDd>(service.findByIdBankaccountDd(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/bankaccount_dd/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteBankaccountDd(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteBankaccountDd(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
