package com.masai.service;

import java.util.List;

import com.masai.entity.Activity;

public interface ActivityService {

	public Activity insertActivity(Activity activity);

	public Activity updateActivity(Activity activity);

	public Activity deleteActivity(Integer activityId);

	public List<Activity> viewActivitiesOfCharges(Float charges);

	public Integer countActivitiesOfCharges(Float charges);

}
