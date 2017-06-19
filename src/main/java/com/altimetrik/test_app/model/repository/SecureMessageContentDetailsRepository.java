package com.altimetrik.test_app.model.repository;

import com.altimetrik.test_app.model.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface SecureMessageContentDetailsRepository extends JpaRepository<SecureMessageContentDetails, Long>{

}



