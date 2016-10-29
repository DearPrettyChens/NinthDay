package businesslogic.personnelbl;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import common.Password;
import common.Telephone;

/**
 * 网站营销人员
 * @author cy
 * @version 1.0
 * 
 */
public class WebMarketMan  extends Person{
	//制定过的策略列表
	
    private ArrayList<String> strategies;
    public WebMarketMan(){
    	
    } 
    public WebMarketMan(ImageIcon userImage,String name,Telephone telephone,Password password,String id,ArrayList<String> strategies){
    	this.userImage=userImage;
		this.name=name;
		this.telephone=telephone;
		this.password=password;
		this.id=id;
		this.strategies=strategies;
		
    }
    

}
