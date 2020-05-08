package com.ms.avalon.master.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ms.avalon.master.dao.enqdao;
import com.ms.avalon.master.pojos.Enqmasterpoja;
import com.ms.avalon.master.service.enqService;

public class Enqserviceimpl implements enqService {
	
	@Autowired
	enqdao enqdaoo;

	@Override
	public List<Enqmasterpoja> searchEnquary(String keyword) {
		return enqdaoo.enqSearch(keyword);
		
		
		
		
	}

	
	
	/*@Override
	public boolean submitEnq(String CN,String MN,String EM,String SD,String SC,String QUA,String YR,String SR,String STD,String COM,String DT,String TI) {
		System.out.println("service"+CN);
		
		Enqmasterpoja enp = new Enqmasterpoja();
		enp.setCndname(CN);
		enp.setMobno(MN);
		enp.Email(EM);
		enp.StDmd(SD);
		enqdaoo.Setenqdao(enp);
		
		return false;*/
		
		
	}
	
    
