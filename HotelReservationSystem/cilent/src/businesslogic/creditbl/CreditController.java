package businesslogic.creditbl;

import blservice.creditblservice.CreditBLService;
import common.ResultMessage;
import vo.creditvo.CreditInfoVO;
import vo.creditvo.CreditVO;
/**
 * credit模块的控制类
 * @author CLL
 * @version 1.0
 */
public class CreditController implements CreditBLService {
	//持有credit的引用
	Credit credit=new Credit();
	@Override
	public CreditInfoVO getCreditInfo(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addCredit(CreditVO creditVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage cutCredit(CreditVO creditVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage confirmCreditDeposit(double money, String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
