package businesslogic.personnelbl;

import java.util.Date;

import javax.swing.ImageIcon;

import common.Password;
import common.Telephone;
import common.UserType;

/**
 * 顾客详细信息
 * @author cy
 * @version 1.0
 * 
 */
public class Customer extends Person {
	   
		//信用值
		private int credit;
		//生日
		private Date birthday;
		//企业名称
		private String enterpriseName;
		//会员等级
		private int VIPgrade;
		//会员类型（企业会员和普通会员两种）
		private UserType VIPType;
		 public Customer(){
		    	
		    } 
		    public Customer(ImageIcon userImage,String name,Telephone telephone,Password password,String id,int credit,Date birthday,String enterpriseName,int VIPgrade,UserType VIPType){
		    	this.userImage=userImage;
				this.name=name;
				this.telephone=telephone;
				this.password=password;
				this.id=id;
				this.credit=credit;
				this.birthday=birthday;
				this.enterpriseName=enterpriseName;
				this.VIPgrade=VIPgrade;
				this.VIPType=VIPType;
				
				
				
		    }

}
