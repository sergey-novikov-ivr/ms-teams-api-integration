package com.contactcenterlab.msteamsdemo.db;

import java.util.Date;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity
@Table  
public class TableModel {	
	
	@Id @Column private int id;
	@Column private String subject;
	@Column private Date startDate;
	@Column private Date endDate;
	@Column private String connectionLink;
	@Column private String tollNumber;
	@Column private String tollFreeNumber;
	@Column private String conferenceId;
	
}
