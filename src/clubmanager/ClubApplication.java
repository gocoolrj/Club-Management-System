package clubmanager;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ClubApplication 
{
		

public static void main(String args[])

	{
	String temp[] = null,temp2[]=null;
	//Club z=  new Club();
	//z.getNumber(j);
//	z.addMember("Murugesan","Thiru","valluvan");
//	z.addMember("Renganathan", "Gowtham", "Karthick");
//	z.addMember("R","shiva","Niranjan");
//	
//	//z.showMember();
//	//z.removeMember(1);
//	//z.showMember();
//	//z.removeMember(2);
//	//	z.showMember();
//	z.addFacility("Cricket"," 5 kit are available");
//	z.addFacility("Badmitton", "10 bat are available");
//	z.addFacility("Volley ball", "10 balls are available");
//	//z.showfacilities();
//	//	z.getFacility("Cricket");
//	z.show();
	
	//DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
	Date start= Calendar.getInstance().getTime();
	Date end = Calendar.getInstance().getTime();
	//String startdate= df.format(start);
	
//	Calendar c = Calendar.getInstance();
//	c.setTime(new Date());
//	c.add(Calendar.DATE, 1);
	try{
	Member m1= new Member(3,"Murugan","Raga", "Vendren");
	Facility f1 = new Facility("Basketball","Two basketball court are available");
	Member m2 = new Member(4,"karthick","Sunder","Shiva");
	
	Booking bk = new Booking(start,start,m1,f1);
//	System.out.println(bk.toString());
	BookingRegister br = new BookingRegister();
	br.addBooking(m2, f1, start, end);
	FileReader fr1=new FileReader("F:\\FacilityFile.txt");
	FileReader fr2= new FileReader("F:\\MemberFile.txt");
	BufferedReader br1 = new BufferedReader(fr1);
	BufferedReader br2 = new BufferedReader(fr2);
	 LineNumberReader lr1 = new  LineNumberReader(fr1);
	 LineNumberReader lr2=new  LineNumberReader (fr2);
	String s1,s2;
	
	temp=new String[10];
	while((s1=br1.readLine())!=null && lr1.getLineNumber()<=3)
	{
	 temp[lr1.getLineNumber()]=s1;
	System.out.println(s1 + " "+ lr1.getLineNumber());
	
	}
	
	
	while((s2=br2.readLine())!=null && lr2.getLineNumber()<10)
	{
//		temp2[lr2.getLineNumber()]=s2;
		System.out.println(s2);
	}
	
	}catch (IOException ex)
	{ 
		System.out.println(ex.getMessage());
	}
	}
}
