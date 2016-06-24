/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.remote.client.messages;

import com.clover.common2.Signature2;

@SuppressWarnings(value="unused")
public class PaymentResponse extends BaseResponse {

  private com.clover.sdk.v3.payments.Payment payment = null;
  private java.lang.Boolean isSale = false;
  private java.lang.Boolean isPreAuth = false;
  private java.lang.Boolean isAuth = false;
  private Signature2 signature = null;


  public PaymentResponse(boolean success, ResultCode result) {
    super(success, result);
  }
  /**
  * Set the field value
  * The payment from the sale
  *
  */
  public void setPayment(com.clover.sdk.v3.payments.Payment payment) {
    this.payment = payment;
  }

  /**
  * Get the field value
  * The payment from the sale
  */
  public com.clover.sdk.v3.payments.Payment getPayment() {
    return this.payment;
  }  
  /**
  * Set the field value
  */
  public void setIsSale(java.lang.Boolean isSale) {
    this.isSale = isSale;
  }

  /**
  * Get the field value
  */
  public java.lang.Boolean getIsSale() {
    return this.isSale;
  }  
  /**
  * Set the field value
  */
  public void setIsPreAuth(java.lang.Boolean isPreAuth) {
    this.isPreAuth = isPreAuth;
  }

  /**
  * Get the field value
  */
  public java.lang.Boolean getIsPreAuth() {
    return this.isPreAuth;
  }  
  /**
  * Set the field value
  */
  public void setIsAuth(java.lang.Boolean isAuth) {
    this.isAuth = isAuth;
  }

  /**
  * Get the field value
  */
  public java.lang.Boolean getIsAuth() {
    return this.isAuth;
  }  
  /**
  * Set the field value
  */
  public void setSignature(Signature2 signature) {
    this.signature = signature;
  }

  /**
  * Get the field value
  */
  public Signature2 getSignature() {
    return this.signature;
  }
}
