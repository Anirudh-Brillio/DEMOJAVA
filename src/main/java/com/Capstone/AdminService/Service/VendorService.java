package com.Capstone.AdminService.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Capstone.AdminService.DAO.RefundRepository;
import com.Capstone.AdminService.DAO.VendorComplaintRepo;
import com.Capstone.AdminService.Entity.RefundEntity;
import com.Capstone.AdminService.Entity.VendorComplaintEntity;


@Service
public class VendorService {
	@Autowired
    private VendorComplaintRepo vendorRepo;
	
	@Autowired
	private RefundRepository refundRepo ;
	public Map<String, Object> getAllVendorComplaints() {
        List<VendorComplaintEntity> vendorComplaintList = vendorRepo.findAll();
        Map<String, Object> result = new HashMap<>();
        if (vendorComplaintList.isEmpty()) {
            result.put("message", "No vendor complaints found");
            return result;
        }
        result.put("message", "Vendor complaints fetched successfully");
        result.put("data", vendorComplaintList);
        return result;
    }
    public ResponseEntity<Map<String, Object>> getOpenVendorComplaints() {
        List<VendorComplaintEntity> openVendorComplaintList = vendorRepo.findByVendorStatus("Open");
        Map<String, Object> result = new HashMap<>();
        if (openVendorComplaintList.isEmpty()) {
            result.put("message", "No open vendor complaints found");
            return ResponseEntity.ok(result);
        }
        result.put("message", "Open vendor complaints fetched successfully");
        result.put("data", openVendorComplaintList);
        return ResponseEntity.ok(result);
    }
    public ResponseEntity<Map<String, Object>> getCloseVendorComplaints() {
        List<VendorComplaintEntity> openVendorComplaintList = vendorRepo.findByVendorStatus("Closed");
        Map<String, Object> result = new HashMap<>();
        if (openVendorComplaintList.isEmpty()) {
            result.put("message", "No open vendor complaints found");
            return ResponseEntity.ok(result);
        }
        result.put("message", "Open vendor complaints fetched successfully");
        result.put("data", openVendorComplaintList);
        return ResponseEntity.ok(result);
    }
    public ResponseEntity<Map<String, Object>> getPendingApprovalList() {
        Optional<List<RefundEntity>> refundList = refundRepo.findByrefundApprovalRequired(true);
        Map<String, Object> result = new HashMap<>();
        if (refundList.isPresent() && !refundList.get().isEmpty()) {
            result.put("message", "Data fetched successfully");
            result.put("data", refundList.get());
        } else {
            result.put("message", "No pending approval refunds found");
            result.put("data", null);
        }
        return ResponseEntity.ok(result);
    }
}
