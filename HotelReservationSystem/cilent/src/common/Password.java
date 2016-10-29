package common;

import common.ResultMessage;

/**
 * 密码类
 * @author CYF
 * @version 1.0
 */
public class Password {
	//密码
	private String password;
	//构造方法
	public Password(String password){
		this.password=password;
	}
	/**
	 * 检查有效
	 * @return ResultMessage
	 */
	public ResultMessage checkValid(){
		return ResultMessage.PASSWORDFORMATERROR;
	}
}
