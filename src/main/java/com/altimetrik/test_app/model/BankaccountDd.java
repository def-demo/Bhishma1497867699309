package com.altimetrik.test_app.model;



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
public class BankaccountDd  {
  
  
   
  
  @Id
   
  
  private Integer accountNo = null;
  
   
   
  
  private String customerId = null;
  
   
   
  
  private Double balance = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getAccountNo() {
    return accountNo;
  }
  public void setAccountNo(Integer accountNo) {
    this.accountNo = accountNo;
  }

  
  /**
   * {}
   **/
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  
  /**
   * {}
   **/
  public Double getBalance() {
    return balance;
  }
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankaccountDd bankaccountDd = (BankaccountDd) o;
    return Objects.equals(accountNo, bankaccountDd.accountNo) &&
        Objects.equals(customerId, bankaccountDd.customerId) &&
        Objects.equals(balance, bankaccountDd.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, customerId, balance);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankaccountDd {\n");
    
    sb.append("  accountNo: ").append(accountNo).append("\n");
    sb.append("  customerId: ").append(customerId).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

