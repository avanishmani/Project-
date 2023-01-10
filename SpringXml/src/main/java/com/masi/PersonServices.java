package com.masi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class PersonServices {
	@Autowired
	private Map<Person, Gym>    theMap  ;    // inject 3 entries with valid details 
    @Autowired
    @Qualifier("lit")
	private List<Person> theList;           // inject List of 5 Person object
    @Value("${ps.appName}")
	private String appName;                 // inject the AppName from the properties file **[ you can define app name as per your convenience. For Example AppName = “GymApplication” ]**

	//Hint: Make use of @Bean annotation to inject theMap and theList;** 

	public void printMap(){

	//print all the person's and their gym details from the Map
    Iterator<Map.Entry<Person, Gym>> itr=theMap.entrySet().iterator();
    while(itr.hasNext()) {
    	Map.Entry<Person, Gym> entry=itr.next();
    	System.out.println("Person = "+ entry.getKey()+" , Gym = "+ entry.getValue());
    }
	}

	public void printList(){

	//sort the List of Person according to the increasing order of the age 
		theList.sort((a,b)-> a.getAge()-b.getAge());
		theList.forEach(e->System.out.println(e.toString()));
	//print all the sorted Person Details

	}

	public void printAppName(){

	//print the injected appName
		System.out.println(appName);
    }
}
