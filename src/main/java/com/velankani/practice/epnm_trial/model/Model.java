package com.velankani.practice.epnm_trial.model;


//@XmlRootElement
public class Model {
	private int id;
	private String modelName;
	private String modelSeries;
	
	public Model(){
		
	}
	
	public Model(int id, String modelName, String modelSeries) {
		super();
		this.id = id;
		this.modelName = modelName;
		this.modelSeries = modelSeries;
	}
	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelSeries() {
		return modelSeries;
	}
	public void setModelSeries(String modelSeries) {
		this.modelSeries = modelSeries;
	}
	
	
}
