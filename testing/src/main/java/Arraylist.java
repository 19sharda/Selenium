import java.util.ArrayList;
import java.util.List;

public class Arraylist{  
		public static void main(String args[]){  
		 //Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List 
		System.out.println(list.size());
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  
		 System.out.println(list.size());
		 System.out.println(list.get(0));
		 list.set(2,"Grapes");
		 for(String fruit:list)  
			  System.out.println(fruit);  
			 
		  
		}  
}
