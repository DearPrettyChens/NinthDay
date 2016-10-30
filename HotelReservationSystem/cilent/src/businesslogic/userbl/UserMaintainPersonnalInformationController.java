package businesslogic.userbl;

import blservice.userblservice.UserMaintainPersonalInformationService;
import common.ResultMessage;
import vo.uservo.BasicInfoVO;
import vo.uservo.DetailInfoVO;
import vo.uservo.PasswordVO;

public class UserMaintainPersonnalInformationController implements UserMaintainPersonalInformationService {
	// user对象
	private Customer customer;

	// 构造方法
	public UserMaintainPersonnalInformationController() {
		customer = new Customer();
	}

	@Override
	public DetailInfoVO getDetailInfo(String name) {
		return customer.getDetailInfo(name);
	}

	@Override
	public ResultMessage confirmUserInfo(DetailInfoVO detailInfoVO) {
		return customer.modifyDetailInfo(detailInfoVO);
	}

	@Override
	public int getGrade(String name) {
		return 0;
	}

}
