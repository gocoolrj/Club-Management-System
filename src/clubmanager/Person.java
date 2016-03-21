package clubmanager;
public class Person {
	private String  surName;
	private String firstName;
	private String secondName;
	public Person(String a,String b,String c)
	{
		this.surName=a;
		this.firstName=b;
		this.secondName=c;
	}
	public String getSurName()
	{
		return surName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getSecondfName()
	{
		return secondName;
	}
	public String show()
	{
		return firstName+"\t"+secondName+"\t"+surName;
	}
	@ Override public String toString()
	{
		return firstName+"\t"+secondName+"\t"+surName;
		
	}
}