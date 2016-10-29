package businesslogic.personnelbl;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import common.Password;
import common.Telephone;

/**
 * 酒店工作人员
 * @author cy
 * @version 1.0
 * 
 */
public class HotelWorker extends Person  {
	   
		//所在酒店名称
		private String hotelName;
		
		    public HotelWorker(){
		    	
		    } 
		    public HotelWorker(ImageIcon userImage,String name,Telephone telephone,Password password,String id,String hotelName){
		    	this.userImage=userImage;
				this.name=name;
				this.telephone=telephone;
				this.password=password;
				this.id=id;
				this.hotelName=hotelName;
				
				
		    }
		    
		

}
