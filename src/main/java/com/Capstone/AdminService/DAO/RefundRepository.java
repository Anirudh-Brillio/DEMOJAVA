package com.Capstone.AdminService.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Capstone.AdminService.Entity.RefundEntity;

public interface RefundRepository extends JpaRepository<RefundEntity, RefundEntity>{
	Optional<List<RefundEntity>> findByrefundApprovalRequired(Boolean ApprovalRequired);
}
