package com.masi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masi")
@PropertySource("a1.properties")
public class AppConfig {
	 Person p1=new Person(101, "Avanish", "amt@gmail.com", 25, "9451269954");
	 Person p2=new Person(102, "Manish", "manish@gmail.com", 35, "9785236910");
	 Person p3=new Person(103, "Anshika", "anshika@gmail.com", 21, "8796269954");
	 Person p4=new Person(104, "Shiv", "shiv@gmail.com", 18, "753669954");
	 Person p5=new Person(105, "Dev", "dev@gmail.com", 15, "7896549954");
	 Gym g1=new Gym(1, "TheGym", 7500);
	 Gym g2=new Gym(2, "StayFit", 9500);
	 Gym g3=new Gym(3, "Ror", 5500);
	@Bean
 public Map<Person, Gym> mapinput(){
	 Map<Person,Gym> mp=new HashMap<>();
	 mp.put(p1, g1);
	 mp.put(p2, g2);
	 mp.put(p3, g3);
	 
	 return mp;
 }
	@Bean("lit")
	public List<Person> enterPerson(){
		List<Person> pli=new ArrayList<>();
pli.add(p1);
pli.add(p2);
pli.add(p3);
pli.add(p4);
pli.add(p5);
return pli;
}
}
