package com.jsp.hibername_one_to_many_uni_dir.dao;

import java.util.Iterator;
import java.util.List;

import com.jsp.hibername_one_to_many_uni_dir.entity.Branch;
import com.jsp.hibername_one_to_many_uni_dir.entity.Collage;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CollageBranchDao {
	
	EntityManager em = Persistence.createEntityManagerFactory("hibernate-a5").createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Collage saveCollageBrancheDao(Collage collage, List<Branch> branchs) {
		try {
			et.begin();
			
			for (Branch branch : branchs) {
				em.persist(branch);
			}
			
			em.persist(collage);
			et.commit();
			
			return collage;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean deleteBranchByBranchId(int branchId) {
		
		Branch branch = em.find(Branch.class, branchId);
		System.out.println(branch);
		
		Query query = em.createNativeQuery("delete from collage_branch where branchs_id=?1").setParameter(1, branchId);
		try {
			if (branch !=null) {
				et.begin();
				query.executeUpdate();
				em.remove(branch);
				et.commit();
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public boolean associateCollegeBranch(int collageId, List<Integer> branchid) {
		Query query = em.createNativeQuery("insert into collage_branch(Collage_id,branchs_id) values(?1,?2)");
		try {
			et.begin();
			for (Integer branch : branchid) {
				query.setParameter(1, collageId);
				query.setParameter(2, branch);
				query.executeUpdate();
				et.commit();
			}
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	

}
