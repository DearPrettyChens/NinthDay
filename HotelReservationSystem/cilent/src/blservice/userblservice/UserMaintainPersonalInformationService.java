package blservice.userblservice;

import common.ResultMessage;
import vo.uservo.BasicInfoVO;
import vo.uservo.DetailInfoVO;
import vo.uservo.PasswordVO;

public interface UserMaintainPersonalInformationService {

	/**
	 * 获取用户详细信息
	 * 
	 * @param name
	 *            String型，传递用户名
	 * @return DetailInfoVO ，将用户详细信息返回给界面
	 * @throws 未定
	 *
	 */
	public DetailInfoVO getDetailInfo(String name);

	/**
	 * 保存用户详细信息
	 * 
	 * @param detailInfoVO
	 *            DetailInfoVO型，界面传递过来的用户详细信息
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage confirmUserInfo(DetailInfoVO detailInfoVO);

	/**
	 * 检查电话格式
	 * @param tel String型，传递联系方式
	 * @return ResultMessage，格式正确返回SUCCESS,格式错误返回USERTELFORMATERROR
	 * @throws 未定
	 *
	 */
	public ResultMessage checkTel(String tel);
	/**
	 * 获取顾客会员等级
	 * 
	 * @param name
	 *            String型，传递用户名
	 * @return int，将顾客会员等级返回给界面
	 * @throws 未定
	 *
	 */
	public int getGrade(String name);

}
