package com.Capstone.AdminService.Service.copy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.Capstone.AdminService.DAO.RefundRepository;
import com.Capstone.AdminService.DAO.VendorComplaintRepo;
import com.Capstone.AdminService.Entity.RefundEntity;
import com.Capstone.AdminService.Entity.VendorComplaintEntity;
import com.Capstone.AdminService.Service.VendorService;

@ExtendWith(MockitoExtension.class)
public class VendorServiceTest {

    @Mock
    private VendorComplaintRepo vendorRepo;
    
    @Mock
    private RefundRepository refundRepo;
    
    @InjectMocks
    private VendorService vendorService;
    
    @Test
    public void testGetAllVendorComplaints() {
        List<VendorComplaintEntity> vendorComplaintList = new ArrayList<>();
        vendorComplaintList.add(new VendorComplaintEntity());
        
        when(vendorRepo.findAll()).thenReturn(vendorComplaintList);
        
        Map<String, Object> result = vendorService.getAllVendorComplaints();
        
        assertNotNull(result);
        assertEquals("Vendor complaints fetched successfully", result.get("message"));
        assertNotNull(result.get("data"));
    }
    
    @Test
    public void testGetOpenVendorComplaints() {
        List<VendorComplaintEntity> openVendorComplaintList = new ArrayList<>();
        openVendorComplaintList.add(new VendorComplaintEntity());
        
        when(vendorRepo.findByVendorStatus("Open")).thenReturn(openVendorComplaintList);
        
        ResponseEntity<Map<String, Object>> response = vendorService.getOpenVendorComplaints();
        
        assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Open vendor complaints fetched successfully", response.getBody().get("message"));
        assertNotNull(response.getBody().get("data"));
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void testGetCloseVendorComplaintsPass() {
        List<VendorComplaintEntity> closedVendorComplaintList = new ArrayList<>();
        closedVendorComplaintList.add(new VendorComplaintEntity());
        
        when(vendorRepo.findByVendorStatus("Closed")).thenReturn(closedVendorComplaintList);
        
        ResponseEntity<Map<String, Object>> response = vendorService.getCloseVendorComplaints();
        
        assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Open vendor complaints fetched successfully", response.getBody().get("message"));
        assertNotNull(response.getBody().get("data"));
    }
    @SuppressWarnings("deprecation")
   	@Test
       public void testGetCloseVendorComplaintsFail() {
           List<VendorComplaintEntity> closedVendorComplaintList = new ArrayList<>();
           
           when(vendorRepo.findByVendorStatus("Closed")).thenReturn(closedVendorComplaintList);
           
           ResponseEntity<Map<String, Object>> response = vendorService.getCloseVendorComplaints();
           
           assertNotNull(response);
           assertEquals(200, response.getStatusCodeValue());
           assertEquals("No open vendor complaints found", response.getBody().get("message"));
           assertNotNull(response.getBody().get("data"));
       }
       
    
    @Test
    public void testGetPendingApprovalList() {
        List<RefundEntity> refundList = new ArrayList<>();
        refundList.add(new RefundEntity());
        
        when(refundRepo.findByrefundApprovalRequired(true)).thenReturn(Optional.of(refundList));
        
        ResponseEntity<Map<String, Object>> response = vendorService.getPendingApprovalList();
        
        assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Data fetched successfully", response.getBody().get("message"));
        assertNotNull(response.getBody().get("data"));
    }
}
