package businesslogic.creditbl;

import java.util.ArrayList;

import common.ResultMessage;
import vo.creditvo.CreditInfoVO;
import vo.creditvo.CreditVO;
/**
 * credit模块的领域类
 * @author CLL
 * @version 1.0
 */
public class Credit {
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

	public String getCustomerID() {
		return customerID;
	}

	public ArrayList<String> getCreditInfoList() {
		return creditInfoList;
	}

	public void setCreditInfoList(ArrayList<String> creditInfoList) {
		this.creditInfoList = creditInfoList;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getCreditInfo() {
		return creditInfo;
	}

	public void setCreditInfo(String creditInfo) {
		this.creditInfo = creditInfo;
	}
}
