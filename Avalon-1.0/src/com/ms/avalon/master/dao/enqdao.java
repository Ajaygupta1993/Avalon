package com.ms.avalon.master.dao;

import java.util.List;

import com.ms.avalon.master.pojos.Enqmasterpoja;

public interface enqdao {
	
	//boolean Setenqdao(String cn,String mn);

	boolean Setenqdao(Enqmasterpoja enp);

	List<Enqmasterpoja> enqSearch(String keyword);

}
