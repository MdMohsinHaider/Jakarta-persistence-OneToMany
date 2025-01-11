package com.jsp.hibername_one_to_many_uni_dir.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Collage {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String addre;
	@OneToMany
	private List<Branch> branchs;
}
