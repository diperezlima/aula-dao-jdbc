package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(1);

		System.out.println(dep);
		
		System.out.println("=== TEST 2: department findByName ===");
		dep = departmentDao.findByName("Electronics");

		System.out.println(dep);
		
		System.out.println("=== TEST 3: department findAll ===");
		List<Department> deps = departmentDao.findAll();
		
		for (Department d : deps) {
			System.out.println(d);
		}
		
		System.out.println("=== TEST 4: department update ===");
		dep = departmentDao.findById(1);
		dep.setName("Cards");
		departmentDao.update(dep);
		
		
		System.out.println("=== TEST 5: department insert ===");
		Department newDep = new Department(null, "D1");
		departmentDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
		
		System.out.println("=== TEST 6: department deleteById ===");
		System.out.println("Insert id to delete:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted!");
		
		sc.close();
	}

}
