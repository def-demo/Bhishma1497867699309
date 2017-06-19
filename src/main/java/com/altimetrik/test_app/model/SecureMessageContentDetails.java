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
public class SecureMessageContentDetails  {
  
  
   
  
  @Id
   
  
  private Long messageSeqId = null;
  
   
   
  
  private String messageContent = null;
  
   
   
  
  private String messageSenderId = null;
  
   
   
  
  private String messageSenderFullName = null;
  
   
   
  
  private String messageReceiverId = null;
  
   
   
  
  private String messageReceiverFullName = null;
  
   
   
  
  private Date messageSentDate = null;
  
   
   
  
  private String facilityId = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDate = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDate = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getMessageSeqId() {
    return messageSeqId;
  }
  public void setMessageSeqId(Long messageSeqId) {
    this.messageSeqId = messageSeqId;
  }

  
  /**
   * {}
   **/
  public String getMessageContent() {
    return messageContent;
  }
  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }

  
  /**
   * {}
   **/
  public String getMessageSenderId() {
    return messageSenderId;
  }
  public void setMessageSenderId(String messageSenderId) {
    this.messageSenderId = messageSenderId;
  }

  
  /**
   * {}
   **/
  public String getMessageSenderFullName() {
    return messageSenderFullName;
  }
  public void setMessageSenderFullName(String messageSenderFullName) {
    this.messageSenderFullName = messageSenderFullName;
  }

  
  /**
   * {}
   **/
  public String getMessageReceiverId() {
    return messageReceiverId;
  }
  public void setMessageReceiverId(String messageReceiverId) {
    this.messageReceiverId = messageReceiverId;
  }

  
  /**
   * {}
   **/
  public String getMessageReceiverFullName() {
    return messageReceiverFullName;
  }
  public void setMessageReceiverFullName(String messageReceiverFullName) {
    this.messageReceiverFullName = messageReceiverFullName;
  }

  
  /**
   * {}
   **/
  public Date getMessageSentDate() {
    return messageSentDate;
  }
  public void setMessageSentDate(Date messageSentDate) {
    this.messageSentDate = messageSentDate;
  }

  
  /**
   * {}
   **/
  public String getFacilityId() {
    return facilityId;
  }
  public void setFacilityId(String facilityId) {
    this.facilityId = facilityId;
  }

  
  /**
   * {}
   **/
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * {}
   **/
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * {}
   **/
  public String getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  
  /**
   * {}
   **/
  public Date getUpdatedDate() {
    return updatedDate;
  }
  public void setUpdatedDate(Date updatedDate) {
    this.updatedDate = updatedDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecureMessageContentDetails secureMessageContentDetails = (SecureMessageContentDetails) o;
    return Objects.equals(messageSeqId, secureMessageContentDetails.messageSeqId) &&
        Objects.equals(messageContent, secureMessageContentDetails.messageContent) &&
        Objects.equals(messageSenderId, secureMessageContentDetails.messageSenderId) &&
        Objects.equals(messageSenderFullName, secureMessageContentDetails.messageSenderFullName) &&
        Objects.equals(messageReceiverId, secureMessageContentDetails.messageReceiverId) &&
        Objects.equals(messageReceiverFullName, secureMessageContentDetails.messageReceiverFullName) &&
        Objects.equals(messageSentDate, secureMessageContentDetails.messageSentDate) &&
        Objects.equals(facilityId, secureMessageContentDetails.facilityId) &&
        Objects.equals(createdBy, secureMessageContentDetails.createdBy) &&
        Objects.equals(createdDate, secureMessageContentDetails.createdDate) &&
        Objects.equals(updatedBy, secureMessageContentDetails.updatedBy) &&
        Objects.equals(updatedDate, secureMessageContentDetails.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageSeqId, messageContent, messageSenderId, messageSenderFullName, messageReceiverId, messageReceiverFullName, messageSentDate, facilityId, createdBy, createdDate, updatedBy, updatedDate);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecureMessageContentDetails {\n");
    
    sb.append("  messageSeqId: ").append(messageSeqId).append("\n");
    sb.append("  messageContent: ").append(messageContent).append("\n");
    sb.append("  messageSenderId: ").append(messageSenderId).append("\n");
    sb.append("  messageSenderFullName: ").append(messageSenderFullName).append("\n");
    sb.append("  messageReceiverId: ").append(messageReceiverId).append("\n");
    sb.append("  messageReceiverFullName: ").append(messageReceiverFullName).append("\n");
    sb.append("  messageSentDate: ").append(messageSentDate).append("\n");
    sb.append("  facilityId: ").append(facilityId).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDate: ").append(createdDate).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDate: ").append(updatedDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

