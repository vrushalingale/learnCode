package Inheritance;

public class LGTV_childclass extends TV_ParentClass 
{
	
	
	public static void main (String []args)
	{
		TV_ParentClass.remotecontrol();

		LGTV_childclass thisob = new LGTV_childclass ();
		thisob.nonsmethod();

									
	}
	
	public void thiesmethod ()
	{

		super.nonsmethod();
	}


}
