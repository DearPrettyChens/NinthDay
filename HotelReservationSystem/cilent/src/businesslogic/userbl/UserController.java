package businesslogic.userbl;

import blservice.userblservice.UserBLService;
import common.ResultMessage;
import vo.uservo.BasicInfoVO;
import vo.uservo.DetailInfoVO;
import vo.uservo.PasswordVO;
/**
 * userController类
 * @author CYF
 * @version 1.0
 */
public class UserController implements UserBLService{
    //user对象
	private User user ;
	//构造方法
	public UserController(){
		user = new User();
	}
	@Override
	public ResultMessage login(String name, String password) {
		return user.login(name, password);
	}

	@Override
	public DetailInfoVO getDetailInfo(String name) {
		return user.getDetailInfo(name,new Customer());
	}

	@Override
	public ResultMessage checkTel(String tel) {
		return user.checkTel(new Telephone(tel));
	}

	@Override
	public ResultMessage confirmUserInfo(DetailInfoVO detailInfoVO) {
		return user.confirmUserInfo(detailInfoVO,new Customer());
	}

	@Override
	public ResultMessage checkOldPassword(String name, String password) {
		return user.checkOldPassword(name, password);
	}

	@Override
	public ResultMessage checkNewPassword(String password) {
		return user.checkNewPassword(new Password(password));
	}

	@Override
	public ResultMessage confirmPassword(PasswordVO passwordVO) {
		return user.confirmPassword(passwordVO);
	}

	@Override
	public BasicInfoVO getBasicInfo(String name) {
		return user.getBasicInfo(name);
	}

	@Override
	public String getUserID(String name) {
		return user.getUserID(name);
	}

	@Override
	public int getGrade(String name) {
		return user.getGrade(name,new Customer());
	}

}
