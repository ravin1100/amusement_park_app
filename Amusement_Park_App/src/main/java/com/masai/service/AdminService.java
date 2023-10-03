package com.masai.service;

import java.time.LocalDateTime;
import java.util.List;

import com.masai.entity.Activity;
import com.masai.entity.Admin;

public interface AdminService {

	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public Admin deleteAdmin(Integer adminId);
	public List<Activity> getAllActivities(Integer customerId);
	public List<Activity> getAllActivities();  
//	public List<Activity> getActivitiesCustomerwise();
//	public List<Activity> getActivitiesDatewise();
//	public List<Activity> getAllActivitiesForDays(Integer customerId, LocalDateTime fromDate, LocalDateTime toDate);
	
}
