package businesslogic.userbl;

import blservice.userblservice.UserSafetyService;
import common.Password;
import common.ResultMessage;
import common.Telephone;
import vo.uservo.BasicInfoVO;
import vo.uservo.PasswordVO;

public class UserSafetyController implements UserSafetyService{  
	private User user;
	public UserSafetyController(){
		user = new User();
	}
	@Override
	public ResultMessage login(String name, String password) {
		return user.login(name, password);
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
	public String getUserID(String name) {
		return user.getUserID(name);
	}

	@Override
	public BasicInfoVO getBasicInfo(String name) {
		// TODO Auto-generated method stub
		return user.getBasicInfo(name);
	}

}
