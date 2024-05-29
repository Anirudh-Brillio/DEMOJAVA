package com.Capstone.AdminService.Service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Capstone.AdminService.DAO.RefundRepository;
import com.Capstone.AdminService.DAO.VendorComplaintRepo;
import com.Capstone.AdminService.Entity.VendorComplaintEntity;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class VendorServiceTest {

	@Mock
    private VendorComplaintRepo vendorRepo;
	
	@Mock
	private RefundRepository refundRepo ;
	
	@InjectMocks
	private VendorService vendorService;
	
@Test
public void getAllVendorComplaints() {
	List<VendorComplaintEntity> vendorComplaintList = new ArrayList<>();
	
	when(vendorRepo.findAll()).thenReturn(vendorComplaintList);
	Map<String, Object> result = vendorService.getAllVendorComplaints();
	
	assertNotNull(result);
}
	
	
}
