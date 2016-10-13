package dataservice.checkindataservice;

import common.ResultMessage;
import po.CheckinInfoPO;


/**
 * 负责保存酒店住房信息
 * @author csy
 * @version 1.0
 * 
 */

public interface CheckinDataService {
	public void initial();
	public ResultMessage addCheckinInfo (CheckinInfoPO po);
	public CheckinInfoPO getCheckinInfo (String orderID);
	public ResultMessage modifyCheckinInfo (CheckinInfoPO po);
}
