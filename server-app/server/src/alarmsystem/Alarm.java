package alarmsystem;
import java.util.Date;

public class Alarm
{
	   private int uid;
	   private Location location;
	   private int status;
	   private long ack;
	  
	   
	   public void setUid(int uid)
	   {
	      this.uid  = uid;
	   }
	   public void setAck(long ack)
	   {
	      this.ack  = ack;
	   }

	   public void setLocation(Location location)
	   {
	      this.location  =location;
	   }
	   public void setStatus(int status)
	   {
	      this.status  =status;
	   }
	   
	   public void GenerateAck()
	   {
		   
		   setAck(System.currentTimeMillis());
		   System.out.println(ack);
	   }
	   
	   
/*
	   public void getStatus(){
	      System.out.println("World Message1 : " + message1);
	   }

	   public void getMessage2(){
	      System.out.println("World Message2 : " + message2);
	   }
*/
	}
