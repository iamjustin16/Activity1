package com.fimc.activity1;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

import resources.CalculatorResource;
//import resources.GtgResource;
import resources.PeopleResource;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
//		register(GtgResource.class);
		register(CalculatorResource.class);
		register(PeopleResource.class);
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
	}

}
