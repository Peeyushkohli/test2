package slday10;
import java.util.*;
import java.io.*;

public class Filehandling {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File  f= new File("D:\\JavaFSD\\LC.txt");
	try 
	{
		
			if (f.createNewFile())					
		{
		System.out.println("File Created");
			
		}
				else 
		{
			System.out.println("File Alrady exists");
		}
	}
		catch (IOException i)
		{ 
			System.out.println("Exception handled");
		}
	}
}

		
			
		
	






