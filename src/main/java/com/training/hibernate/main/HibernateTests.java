package com.training.hibernate.main;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.training.hibernate.beans.*;
import com.training.hibernate.configuration.HibernateUtil;



public class HibernateTests {
	
	public static void main(String[] args){	
		
		HibernateTests hibernateTests = new HibernateTests();
		
		Session session = HibernateUtil.getSessionfactory().openSession();		
		session.beginTransaction();		
		
		//Basic Save example of customer
		session.save(hibernateTests.getCustomer());
		
		//Object States example
		//hibernateTests.understandingObjectStates(session);
		
		//Sample for Embedded Object
		//session.save(hibernateTests.embeddedObjectTest());
		
		//Sample for Embedded Object with overide
		//session.save(hibernateTests.emdeddedObjectWithAttributeOveride());
		
		//Saving Collection of Objects
		//session.save(hibernateTests.savingCollectionObjects());		
		
		//One To One Mapping Example
		//hibernateTests.OneToOneMappingTest(session);
		
		//One To Many Mapping Example
		//hibernateTests.OneToManyMappingTest(session);		
		
		//Inheritance example
		//hibernateTests.inheritanceExample(session);
		
		//hibernateTests.loadUserData(session);
		
		//hibernateTests.executeHQLQuery(session);
		
		//Named Query Example
		//hibernateTests.executeNamedQurey(session);
				
		session.getTransaction().commit();		
		session.close();
		
		//hibernateTests.executeLazyLoadingExample();
		
	//	hibernateTests.executeFirstLevelCacheExample();
		
		//hibernateTests.executeSecondLevelCacheExample();
		
	}
	
    @SuppressWarnings("deprecation")
	public Customer getCustomer(){
    	
    	Customer customer = new Customer();		
		customer.setName("Nasari");
		customer.setPhoneNo("900586486");
		customer.setDateOfBirth(new Date(2018, 12, 23));
		customer.setEmailId("NasariLanka@teradata.com");		
		return customer;
    	
    }
    
  public void understandingObjectStates(Session session){
	  
	  Customer customer = this.getCustomer();
	  session.save(customer);
	  customer.setName("Updated User");
	  
  }
  
 /* public Customer embeddedObjectTest(){	
		
		Customer customer = this.getCustomer();			
		
		Address address = new Address();
		address.setStreet("Srinager colony 3rd lane");
		address.setState("AP");
		address.setCity("Vijayawada");
		address.setPinCode(520011);
		
		customer.setHomeAddress(address);
		
		return customer;		
		
	}*/  
  
  /*public Customer emdeddedObjectWithAttributeOveride(){	
		
		Customer customer = new Customer();		
		
		customer.setName("Raviteja");
		customer.setPhoneNo("9000586486");
		customer.setEmailId("subramanyaraviteja@gmail.com");
		customer.setDateOfBirth(new Date());
		
		Address homeAddress = new Address();
		homeAddress.setStreet("Srinager colony 3rd lane");
		homeAddress.setState("AP");
		homeAddress.setCity("Vijayawada");
		homeAddress.setPinCode(520011);
		
		Address officeAddress = new Address();
		officeAddress.setStreet("Srinager colony 3rd lane");
		officeAddress.setState("AP");
		officeAddress.setCity("Vijayawada");
		officeAddress.setPinCode(520011);
		
		customer.setHomeAddress(homeAddress);
		customer.setOfficeAddress(officeAddress);
		
		return customer;		
		
	}*/
  
  
  public Customer savingCollectionObjects(){
  	
  	Customer customer = this.getCustomer();
  	
  	Address homeAddress = new Address();
	homeAddress.setStreet("Srinager colony 3rd lane");
	homeAddress.setState("AP");
	homeAddress.setCity("Vijayawada");
	homeAddress.setPinCode(520011);
	
	Address officeAddress = new Address();
	officeAddress.setStreet("Srinager colony 3rd lane");
	officeAddress.setState("AP");
	officeAddress.setCity("Vijayawada");
	officeAddress.setPinCode(520011);
  	
  	customer.getAddressList().add(homeAddress);
  	customer.getAddressList().add(officeAddress);
  	
  	return customer;
  	
  }  
  
  public void executeLazyLoadingExample(){
  	
  	Session session = HibernateUtil.getSessionfactory().openSession();		
  	session.beginTransaction();
  	
  	Customer customer = (Customer) session.get("com.hibernatedemo.beans.Customer", new Long(1)); 	
  	
  	session.getTransaction().commit();		
	session.close();
  	
  	for(Address address: customer.getAddressList()){
  		System.out.println(address.getCity());
  	}
  	
  }    

    
    public void OneToOneMappingTest(Session session){    	
    	
    	Customer customer = this.getCustomer();
    	OfferCode offerCode = new OfferCode("NEW2019",500);   	
    	
    	customer.setOfferCode(offerCode);
    	offerCode.setCustomer(customer);
    	
    	session.persist(customer); 
    	
    }
    
    
    public void OneToManyMappingTest(Session session){
    	
    	Customer customer = this.getCustomer(); 	   	
    	
    	Item item1 = new Item("Item1", 10, 20);
    	Item item2 = new Item("Item2", 20, 200);   	
    	
    	Bill billOne = new Bill();  
    	billOne.getItems().add(item1);
    	billOne.getItems().add(item2);
    	billOne.setBillDate(new Date());
    	billOne.generateBillAmount();  
    	billOne.setCustomer(customer);
    	
    	customer.getBills().add(billOne);
    	
    	
    	Item item3 = new Item("Item3", 11, 20);
    	Item item4 = new Item("Item4", 22, 200);   	
    	
    	Bill billTwo = new Bill(); 
    	billTwo.getItems().add(item3);
    	billTwo.getItems().add(item4);
    	billTwo.setBillDate(new Date());
    	billTwo.generateBillAmount();
    	billTwo.setCustomer(customer);
    	
    	customer.getBills().add(billTwo);    	
    	
    	session.persist(customer);    	
    }
   
    
    
    public void inheritanceExample(Session session){
    	
    	Vehicle vehicle = new Vehicle();
    	vehicle.setVehicleName("Vehicle");
    	
    	TwoWheeler bike = new TwoWheeler();
    	bike.setVehicleName("Yamaha FZ");
    	bike.setStreeingHandle("Streeing Yamaha");    	
    	
    	FourWheeler car = new FourWheeler();
    	car.setVehicleName("Baleno");
    	car.setSteeringCar("Streeing Car");
    	
    	session.save(vehicle);
    	session.save(bike);
    	session.save(car);
    	
    }
    
    public void loadUserData(Session session){
    	
    	for(int i=0;i<10;i++){    		
    		Customer customer = new Customer();
    		customer.setName("User"+i);
    		customer.setEmailId("user"+i+"@gmail.com");  
    		session.save(customer);
    	}    	
    }
	
    
    public void executeHQLQuery(Session session){	    	
    	
    	Query query = session.createQuery(" from Customer");
    	query.setFirstResult(4);
    	query.setMaxResults(2);  
    	List<Customer> customers = query.list(); 
    	for(Customer customer : customers){
    		System.out.println(customer.getName());
    	}
    	
    	
    	Query query2 = session.createQuery(" from Customer where custId = ?");  
    	query2.setInteger(0, 5);    	
    	customers = query2.list();  
    	
    	for(Customer customer : customers){
    		System.out.println(customer.getName());
    	}
    	
    	Query query3 = session.createQuery("select new map(custId,name) from Customer");
    	List<Map<Long,String>> maps = query3.list();    	
    	for(Map map: maps){
    		System.out.print(map.toString());
    	}  	
    	
    }
    
    
    public void executeNamedQurey(Session session){
    	
    	Query query = session.getNamedQuery("customer.byId");
    	query.setInteger(0, 5);
    	List<Customer> customers = query.list();
    	
    	for(Customer customer : customers){
    		System.out.println(customer.getName());
    	}
    	
    	Query query2 = session.getNamedQuery("customer.byName");
    	query2.setString(0, "User0");
    	customers = query2.list();   	
    
    	
    	for(Customer customer : customers){
    		System.out.println(customer.getName());
    	}
    	
    	
    }
    
    public void executeCriteriaQuery(Session session){
    	
    	Criteria criteria = session.createCriteria(Customer.class);
    	criteria.add(Restrictions.eq("name", "User5"))
    			.add(Restrictions.gt("custId", 2))
    			.add(Restrictions.or(Restrictions.gt("custId", 0),Restrictions.like("name", "%User%")));    	
    	List<Customer> customers =  criteria.list();
    	
    	for(Customer customer : customers){
    		System.out.println(customer.getName());
    	}   	
    	
    	
    }
    
    public void executeFirstLevelCacheExample(){
    	
    	Session session = HibernateUtil.getSessionfactory().openSession();
		
		session.beginTransaction();
    	
    	Customer customer = (Customer) session.get("com.hibernatedemo.beans.Customer", new Long(3));	    	
    	customer = (Customer) session.get("com.hibernatedemo.beans.Customer", new Long(3));	
    	
    	session.getTransaction().commit();
		
		session.close();
    	
    	System.out.println(customer.getName());  	
    	
    }
    
    
    
    public void executeSecondLevelCacheExample(){
    	
    	
    	//session 1
    	Session session = HibernateUtil.getSessionfactory().openSession();		
		session.beginTransaction();
    	
    	Customer customer = (Customer) session.get("com.hibernatedemo.beans.Customer", new Long(3));		
    	
    	session.getTransaction().commit();		
		session.close();
		
		
		
		//session 2
    	session = HibernateUtil.getSessionfactory().openSession();		
		session.beginTransaction();		
		
		customer = (Customer) session.get("com.hibernatedemo.beans.Customer", new Long(3));			
		
    	session.getTransaction().commit();		
		session.close();
    	
    	System.out.println(customer.getName());  	
    	
    }
    
    
    
   
	

}
