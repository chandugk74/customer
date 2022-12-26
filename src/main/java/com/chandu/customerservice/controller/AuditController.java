package com.chandu.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chandu.customerservice.service.AuditService;

public class AuditController {
	@Autowired
	AuditService auditService;

////Get full Audit Part Number Table details
//	@ApiOperation(value = "Get Audit Part Number", notes = "Full Table Details")
	@RequestMapping(value = "/auditPartNumberFull", method = RequestMethod.GET)
	public List<com.chandu.customerservice.dto.AuditPartNumber> getAuditPartNumber() {
		return auditService.getAllAuditPartNumber();
	}

	//// Post data to Audit Part Number Table
//	@ApiOperation(value = "Post data to Audit Part Number", notes = "insert audit Details")
	@RequestMapping(value = "/auditPartNumber", method = RequestMethod.POST)
	public com.chandu.customerservice.dto.AuditPartNumber postAuditPartNumber(
			@RequestBody com.chandu.customerservice.dto.AuditPartNumber auditPartNumber) {
		return auditService.postAuditPartNumber(auditPartNumber);
	}

	// Get Audit Part Number Table details based on filtration
//	@ApiOperation(value = "filter data", notes = "Details Based On filtration")
	@RequestMapping(value = "/auditPartNumber", method = RequestMethod.GET)
	public List<com.chandu.customerservice.dto.AuditPartNumber> getAuditPartNumberByFilter(
			@RequestBody com.chandu.customerservice.dto.AuditPartNumber auditPartNumber) {
		return auditService.getAuditPartNumberByParameters(auditPartNumber);
	}
}
