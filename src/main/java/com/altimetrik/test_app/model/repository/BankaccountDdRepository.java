package com.altimetrik.test_app.model.repository;

import com.altimetrik.test_app.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BankaccountDdRepository extends JpaRepository<BankaccountDd, Integer>{

}



