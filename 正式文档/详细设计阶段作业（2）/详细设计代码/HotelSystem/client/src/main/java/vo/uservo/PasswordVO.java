package vo.uservo;

import po.ClientPO;

/**
 * 密码vo
 * @author CYF
 * @version 1.0
 */
public class PasswordVO {
	//用户ID？改成username?因为存的时候还没有ID
	private String userID;
	//用户密码
	private String password;
	//用户名称
	private String userName;
	
	public PasswordVO(){
	}
	//从下往上不会传密码上来
	
	public PasswordVO(String userID,String password){
		this.setUserID(userID);
		this.setPassword(password);
	}
	
	public ClientPO voToPO(){
		return new ClientPO(userName, password);
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
