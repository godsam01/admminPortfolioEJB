package com.admin.sevicebean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.admin.entity.information;
import com.admin.service.informationService;

@Stateless
@Remote(informationService.class)
public class informationServiceBean implements informationService {
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;

	public void insert(information information) {
		this.port.persist(information);
	}

	public information findInformation(long informationID) {
		return this.port.find(information.class, informationID);
	}

	public void update(information information) {
		this.port.merge(information);
	}

	public void delete(long informationID) {
		information information = findInformation(informationID);
		if (information != null) {
			this.port.remove(information);
		}
	}

	public List<information> getAllInformation() {
		return this.port.createQuery("SELECT ent FROM information ent").getResultList();
	}
	public List<information> getfindInformationID(long informationID) {
		return this.port.createQuery("SELECT port FROM information port WHERE port.informationID LIKE :if").setParameter("if", informationID + "%")
				.getResultList();
	}
}
