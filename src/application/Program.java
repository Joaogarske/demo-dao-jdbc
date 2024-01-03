package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
	
		
		SellerDao sellerDao = DaoFactory.createSelleDao();

		
		System.out.println("=== teste number 1 seller findById ====");
		Seller seller = sellerDao.findById(1);	
        System.out.println(seller);
        
        
        System.out.println("\n=== teste number 2 find department list ===");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj: list) {
        	System.out.println(obj);
        }
        
        System.out.println("\n=== teste number 3 find All ===");
     
       list = sellerDao.findAll();
        for(Seller obj: list) {
        	System.out.println(obj);
        }
	}

}
