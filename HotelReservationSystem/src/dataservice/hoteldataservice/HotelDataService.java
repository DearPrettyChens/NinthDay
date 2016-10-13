package dataservice.hoteldataservice;

import common.ResultMessage;
import po.HotelBasicInfoPO;
import po.HotelBestPricePO;
import po.RemarkPO;

/**
 * 负责保存酒店信息
 * @author csy
 * @version 1.0
 * 
 */
public interface HotelDataService {
	
	public void initial();
	public HotelBasicInfoPO getHotelBasicInfo(String hotelID);
	public ResultMessage addRemarkInfo(RemarkPO po);
	public ResultMessage addHotelBasicInfo(HotelBasicInfoPO po);
	public ResultMessage setHotelBasicInfo(HotelBasicInfoPO po);
	public ResultMessage setBestPrice(HotelBestPricePO po);
}
