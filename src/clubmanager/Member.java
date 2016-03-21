package clubmanager;

public class Member extends Person
{
	private int memberNumber;
	public Member(int t,String a,String b,String c)
	{
		super (a,b,c);
		this.memberNumber=t;
	}
	public int getMemberNumber()
	{
		return memberNumber;
	}
	
	public void setMemberNumber(int memberNumber) 
	{
		this.memberNumber = memberNumber;
	}
	@ Override public String toString() 
	{	
		
		int a = memberNumber;
		String r= Integer.toString(a);
		return super.toString()+"\t"+r;
	}	
	@ Override public String show()
	{
		int a = memberNumber;
		String r= Integer.toString(a);
		return super.show()+ r;
	}
		
	
}