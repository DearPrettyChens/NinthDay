package dataservice.hotelstrategydataservice;

import common.HotelStrategyType;
import common.ResultMessage;
import po.HotelStrPO;

/**
 * 负责保存酒店营销策略
 * @author csy
 * @version 1.0
 * 
 */
public interface HotelStrategyDataService {
	public void initial();
	public HotelStrPO getHotelStrategy(String hotelID,HotelStrategyType type);
	public ResultMessage setHotelStrategy(HotelStrPO po);
}
