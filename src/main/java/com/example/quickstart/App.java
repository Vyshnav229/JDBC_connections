package com.example.quickstart;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.address;
import model.employee;


public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_jpa");
    	EntityManager em = emf.createEntityManager();
    	employee e = new employee();
    	e.setRollno("249");
    	e.setCourse("sap");
    	address ad = new address();
    	ad.setCity("kkd");
    	ad.setCountry("india");
    	ad.setPincode(533001);
    	e.setAddress(ad);
    	EntityTransaction et = em.getTransaction();
    	
    	try {
    		et.begin();
    		em.persist(e);
    		et.commit();
			System.out.println("successfully inserted");
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
    	
    	
     
    }
}
