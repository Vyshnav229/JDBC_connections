package com.example.quickstart;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.employee;

public class main1 {
	public static void main(String args[]) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_jpa");
    	EntityManager em = emf.createEntityManager();
    	EntityTransaction et = em.getTransaction();
    	try {
//			List<employee> li = em.createQuery("from employee", employee.class).getResultList();
//			for(employee e : li) {
//				System.out.println("id :" + e.getId());
//				System.out.println("rollnum :" + e.getRollno());
//				System.out.println("email :" + e.getCourse());
//			}
    		int id = 2;
    		et.begin();
    		employee e = em.find(employee.class, id);
    		if(e != null) {
//    			em.remove(e);
//    			System.out.println("successfully deleted");
//    			et.commit();
//    			e.setRollno("249");
//    			e.setCourse("sap");
//    			em.merge(e);
    			System.out.println("roll num :" + e.getRollno());
    			System.out.println("course :" + e.getCourse());
    			et.commit();
//    			System.out.println("data updated successfully");
    		} else {
    			System.out.println("employee not found with this id");
    		}
    		
		} catch (Exception e2) {
			e2.printStackTrace();
		}
    	finally {
			emf.close();
			em.close();
		}
	}

}
