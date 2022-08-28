package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Department d = new Department(1, "eu");
		
		Seller s = new Seller(1, "ele", "le@gmail.com", new Date(), 3000.0, d);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(s);
		
	}

}
