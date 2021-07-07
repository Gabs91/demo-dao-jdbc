package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Saller;

public class Progam {

	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 : Seller FindByID ===");
		Saller seller = sellerdao.findByID(3);
		
		System.out.println(seller);
		
		System.out.println("\n === TEST 2 : Seller FindByDepartment ===");
		
		Departament departament = new Departament(2, null);
		List<Saller> list = sellerdao.findByDepartment(departament);
		
		for (Saller obj : list) {
			System.out.println(obj);
		}
	
		System.out.println("\n === TEST 3 : Seller FindAll ===");
		list = sellerdao.findAll();
	
		for (Saller obj : list) {
		System.out.println(obj);
		}
		
		System.out.println("\n === TEST 4 : Seller Insert ===");
		
		Saller newSaller = new Saller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departament );
		sellerdao.insert(newSaller);
		System.out.println("Inserted! new Id = " + newSaller.getId());
	}
}
