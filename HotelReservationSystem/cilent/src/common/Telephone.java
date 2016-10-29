<<<<<<< HEAD
package common;

import common.ResultMessage;

/**
 * 联系方式类
 * @author CYF
 * @version 1.0
 */
public class Telephone {
	//联系方式
	private String telephone;
	//构造方法
	public Telephone(String tel) {
		this.telephone=tel;
	}
	/**
	 * 检查是否有效
	 * @return ResultMessage
	 */
	public ResultMessage checkValid(){
		if(telephone.length()==11){
			return ResultMessage.SUCCESS;
		}
		return ResultMessage.FAIL;
	}

}
=======
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
>>>>>>> origin/master
