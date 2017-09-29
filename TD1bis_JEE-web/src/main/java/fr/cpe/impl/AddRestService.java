package fr.cpe.impl;

import java.util.List;

import javax.inject.Inject;

import org.jboss.logging.Logger;

import fr.cpe.IAdd;
import fr.cpe.IAddRestService;

public class AddRestService implements IAddRestService {
	
	Logger logger = Logger.getLogger(AddRestService.class.getName());
	
	@Inject
	private IAdd addService;
	
	@Override
	public Double add(List<Double> a){
		logger.info(">>> add() - " + a);
		
		return addService.add(a);
	}
}