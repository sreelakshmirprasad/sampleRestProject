package com.velankani.practice.epnm_trial.service;

import java.util.ArrayList;
import java.util.List;

import com.velankani.practice.epnm_trial.data.DaoClass;
import com.velankani.practice.epnm_trial.model.Model;

public class ModelService {
	
	public List<Model> getAllModels(){
		/*Model m1 = new Model(1, "Cisco NCS 1001", "Cisco NCS 1000 series");
		Model m2 = new Model(2, "Cisco NCS 1002", "Cisco NCS 1000 series");
		Model m3 = new Model(3, "Cisco NCS 1004", "Cisco NCS 1000 series");
		
		ArrayList<Model> list = new ArrayList<Model>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;*/
		
		return  DaoClass.getModels();
	}
	
	public Model getModel(int id){
		return DaoClass.getModel(id);
	}
	
	public Model getModelByNameAndSeries(String name, String series){
		//System.out.println("I am in Service class!!");
		return DaoClass.getModelByNameAndSeries(name, series);
	}
	
	public boolean addModel(Model model){
		DaoClass.addModel(model);
		return true;
	}
	
	public boolean deleteModel(int id){
		DaoClass.deleteModel(id);
		return true;
	}
}
