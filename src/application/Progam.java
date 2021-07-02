package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Saller;

public class Progam {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Saller seller = sellerDao.findByID(3);
		
		System.out.println(seller);
	}

}
