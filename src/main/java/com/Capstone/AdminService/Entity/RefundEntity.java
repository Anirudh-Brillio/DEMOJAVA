package com.Capstone.AdminService.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;


@Entity
@Table(name = "REFUND")
public class RefundEntity {

    @Id
    @Column(name = "REFUND_ID", length = 55, nullable = false)
    private String refundId;

    @Column(name = "USERS_ID", length = 55)
    private String usersId;

    @Column(name = "ADMIN_USER_ID", length = 55)
    private String adminUserId;

    @Column(name = "AMOUNT", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "RECIEVER_ACCOUNT_NUMBER")
    private Integer receiverAccountNumber;

    @Column(name = "SOURCE_TRANSACTION_ID", length = 55)
    private String sourceTransactionId;

    @Column(name = "REFUND_APPROVAL_REQUIRED")
    private Boolean refundApprovalRequired;

    @Column(name = "REFUND_APPROVAL_STATUS", length = 55)
    private String refundApprovalStatus;

    @Column(name = "TIME_STAMP", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp timeStamp;

    @Lob
    @Column(name = "TIMELINE")
    private String timeline;

    // Getters and Setters

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getUsersId() {
        return usersId;
    }

    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getReceiverAccountNumber() {
        return receiverAccountNumber;
    }

    public void setReceiverAccountNumber(Integer receiverAccountNumber) {
        this.receiverAccountNumber = receiverAccountNumber;
    }

    public String getSourceTransactionId() {
        return sourceTransactionId;
    }

    public void setSourceTransactionId(String sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }

    public Boolean getRefundApprovalRequired() {
        return refundApprovalRequired;
    }

    public void setRefundApprovalRequired(Boolean refundApprovalRequired) {
        this.refundApprovalRequired = refundApprovalRequired;
    }

    public String getRefundApprovalStatus() {
        return refundApprovalStatus;
    }

    public void setRefundApprovalStatus(String refundApprovalStatus) {
        this.refundApprovalStatus = refundApprovalStatus;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }
}
