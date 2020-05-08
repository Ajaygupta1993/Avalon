package com.ms.avalon.master.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.ms.avalon.master.pojos.Enqmasterpoja;
import com.ms.avalon.master.service.enqService;
@Controller
public class EnqController {
	@Autowired
	enqService enqser;
	
	
	/*@RequestMapping("/Master/Ajax/submitEnq")
	public @ResponseBody String submitEnq(String CN,String MN,String EM,String SD,String SC,String QUA,String YR,String SR,String STD,String COM,String DT,String TI){
		
		
		System.out.println(CN+"   "+MN+" "+EM+" "+SD+" "+SC+" "+QUA+" "+YR+" "+SR+""+STD+""+COM+""+DT+""+TI);
		
		enqser.submitEnq(CN,MN,EM,SD,SC,QUA,YR,SR,STD,COM,DT,TI);
		
		
		return"ok";
		
		
	}*/
	@RequestMapping("/Master/Ajax/SearchEnq")
	public String SearchEnq(String Keyword,Model map){
		List<Enqmasterpoja> liEnq= enqser.searchEnquary(Keyword);
		map.addAttribute("enq", liEnq);
		return "enquiry/EnqSearchResult";
		
		
	}

}
