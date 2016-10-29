package common;

/**
 * 
 * 密码
 * @author cy
 * @version 1.0
 * 
 */
public class Password {
    private String password;
    
    public Password(){
    	
    }
    public Password(String password){
    	this.password=password;
    	
    }

    
    /**
     * 检查密码格式是否正确
     * @param password
     * @return boolean
     * @throws 未定
     */
    public boolean checkFormate(String password){
    	
    	 return true;
    	 
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
	
}
