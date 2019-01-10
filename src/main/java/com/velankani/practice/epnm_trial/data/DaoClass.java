package com.velankani.practice.epnm_trial.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.velankani.practice.epnm_trial.model.Model;

public class DaoClass {

	public static LinkedHashMap<Integer,Model> models = new LinkedHashMap<Integer,Model>();
	private static int id = 0;
	static{
		Model m1 = new Model(++id, "Cisco NCS 1001", "Cisco NCS 1000 series");
		Model m2 = new Model(++id, "Cisco NCS 1002", "Cisco NCS 1000 series");
		Model m3 = new Model(++id, "Cisco NCS 1004", "Cisco NCS 1000 series");
		
		models.put(m1.getId(),m1);
		models.put(m2.getId(), m2);
		models.put(m3.getId(),m3);
	}
	
	public static List<Model> getModels(){
		return new ArrayList<>(models.values());
	}
	
	public static Model getModel(int id){
		return models.get(id);
	}
	
	public static Model getModelByNameAndSeries(String name, String series){
		//System.out.println("I am in Dao Class");
		for(Map.Entry<Integer,Model> entry : models.entrySet()){
			if(entry.getValue().getModelName().equalsIgnoreCase(name) && entry.getValue().getModelSeries().equalsIgnoreCase(series)){
				System.out.println("I am here!! In DaoClass!!");
				return entry.getValue();
			}
		}
		
		return null;
	}
	
	
	public static boolean addModel(Model model){
		models.put(model.getId(),model);
		return true;
	}
	
	public static boolean deleteModel(int id){
		models.remove(id);
		return true;
	}
}
