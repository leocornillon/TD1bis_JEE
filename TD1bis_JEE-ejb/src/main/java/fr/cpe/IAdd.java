package fr.cpe;

import java.util.List;

import javax.ejb.Local;

@Local
public interface IAdd{
	double add(List<Double> a);
}
