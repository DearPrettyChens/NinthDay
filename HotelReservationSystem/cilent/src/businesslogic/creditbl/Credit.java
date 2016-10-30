package businesslogic.creditbl;

import java.util.ArrayList;

import common.ResultMessage;
import dataservice.availableroomdataservice.AvailableRoomDataService;
import vo.creditvo.CreditInfoVO;
import vo.creditvo.CreditVO;
/**
 * credit模块的领域类
 * @author CLL
 * @version 1.0
 */
public class Credit {
	//数据层的引用
	private AvailableRoomDataService availableRoomDataService;
	//单条信用记录
	private String creditInfo;
	//信用值
	private int credit;
	//信用记录列表
	private ArrayList<String> creditInfoList;
	//顾客编号
	private String customerID;
	public Credit(){
		
	}
	public Credit(String customerID){
		this.customerID=customerID;
	}
	/**
	 * 获得该顾客的信用记录
	 * @param customerID
	 * @return CreditInfoVO
	 */
	public CreditInfoVO getCreditInfo(String customerID) {
		// TODO 
		return null;
	}
	/**
	 * 新增一条顾客的信用记录并增加顾客的信用值
	 * @param creditVO
	 * @return ResultMessage
	 */
	public ResultMessage addCredit(CreditVO creditVO) {
		// TODO 
		return null;
	}
	/**
	 * 新增一条顾客的信用记录并扣除顾客的信用值
	 * @param creditVO
	 * @return ResultMessage
	 */
	public ResultMessage cutCredit(CreditVO creditVO) {
		// TODO 
		return null;
	}
	/**
	 * 新增一条顾客的信用记录并充值顾客的信用值
	 * @param money
	 * @param customerName
	 * @return ResultMessage
	 */
	public ResultMessage confirmCreditDeposit(double money, String customerName) {
		// TODO 
		return null;
	}
	//以下get,set都是和数据层的交互
	public String getCustomerID() {
		return null;
	}

	public ArrayList<String> getCreditInfoList() {
		return null;
	}

	public ResultMessage setCreditInfoList(ArrayList<String> creditInfoList) {
		return null;
		
	}

	public int getCredit() {
		return 0;
	}

	public ResultMessage setCredit(int credit) {
		return null;
		
	}

	public String getCreditInfo() {
		return null;
	}

	public ResultMessage setCreditInfo(String creditInfo) {
		return null;
		
	}
}
