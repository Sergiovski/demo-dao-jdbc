package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		
		System.out.println("=== Test 1: Seller findById ======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: Seller findByDepartment =====");
		Department department = new Department(2, " ");
		List<Seller> sellersList = sellerDao.findByDepartment(department);
		for (Seller s : sellersList) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 3: Seller findAll =====");
		sellersList = sellerDao.findAll();
		for (Seller s : sellersList) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 4: Seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: Seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Bob Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 6: Seller delete =====");
		System.out.print("Enter id for delete test: ");
		int id = input.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findById ===");
		Department dep = depDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: Department findAll =======");
		List<Department> list = depDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: Insert Department =======");
		Department dep1 = new Department(null, "R&D");
		depDao.insert(dep1);
		System.out.println("New Department inserted! New id: " + dep1.getId() + " Department Name: " + dep1.getName());

		System.out.println("\n=== TEST 4: Update Department =======");
		Department dep2 = depDao.findById(1);
		dep2.setName("Electronics&Telecommunications");
		depDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: Delete Department =======");
		System.out.print("Please enter id for delete test: ");
		id = input.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed");
		
		input.close();
	}
}
