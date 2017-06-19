package com.altimetrik.test_app.api.service;

import com.altimetrik.test_app.model.SecureMessageContentDetails;

import com.altimetrik.test-app.exception.NotFoundException;
import java.util.List;
public interface SecureMessageContentDetailsApiService {
  
      List<SecureMessageContentDetails> findAllSecureMessageContentDetails()
      throws NotFoundException;
  
      SecureMessageContentDetails updateSecureMessageContentDetails(SecureMessageContentDetails secureMessageContentDetails)
      throws NotFoundException;
  
      SecureMessageContentDetails addSecureMessageContentDetails(SecureMessageContentDetails secureMessageContentDetails)
      throws NotFoundException;
  
      SecureMessageContentDetails findByIdSecureMessageContentDetails(Long id)
      throws NotFoundException;
  
      void deleteSecureMessageContentDetails(Long id)
      throws NotFoundException;
  
}
