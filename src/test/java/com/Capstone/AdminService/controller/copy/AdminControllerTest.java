package com.Capstone.AdminService.controller.copy;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.Capstone.AdminService.Controller.AdminController;
import com.Capstone.AdminService.Service.AdminService;
import com.Capstone.AdminService.Service.VendorService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class AdminControllerTest {

    @Mock
    private AdminService adminService;
    
    @Mock
    private VendorService vendorService;
    
    @InjectMocks
    private AdminController adminController;
    
    @Test
    public void getAllVendorComplaint() {
        Map<String, Object> dummyData = new HashMap<>();
        dummyData.put("key", "value");
        Map<String, Object> dummy = new HashMap<>();
        
        when(vendorService.getAllVendorComplaints()).thenReturn(dummy);
        
        ResponseEntity<Map<String, Object>> result = adminController.getAllVendorComplaint();
        
        assertNotNull(result);
    }

    @Test
    public void getOpenVendorComplaints() {
        Map<String, Object> dummyData = new HashMap<>();
        dummyData.put("key", "value");
        ResponseEntity<Map<String, Object>> dummy = new ResponseEntity<>(dummyData, HttpStatus.OK);
        
        when(vendorService.getOpenVendorComplaints()).thenReturn(dummy);
        
        ResponseEntity<Map<String, Object>> result = adminController.getOpenVendorComplaints();
        
        assertNotNull(result);
    }

    @Test
    public void getCloseVendorComplaints() {
        Map<String, Object> dummyData = new HashMap<>();
        dummyData.put("key", "value");
        ResponseEntity<Map<String, Object>> dummy = new ResponseEntity<>(dummyData, HttpStatus.OK);
        
        when(vendorService.getCloseVendorComplaints()).thenReturn(dummy);
        
        ResponseEntity<Map<String, Object>> result = adminController.getCloseVendorComplaints();
        
        assertNotNull(result);
    }

    @Test
    public void pendingApprovalList() {
        Map<String, Object> dummyData = new HashMap<>();
        dummyData.put("key", "value");
        ResponseEntity<Map<String, Object>> dummy = new ResponseEntity<>(dummyData, HttpStatus.OK);
        
        when(adminService.getPendingApprovalList()).thenReturn(dummy);
        
        ResponseEntity<Map<String, Object>> result = adminController.pendingApprovalList();
        
        assertNotNull(result);
    }
}
