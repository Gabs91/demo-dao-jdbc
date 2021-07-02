package model.dao;

import java.util.List;

import model.entities.Saller;

public interface SellerDao {
	 void insert (Saller obj);
	 void update (Saller obj);
	 void deleteById(Integer id);
	  List<Saller> findAll();
	 
	Saller findByID(Integer id);
}
