package dataservice.creditdataservice;

import common.ResultMessage;
import po.CreditInfoPO;
import po.CreditPO;

/**
 * 负责保存信用记录
 * @author csy
 * @version 1.0
 * 
 */
public interface CreditDataService {
	public void initial();
	public ResultMessage setCredit (CreditPO po);
	public CreditInfoPO getCreditInfo(String customerID);
}
