package com.jsp.hibername_one_to_many_uni_dir.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Branch {
	
	@Id
	private int id;
	private String name;
	private String BuildingName;
	
}
