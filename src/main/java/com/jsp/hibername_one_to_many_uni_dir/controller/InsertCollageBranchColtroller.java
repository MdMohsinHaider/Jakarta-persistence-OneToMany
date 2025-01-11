package com.jsp.hibername_one_to_many_uni_dir.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.jsp.hibername_one_to_many_uni_dir.dao.CollageBranchDao;
import com.jsp.hibername_one_to_many_uni_dir.entity.Branch;
import com.jsp.hibername_one_to_many_uni_dir.entity.Collage;


public class InsertCollageBranchColtroller {
    public static void main(String[] args) {
        CollageBranchDao branchDao = new CollageBranchDao();
     
//        Branch branch1 = new Branch(435,"CSE","A-Block");
//        Branch branch2 = new Branch(436,"ME","E-Block");
//        Branch branch3 = new Branch(437,"CIVIL","D-Block");
//        
//        List<Branch> branchs = new ArrayList<Branch>(Arrays.asList(branch1,branch2,branch3));
//        Collage collage = new Collage(430, "harish", "harish@gmail.com", "Bangalore", branchs);
//        
//        branchDao.saveCollageBrancheDao(collage, branchs);
        
        boolean a = branchDao.deleteBranchByBranchId(435);
        System.out.println(a);
    }
}
