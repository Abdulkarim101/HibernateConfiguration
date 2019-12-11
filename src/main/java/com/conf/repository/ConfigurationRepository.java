package com.conf.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.conf.entity.ConfigurationEntity;
import com.configuration.utility.ConfigurationUtility;

public class ConfigurationRepository {

	public void save(ConfigurationEntity configurationEntity) {
		SessionFactory sessionFactory = ConfigurationUtility.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(configurationEntity);
		session.getTransaction().commit();
		
		session.close();
	}
	
}
