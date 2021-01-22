package main;

import java.sql.SQLException;
import java.util.Scanner;

import Bean.StudentBean;
import Insert.StudentInsert;

public class Studentmain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws Exception,SQLException {
		
		StudentBean stb=new StudentBean();
		stb.setRegno(190030152);
		stb.setName("Bhuvana");
		stb.setEmail("B@gmail.com");
		StudentInsert sti=new StudentInsert();
		while(true) {
			System.out.println("Enter option for crud operations");
			System.out.println("1.INSERTION\n");
			System.out.println("2.DELETION\n");
			System.out.println("3.UPDATION\n");
			System.out.println("4.DISPLAY\n");
			int option=sc.nextInt();
			
			switch(option) 
			{
			     case 1:
			    	 System.out.println("Values for insertion\n");
			    	 System.out.println("Enter Id");
			    	 int id=sc.nextInt();
			    	 System.out.println("Enter Name");
			    	 String name=sc.next();
			    	 System.out.println("Enter Mailid");
			    	 String email=sc.next();
						stb.setRegno(id);
						stb.setName(name);
						stb.setEmail(email);
						
						
					int a=sti.StudentInsertion(stb);
						if(a>0) {
							System.out.println("Insertion sucessful !!!");
						}
						else {
							System.out.println("Insertion failed !!!");
						}
						break;
					
			     case 2:System.out.println("Enter Id for deletion");
					    	 int regno=sc.nextInt();
					    	 stb.setRegno(regno);
					    int b=sti.studentDelete(stb);
					    if(b>0) {
					    	System.out.println("Deletion process is Successful !!!");
					    }
					    else {
							System.out.println("Deletion failed !!!");
						}

					    
			     			break;
			     case 3:System.out.println("Enter Id for updation");
		    	 			int regno1=sc.nextInt();
		    	 			
		    	 		System.out.println("Enter Name for updation");
					    	 String name_update=sc.next();
					    	 stb.setRegno(regno1);
					    	 stb.setName(name_update);
					    	 int a1=sti.studentUpdate(stb);
								if(a1>0) {
									System.out.println("updation sucessful !!!");
								}
								else {
									System.out.println("updation failed !!!");
								}
			                 break;
			     case 4:sti.studentDisplay(stb);
			            
			     			break;
			}
			
			
		}
	}


}
