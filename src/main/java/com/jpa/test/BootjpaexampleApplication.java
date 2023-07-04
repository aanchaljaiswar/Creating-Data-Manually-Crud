package com.jpa.test;


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import com.jpa.test.entity.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;



@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//Creating single object of user
//		User user=new User();
//		user.setName("xyz");
//		user.setCity("Delhi");
//		user.setStatus("I love program");
//		
//		User use=userRepository.save(user);
//		System.out.println(use);

		
//		 //Create multiple object of users
//		User user1=new User();
//		user1.setName("Uttam");
//		user1.setCity("City1");
//		user1.setStatus("Python");
//		
//		User user2=new User();
//		user2.setName("Ankit");
//		user2.setCity("City2");
//		user2.setStatus("Gradle");
//		List<User> userList = new ArrayList<>();
//		userRepository.saveAll(Arrays.asList(user1, user2)).forEach(userList::add);
//		System.out.println(userList);
//
//		
//		
//		// Saving Single User
//		User resultUser = userRepository.save(user2);
//		
//		System.out.println("User"+ resultUser);
//		System.out.println("Done");
//
//		
//		 //Saving Multiple User
//		List<User> users=List.of(user1,user2);
////		
//		
//		
////		//save multiple object
//		Iterable<User> resultUser=userRepository.saveAll(users);
//		
//		resultUser.forEach(user->{
//		System.out.println(user);
//		});
//		
//		
//		System.out.println("User"+ resultUser);
//		System.out.println("Done");

		
		
		// update the user id 11
//		Optional<User> optional = userRepository.findById(253);
//		// User op= optional.get();
//
//		if (optional.isPresent()) {
//			// Entity found, get the User object from the Optional
//			User op = optional.get();
//			op.setName("Ankit Tiwari");
//			User res = userRepository.save(op);
//			System.out.println(res);
//
//			// Do something with the user
//			System.out.println("User found: " + op);
//		} else {
//			// Entity not found
//			System.out.println("ID not found in DB");
//		}
//		
		
		
		//how to get the data
		//findById(id)- return Optional Containing data

//		Iterable<User> itr =userRepository.findAll();
//		itr.forEach(user-> {System.out.println(user);});

		
		//Single Data Fetching
//		Optional<User> optional = userRepository.findById(253);
//		User op= optional.get();
//		System.out.println(op);
		
		//Deleting the user element
//		userRepository.deleteById(53);
//		System.out.println("Deleted Successfully...");
		
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		
//		userRepository.deleteAll();
		
		
//		//Customer Finds Methods
//	List<User> user = userRepository.findByName("Ankit Tiwari");
//		if(!user.isEmpty())
//		{
//			System.out.println("User Found " + user);
//		}else
//		{
//			System.out.println("User not  Found " + user);
//		}
	//user.forEach(e->{System.out.println(e);});
		

	
//		List<User> user1= userRepository.findByNameAndCity("Ankit", "City2");
//		user1.forEach(e->{System.out.println(e);});
		
		
		//Query Fetching from Method JPQL and Native Query
		
//		System.out.println("--------------------All User Data--------");
//		List<User> all = userRepository.getAllUser();
//		all.forEach(e->{System.out.println(e);});
//		
//		System.out.println("\n-----------Fetching name using where clause--");
//		
//		List<User> name = userRepository.getUserByName("Murat");
//		name.forEach(e->{System.out.println(e);});
//		
//		System.out.println("\n--------Fetching name and city using where clause---------");
//	
//		List<User> namencity= userRepository.getUserByNameAndCity("Murat","City3");
//		namencity.forEach(e->{System.out.println(e);});
//		
//		System.out.println("\n--------All User Data Using Native Query / Postgre Query---------");
//		userRepository.getUsers().forEach(e->{System.out.println(e);});
	}

}
