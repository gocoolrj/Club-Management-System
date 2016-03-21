package clubmanager;
public class Facility 
	{
    private String name;
    private String description;
	    public Facility(String a,String b)
	    {
	    	this.name=a;
	    	this.description=b;
	    }
	    
	    public String getName()
	    {
	    	return name;
	    }
	    public String getDescription()
	    {
	    	return description;
	    }
	    public String show()
	    {
	    	return name+"\t"+description;
	    }
		}
