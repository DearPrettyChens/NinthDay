package businesslogic.userbl;

import common.ResultMessage;
import data.userdata.UserDataServiceMySqlImpl_Stub;
import dataservice.userdataservice.UserDataService;
import vo.uservo.DetailInfoVO;
/**
 * Customer类
 * @author CYF
 * @version 1.0
 */
public class Customer {
	//等级
	private int grade;
	private UserDataService userDataService;
	//构造方法
	public Customer(){
		userDataService=new UserDataServiceMySqlImpl_Stub();
	}
	/**
	 * 获得用户等级方法
	 * @param name
	 * @return int
	 */
	public int getGrade(String name){
		return 0;
	}
	/**
	 * 获得用户详细信息
	 * @param name
	 * @return DetailInfoVO
	 */
	public DetailInfoVO getDetailInfo(String name){
		return null;
	}
	/**
	 * 修改用户详细信息
	 * @param detailInfoVO
	 * @return ResultMessage
	 */
	public ResultMessage modifyDetailInfo(DetailInfoVO detailInfoVO){
		return null;
	}
}
