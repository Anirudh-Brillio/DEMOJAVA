package com.Capstone.AdminService.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Capstone.AdminService.DAO.RefundRepository;
import com.Capstone.AdminService.Entity.RefundEntity;


@Service
public class AdminService {
	
	
	@Autowired
	private RefundRepository refundRepo;
    
   
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
