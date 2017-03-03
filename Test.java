
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.stream.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Test {
	
	/*
	public static void main(String args[]){
		int test = 6;
		
		if(test == 9){			// not equal !=, <, >, >=, etc. 
			System.out.println("yes");
		}else{
			System.out.println("this is else");
		}
		System.out.println(1+1);
		System.out.println(1.0+1.0);
	}
	
	*/
	
	
	private static int Solution1(List<Integer> headsAndTails){
		
		
		System.out.println("length of A/2 is " + (float)headsAndTails.size()/2);
		System.out.println("Sum is " + (float)headsAndTails.stream().mapToInt(Integer::intValue).sum());
		
		if((float)headsAndTails.stream().mapToInt(Integer::intValue).sum() > (float)(headsAndTails.size()/2)){
			
			System.out.println("Remove the 0's, so remove " + Collections.frequency(headsAndTails, 0) + " many");
			
		}else{
			System.out.println("Remove the 1's, so remove " + Collections.frequency(headsAndTails, 1) + " many");
		}
		
		return 0;
				
	}
	
	
	public static void main(String args[]) throws Exception{
		
		List<Integer> HeadsAndTails = Arrays.asList(1,0,1,1,1,0,0,1,0,0);

		Solution1(HeadsAndTails);

// ===============================================================================
		System.out.println("\n\n");
// ===============================================================================

		String FileName = "src/citia.csv";
		
		File file = new File(FileName);
		try{
			
			Scanner inputStream = new Scanner(file);
			inputStream.next(); // We do this to skip the header line, otherwise keep it in
			// initialise sum and count variables to get the average
			double sum = 0;
			double numberOfPrices = 0;
			while(inputStream.hasNext()){
				
				String data = inputStream.next(); // retrieve the whole line 
				String[] values = data.split(","); // explode on commas
//				String closingPrice = values[4]; // if you want to keep them as string 
				double closingPrice = Double.parseDouble(values[4]); // convert to double so we can manipulate them.
				sum += closingPrice;
				numberOfPrices ++; 
//				System.out.println(closingPrice);
				
			}
			inputStream.close();
			System.out.println("Average = " + (sum/numberOfPrices));
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		// ===============================================================================
				System.out.println("\n\n");
		// ===============================================================================

		getConnection();
				
				
				
				
				
				
		
		
	}
	
	public static void SQL_CLI() throws Exception{
		
		try{
			
			Connection conn = getConnection();
			
			// For Creating tables
//			PreparedStatement create = conn.prepareStatement("");
//			create.executeUpdate();
			
			// For Select Queries: 
		    String query = "SELECT * FROM candidate";
	      // create the java statement
	      Statement st = conn.createStatement();
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	    
	      // iterate through the java resultset
	      while (rs.next())
	      {
	        int id = rs.getInt("id");
	        int dashboard_id = rs.getInt("dashboard_id");
	        String firstName = rs.getString("first_name");
	        String lastName = rs.getString("last_name");
//	        Date dateCreated = rs.getDate("date_created");
//	        boolean isAdmin = rs.getBoolean("is_admin");
//	        int numPoints = rs.getInt("num_points");
	        
	        // print the results
	        System.out.format("%s, %s, %s, %s\n", id, dashboard_id, firstName, lastName);
	      }
	      st.close();
		    
			
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("SQL_CLI Executed successfully");
		};
		
	}
	
	
	// source of this info https://www.youtube.com/watch?v=KRhv4iPgzHE will need mysql-connector-java-(version)-bin.jar for this to work 
	 public static Connection getConnection() throws Exception{
		 
		 try{
			 
		 String driver = "com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost:8080/manual_structure"; // check for port 3306
		 String username = "root";
		 String password = "";
		 Class.forName(driver); Connection conn = DriverManager.getConnection(url,username,password);
		 System.out.println("Connected");
		 return conn;
		 
		 } catch(Exception e){
			 System.out.println(e);
		 } 
		 
		 return null;
		 
	}	
	
	
}
