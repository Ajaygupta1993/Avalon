package com.ms.avalon.master.dao.rdbms;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.ms.avalon.master.dao.enqdao;
import com.ms.avalon.master.pojos.Enqmasterpoja;

public class Enqdaordbms extends DBConnectionDao implements enqdao {

	
	

	@Override
	public boolean Setenqdao(Enqmasterpoja enp) {
		hibernateTemplate.save(enp);
		//System.out.println("dao"+mn+""+mn);
		return false;
	}

	@Override
	public List<Enqmasterpoja> enqSearch(String keyword) {
		System.out.println( keyword);
		DetachedCriteria cre = DetachedCriteria.forClass(Enqmasterpoja.class);
	List<Enqmasterpoja> li=	hibernateTemplate.findByCriteria(cre.add(Restrictions.like("cndname", keyword, MatchMode.START)));
		for (Enqmasterpoja emp : li) {
			System.out.println(emp.getCndname());
		}
		
		return li;
		
	}

	
	
	

}
