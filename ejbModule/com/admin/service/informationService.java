package com.admin.service;

import java.util.List;

import com.admin.entity.information;

public interface informationService {
	public void insert(information information);
	public information findInformation(long informationID);
	public void update(information information);
	public void delete(long informationID);
	public List<information> getAllInformation();
	public List<information> getfindInformationID(long informationID);
}

