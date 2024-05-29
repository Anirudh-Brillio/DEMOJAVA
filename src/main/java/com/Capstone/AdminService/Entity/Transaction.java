package com.Capstone.AdminService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRANSACTIONS")
public class Transaction {

    @Id
    @Column(name = "TRANSACTIONS_TRANSACTION_ID")
    private String transactionId;

    @Column(name = "TRANSACTIONS_AMOUNT")
    private Long transactionAmount;

    @Column(name = "TRANSACTIONS_USER_ID", nullable = false)
    private String userId;

    @Column(name = "TRANSACTIONS_SOURCE_ACCOUNT_NUMBER")
    private Long sourceAccountNumber;

    @Column(name = "TRANSACTIONS_SOURCE_BANK_NAME")
    private String sourceBankName;

    @Column(name = "TRANSACTIONS_RECEIVER_ACCOUNT_NUMBER")
    private Long receiverAccountNumber;

    @Column(name = "TRANSACTIONS_RECEIVER_BANK_NAME")
    private String receiverBankName;

    @Column(name = "TRANSACTIONS_CARD_NETWORK")
    private String cardNetwork;

    @Column(name = "TRANSACTIONS_TYPE", nullable = false)
    private String transactionType;

    @Column(name = "TRANSACTIONS_COUNTRY")
    private String transactionCountry;

    @Column(name = "TRANSACTIONS_STATUS", nullable = false)
    private String transactionStatus;

    @Column(name = "TRANSACTIONS_POINT_OF_FAILURE")
    private String pointOfFailure;

    @Column(name = "TRANSACTIONS_TIMESTAMP", insertable = false, updatable = false)
    private java.time.LocalDateTime timestamp;

    @Column(name = "TRANSACTIONS_REFUND_STATUS")
    private String refundStatus;

    // Getters and Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getSourceAccountNumber() {
        return sourceAccountNumber;
    }

    public void setSourceAccountNumber(Long sourceAccountNumber) {
        this.sourceAccountNumber = sourceAccountNumber;
    }

    public String getSourceBankName() {
        return sourceBankName;
    }

    public void setSourceBankName(String sourceBankName) {
        this.sourceBankName = sourceBankName;
    }

    public Long getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(Long receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public String getReceiverBankName() {
        return receiverBankName;
    }

    public void setReceiverBankName(String receiverBankName) {
        this.receiverBankName = receiverBankName;
    }

    public String getCardNetwork() {
        return cardNetwork;
    }

    public void setCardNetwork(String cardNetwork) {
        this.cardNetwork = cardNetwork;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionCountry() {
        return transactionCountry;
    }

    public void setTransactionCountry(String transactionCountry) {
        this.transactionCountry = transactionCountry;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getPointOfFailure() {
        return pointOfFailure;
    }

    public void setPointOfFailure(String pointOfFailure) {
        this.pointOfFailure = pointOfFailure;
    }

    public java.time.LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.time.LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }
}
