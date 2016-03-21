package clubmanager;
import java.util.*;


public class Club

{
	 
	private int currentNumber=0;

	//private Member members[] =new Member[50];
	ArrayList<Member>members = new ArrayList<Member>();
	HashMap<String,Facility>facilities = new HashMap<String,Facility>();
	
		public void addMember(String surname, String firstName,String secondName)
		{
		
			Member  mem=new Member(currentNumber,surname,firstName,secondName);
			members.add(mem);
			currentNumber++;
		
		}
		public void getFacility(String ab)
		{ 
			for(String key:facilities.keySet())
				{
							
					if(key== ab)
					{
						System.out.println("The facility "+key+"\t"+"exisit");
					}
				}
		}
		public void addFacility(String a, String b )
		{
			Facility fa = new Facility(a, b);
			
			facilities.put(a,fa);
			//System.out.print(fa.getDescription());
		
		}
		public void getFacilities()
		{
			
			for(String key:facilities.keySet())
			{
				System.out.println(key);
			}
		}
		public void showfacilities()
		{
			for(String key:facilities.keySet())
			{
				Facility fa = facilities.get(key);
				System.out.println("\t"+fa.getName()+"\t"+ fa.getDescription());
			}
		}
		public void removeFacility(String fac)
		{
			for(String key:facilities.keySet())
			{
			
			if(key== fac)
				{ 
				facilities.remove(fac);
				}
			}	
			
			
		}
		
		public void showMember()
		{
		
			
				for(Member m : members)
				{
				if(m!=null)
					
					{
					System.out.println(m);
					}
				else System.out.println("no member in this space");
		} }
		public void removeMember(int currentNumber)
		{
			for( Member m : members)
			{
				if(m.getMemberNumber()== currentNumber)
				{
					members.remove(m);
					break;
				}
			}
			System.out.println("no member found");
		}
		public void show()
		{
		 showMember();
		 showfacilities();
		}
		
}
