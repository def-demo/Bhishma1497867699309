package com.altimetrik.test_app.api.service;

import com.altimetrik.test_app.model.BankaccountDd;

import com.altimetrik.test-app.exception.NotFoundException;
import java.util.List;
public interface BankaccountDdApiService {
  
      List<BankaccountDd> findAllBankaccountDd()
      throws NotFoundException;
  
      BankaccountDd updateBankaccountDd(BankaccountDd bankaccountDd)
      throws NotFoundException;
  
      BankaccountDd addBankaccountDd(BankaccountDd bankaccountDd)
      throws NotFoundException;
  
      BankaccountDd findByIdBankaccountDd(Integer id)
      throws NotFoundException;
  
      void deleteBankaccountDd(Integer id)
      throws NotFoundException;
  
}
