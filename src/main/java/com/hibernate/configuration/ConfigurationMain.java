package com.hibernate.configuration;

import com.conf.entity.ConfigurationEntity;
import com.conf.repository.ConfigurationRepository;

public class ConfigurationMain {

	public static void main(String[] args) {

		ConfigurationRepository cr = new ConfigurationRepository();

		ConfigurationEntity cf = new ConfigurationEntity();
		cf.setMake("Mercedes");
		cf.setModel("E400");
		cf.setVclass("4 door");
		cf.setVinNo("EID4688966885");
		cf.setLicanse("EKI49895955");
		cf.setVyear("2018");
		cf.setColor("Red");
		
		
		cr.save(cf);
}
}