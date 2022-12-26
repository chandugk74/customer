package com.chandu.customerservice.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.chandu.customerservice.dao.AuditPartNumberDao;
import com.chandu.customerservice.dto.AuditPartNumber;

public class AuditServiceImpl {
	
	@Autowired
	AuditPartNumberDao auditPartNumberDao;
	
	public List<com.chandu.customerservice.dto.AuditPartNumber> getAllAuditPartNumber() {
		List<AuditPartNumber> allAuditPartNumbers = auditPartNumberDao.getAllAuditPartNumber();
		List<com.chandu.customerservice.dto.AuditPartNumber> list = new ArrayList<>();
		for (AuditPartNumber auditPartNumber : allAuditPartNumbers) {
			com.chandu.customerservice.dto.AuditPartNumber partNumber = new com.chandu.customerservice.dto.AuditPartNumber();
			partNumber.setId(auditPartNumber.getId());
			partNumber.setPartNumberId(auditPartNumber.getPartNumberId());
			partNumber.setPosition(auditPartNumber.getPosition());
			partNumber.setActionType(auditPartNumber.getActionType());
			partNumber.setPallUserId(auditPartNumber.getPallUserId());
			partNumber.setFullName(auditPartNumber.getFullName());
			partNumber.setCreatedAt(auditPartNumber.getCreatedAt());
			partNumber.setReason(auditPartNumber.getReason());
			list.add(partNumber);
		}
		Collections.sort(list, (item1, item2)->item2.getId()-item1.getId());
		return list;
	}

	
	public com.chandu.customerservice.dto.AuditPartNumber postAuditPartNumber(
			com.chandu.customerservice.dto.AuditPartNumber auditPartNumber) {
		AuditPartNumber auditPartNumber1 = new AuditPartNumber();
		auditPartNumber1.setPartNumberId(auditPartNumber.getPartNumberId());
		auditPartNumber1.setPosition(auditPartNumber.getPosition());
		auditPartNumber1.setActionType(auditPartNumber.getActionType());
		auditPartNumber1.setPallUserId(auditPartNumber.getPallUserId());
		auditPartNumber1.setFullName(auditPartNumber.getFullName());
		auditPartNumber1.setCreatedAt(auditPartNumber.getCreatedAt());
		auditPartNumber1.setReason(auditPartNumber.getReason());
		auditPartNumberDao.postAuditPartNumber(auditPartNumber1);
		auditPartNumber.setId(auditPartNumber1.getId());
		return auditPartNumber;
	}

	public List<com.chandu.customerservice.dto.AuditPartNumber> getAuditPartNumberByParameters(
			com.chandu.customerservice.dto.AuditPartNumber auditPartNumber) {
		AuditPartNumber request = new AuditPartNumber();
//		request.setId(auditPartNumber.getId());
		request.setPartNumberId(auditPartNumber.getPartNumberId());
		request.setPosition(auditPartNumber.getPosition());
		request.setActionType(auditPartNumber.getActionType());
		request.setPallUserId(auditPartNumber.getPallUserId());
//		request.setFullName(auditPartNumber.getFullName());
		request.setCreatedAt(auditPartNumber.getCreatedAt());
//		request.setReason(auditPartNumber.getReason());
		List<AuditPartNumber> list = auditPartNumberDao.getAuditPartNumberByFilterByParameters(request);
		List<com.chandu.customerservice.dto.AuditPartNumber> response = new ArrayList<>();
		for (AuditPartNumber item : list) {
			com.chandu.customerservice.dto.AuditPartNumber view = new com.chandu.customerservice.dto.AuditPartNumber();
			view.setId(item.getId());
			view.setPartNumberId(item.getPartNumberId());
			view.setPosition(item.getPosition());
			view.setActionType(item.getActionType());
			view.setPallUserId(item.getPallUserId());
			view.setCreatedAt(item.getCreatedAt());
			view.setFullName(item.getFullName());
			view.setReason(item.getReason());
			response.add(view);
		}
		return response;
	}
}
