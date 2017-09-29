package fr.cpe.impl;

import java.util.List;

import javax.ejb.Stateless;
import org.jboss.logging.Logger;

import fr.cpe.IAdd;

@Stateless
public class Add implements IAdd {
	
	Logger logger = Logger.getLogger(Add.class.getName());
	
	@Override
	public double add(List<Double> a){
		logger.info(">>> add() - " + a);
		
		return a.stream().mapToDouble(Double::doubleValue).sum();
	}
}