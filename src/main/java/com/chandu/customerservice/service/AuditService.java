package com.chandu.customerservice.service;

import java.util.List;

public interface AuditService {
	public List<com.chandu.customerservice.dto.AuditPartNumber> getAllAuditPartNumber();

	public com.chandu.customerservice.dto.AuditPartNumber postAuditPartNumber(com.chandu.customerservice.dto.AuditPartNumber auditPartNumber);

	public List <com.chandu.customerservice.dto.AuditPartNumber> getAuditPartNumberByParameters(com.chandu.customerservice.dto.AuditPartNumber auditPartNumber);
	
}
