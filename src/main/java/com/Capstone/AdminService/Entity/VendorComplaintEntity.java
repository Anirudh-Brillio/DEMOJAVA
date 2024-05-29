package com.Capstone.AdminService.Entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "VENDOR_COMPLAINT")
public class VendorComplaintEntity {

    @Id
    @Column(name = "VENDOR_COMPLAINT_ID", length = 55, nullable = false)
    private String vendorComplaintId;

    @Column(name = "COMPLAINT_ID", length = 55, nullable = false)
    private String complaintId;

    @Column(name = "VENDOR_STATUS", length = 55)
    private String vendorStatus;

    @Column(name = "ADMIN_STATUS", length = 55)
    private String adminStatus;

    @Column(name = "ADMIN_CLOSED_ID", length = 55)
    private String adminClosedId;

    @Column(name = "VENDOR_NAME", length = 55, nullable = false)
    private String vendorName;

    @Column(name = "AMOUNT", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "TIME_STAMP", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp timeStamp;

    // Getters and Setters

    public String getVendorComplaintId() {
        return vendorComplaintId;
    }

    public void setVendorComplaintId(String vendorComplaintId) {
        this.vendorComplaintId = vendorComplaintId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getVendorStatus() {
        return vendorStatus;
    }

    public void setVendorStatus(String vendorStatus) {
        this.vendorStatus = vendorStatus;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getAdminClosedId() {
        return adminClosedId;
    }

    public void setAdminClosedId(String adminClosedId) {
        this.adminClosedId = adminClosedId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }
}
