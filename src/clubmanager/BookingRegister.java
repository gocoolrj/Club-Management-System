package clubmanager;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
public class BookingRegister 
{
	
	
	
	HashMap<Facility,ArrayList<Booking>> registration= new HashMap<Facility,ArrayList<Booking>>();

	
	 Facility fac;

	private boolean object;
	
	public void addBooking(Member m,Facility f,Date start,Date end)
	{
		this.fac=f;
		Booking bk = new Booking(start,end,m,f);
		Iterator<Entry<Facility, ArrayList<Booking>>> i = registration.entrySet().iterator();
		
		ArrayList<Booking> value =  registration.get(f);
		if(registration.containsKey(f))
		{
		for(Booking b:value)
		
			{
				if(b.equals(start)&&b.equals(end))
				{
				System.out.println("Slot not available");
				}
				else
				{
					value.add(b);
				}
			}
		}else
			{ ArrayList<Booking> bk1 = new ArrayList<Booking>();
			
			registration.put(f,bk1);
			bk1.add(bk);
			}
	}
	public ArrayList<Booking> getBooking(Facility f,Date start,Date end)
		{
		ArrayList<Booking> n = registration.get(f);
		ArrayList<Booking> out= new ArrayList<Booking>();
		
		for(Booking t:n)
		{
			if((t.equals(start))||(t.equals(end)))
					{
				out.add(t);
			
					}
			
			
		}
	
		return out;
		}}
	

