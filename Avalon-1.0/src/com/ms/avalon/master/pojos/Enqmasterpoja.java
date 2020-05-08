package com.ms.avalon.master.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="enquerymaster")
public class Enqmasterpoja {
	@Id
	@GeneratedValue
	@Column(name="EnqId")
	private int enqid;
	@Column(name="CndName")
	private String cndname;

	@Column(name="MobNo")
	private String mobno;
	
	public String getCndname() {
		return cndname;
	}
	public void setCndname(String cndname) {
		this.cndname = cndname;
	}
	/*@Column (name="Email")
	public String Email;
	@Column (name="SltDom")
	public String SltDom;
	@Column (name="SltCrs")
	private String SltCrs;
*/

/*
	@Column (name="StDmd")
	public String StDmd;
	@Column (name="Comment")
	public String Comment;
	@Column (name="Date")
	public String Date;
	@Column (name="Time")
	public String Time;*/
	

	public int getEnqid() {
		return enqid;
	}
	public void setEnqid(int enqid) {
		this.enqid = enqid;
	}

	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	

}
