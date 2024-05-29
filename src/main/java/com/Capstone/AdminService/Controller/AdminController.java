package com.Capstone.AdminService.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Capstone.AdminService.Service.AdminService;
import com.Capstone.AdminService.Service.VendorService;



@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    
    @Autowired
    private VendorService vendorService;
    
    @GetMapping("/vendorComplaint")
    public ResponseEntity<Map<String, Object>> getAllVendorComplaint() {
    	
    	Map<String, Object> result = new HashMap<>();
    	result.put("Message" , "Vendor complaints fetched easily");
    	result.put("data", vendorService.getAllVendorComplaints());
    	return ResponseEntity.ok(result);
    }
    @GetMapping("/vendorComplaint/open")
    public ResponseEntity<Map<String, Object>> getOpenVendorComplaints() {
        return vendorService.getOpenVendorComplaints();
    }
    @GetMapping("/vendorComplaint/close")
    public ResponseEntity<Map<String, Object>> getCloseVendorComplaints() {
        return vendorService.getCloseVendorComplaints();
    }
    @GetMapping("/pendingApproval")
    public ResponseEntity<Map<String, Object>> pendingApprovalList() {
        return adminService.getPendingApprovalList();
    }
    
}
