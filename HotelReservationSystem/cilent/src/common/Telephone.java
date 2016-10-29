package common;

/**电话号码
 * @author cy
 * @version 1.0
 * 
 */
public class Telephone {
	
	    private String telephone;
	    
	    public Telephone(){
	    	
	    }
	    public Telephone(String telephone){
	    	this.telephone=telephone;
	    	
	    }

	    
	    /**
	     * 检查密码格式是否正确
	     * @param password
	     * @return boolean
	     * @throws 未定
	     */
	    public boolean checkFormate(String telephone){
	    	
	    	 return true;
	    	 
	    }

		public String getPassword() {
			return telephone;
		}

		public void setPassword(String password) {
			this.telephone = telephone;
		}
	    
		
	

}
