package com.velankani.practice.epnm_trial.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.velankani.practice.epnm_trial.model.Model;
import com.velankani.practice.epnm_trial.service.ModelService;

@Path("/models")
public class ModelResource {
	private ModelService modelService = new ModelService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Model> getAllModels(){
		return modelService.getAllModels();
	}
	
	@GET
	@Path("/getModel/{modelId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Model getModel(@PathParam("modelId") int id){
		//System.out.println("Model Fetched is : " + modelService.getModel(id).getModelName());
		return modelService.getModel(id);
	}
	
	@GET
	@Path("/getModelByNameAndSeries")
	@Produces(MediaType.APPLICATION_JSON)
	public Model getModelByName(@QueryParam("name") String name, @QueryParam("series") String series){
		//System.out.println("I am in Resource Class!!");
		return modelService.getModelByNameAndSeries(name, series);
	}
	
	@POST
	@Path("/addModel")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addModel(Model model){
		modelService.addModel(model);
		return "true";
	}
	
	@DELETE
	@Path("/removeModel/{modelId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteModel(@PathParam("modelId") int id){
		modelService.deleteModel(id);
		return "true";
	}
}
