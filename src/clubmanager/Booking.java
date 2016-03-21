package clubmanager;
import java.util.Date;
public class Booking
{
	private Member mem;
	private Facility fac;
	Date startdate;
	Date enddate;
	public Booking(Date start,Date end,Member m,Facility f)
	{
		this.startdate=start;
		this.enddate=end;
		this.fac=f;
		this.mem=m;
	}
	public Member getMem() {
		return mem;
	}
	public void setMem(Member mem) {
		this.mem = mem;
	}
	public Facility getFac() {
		return fac;
	}
	public void setFac(Facility fac) {
		this.fac = fac;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	public boolean overlap(Booking bk)
	{
		if(this.startdate==bk.startdate)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Booking [mem=" + mem + ", fac=" + fac + ", startdate="
				+ startdate + ", enddate=" + enddate + ", getMem()=" + getMem()
				+ ", getFac()=" + getFac() + ", getStartdate()="
				+ getStartdate() + ", getEnddate()=" + getEnddate() + "]";
	}
	
	
	
}
