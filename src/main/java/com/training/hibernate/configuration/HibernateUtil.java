package com.training.hibernate.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.stat.EntityStatistics;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {

			Configuration configuration = new Configuration();
			configuration.configure();
			ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(registry);
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
	public static EntityStatistics getHibernateStats(String entityName){		
		return  sessionFactory.getStatistics().getEntityStatistics(entityName);				
	}

	
}
