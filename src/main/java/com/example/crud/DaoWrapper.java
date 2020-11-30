package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoWrapper {
	@Autowired
	Dao dao;
	
	public int savedata(BeanClass obj) {
		
	    EntityClass ent = new EntityClass(obj.getName(),obj.getRating(),obj.getReview());
	    dao.save(ent);
	    this.getAll();
		return 1;
	}
	
	public void getAll() {
		System.out.print(dao.findAll());
	}
}
