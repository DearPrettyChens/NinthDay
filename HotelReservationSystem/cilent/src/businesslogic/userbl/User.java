package businesslogic.userbl;

import common.ResultMessage;
import vo.uservo.BasicInfoVO;
import vo.uservo.DetailInfoVO;
import vo.uservo.PasswordVO;
/**
 * User类
 * @author CYF
 * @version 1.0
 */
public class User {
	//不变的属性 ID
	private String userID;
	/**
	 * 登录方法
	 * @param name
	 * @param password
	 * @return ResultMessage
	 */
	public ResultMessage login(String name, String password) {
		return null;
	}
    /**
     * 获取详细信息 委托给customer
     * @param name
     * @param customer
     * @return DetailInfoVO
     */
  	public DetailInfoVO getDetailInfo(String name, Customer customer) {
		return customer.getDetailInfo(name);
	}
    /**
     * 检查联系方式格式 委托给telephone
     * @param tel
     * @return ResultMessage
     */
  	public ResultMessage checkTel(Telephone tel) {
		return tel.checkValid();
	}
    /**
     * 修改用户信息 委托给customer
     * @param detailInfoVO
     * @param customer
     * @return ResultMessage
     */
	public ResultMessage confirmUserInfo(DetailInfoVO detailInfoVO,Customer customer) {
		return customer.modifyDetailInfo(detailInfoVO);
	}
    /**
     * 检查旧密码是否输入正确
     * @param name
     * @param password
     * @return ResultMessage
     */
	public ResultMessage checkOldPassword(String name, String password) {
		return null;
	}
    /**
     * 检查新密码格式 委托给password
     * @param password
     * @return ResultMessage
     */
	public ResultMessage checkNewPassword(Password password) {
		return password.checkValid();
	}
    /**
     * 确认修改密码
     * @param passwordVO
     * @return ResultMessage
     */
	public ResultMessage confirmPassword(PasswordVO passwordVO) {
		return null;
	}
    /**
     * 获得基本信息
     * @param name
     * @return BasicInfoVO
     */
	public BasicInfoVO getBasicInfo(String name) {
		return null;
	}
    /**
     * 获得用户ID 
     * 实现的时候先判断ID是否为空
     * @param name
     * @return String
     */
	public String getUserID(String name) {
		return null;
	}
    /**
     * 获得用户等级 委托给customer
     * @param name
     * @param customer
     * @return int
     */
	public int getGrade(String name,Customer customer) {
		return customer.getGrade(name);
	}

}