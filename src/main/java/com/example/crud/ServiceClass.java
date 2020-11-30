package com.example.crud;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ServiceClass {
	 @Autowired
	 DaoWrapper daowrap;
     public void saveData(BeanClass obj) {
    	 	daowrap.savedata(obj);
     }
}
