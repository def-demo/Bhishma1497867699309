package com.altimetrik.test_app.model;

import java.util.Date;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;




@Entity
public class Transaction  {
  
  
   
  
  @Id
   
  
  private Integer transactionId = null;
  
   
   
  
  private String serviceName = null;
  
   
   
  
  private Date transactionDate = null;
  
   
   
  
  private Integer accountNo = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * {}
   **/
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  
  /**
   * {}
   **/
  public Date getTransactionDate() {
    return transactionDate;
  }
  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  
  /**
   * {}
   **/
  public Integer getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(Integer accountNo) {
    this.accountNo = accountNo;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(transactionId, transaction.transactionId) &&
        Objects.equals(serviceName, transaction.serviceName) &&
        Objects.equals(transactionDate, transaction.transactionDate) &&
        Objects.equals(accountNo, transaction.accountNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, serviceName, transactionDate, accountNo);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("  transactionId: ").append(transactionId).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("  transactionDate: ").append(transactionDate).append("\n");
    sb.append("  accountNo: ").append(accountNo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

