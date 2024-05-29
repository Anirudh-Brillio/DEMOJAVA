package com.Capstone.AdminService.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Capstone.AdminService.Entity.VendorComplaintEntity;

public interface VendorComplaintRepo extends JpaRepository<VendorComplaintEntity, String>{
	List<VendorComplaintEntity> findByVendorStatus(String vendorStatus);
}