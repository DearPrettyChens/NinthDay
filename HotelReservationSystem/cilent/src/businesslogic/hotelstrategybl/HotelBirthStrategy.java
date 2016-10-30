package businesslogic.hotelstrategybl;

import java.util.Date;
import java.util.Map;

import common.HotelStrategyType;
import common.ResultMessage;
import data.hotelstrategydata.HotelStrategyDataServiceMySqlImpl_Stub;
import dataservice.hotelstrategydataservice.HotelStrategyDataService;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店生日策略类
 * @author CYF
 * @version 1.0
 */
public class HotelBirthStrategy implements HotelStrategyInterface {
	//酒店生日策略折扣值
	private double discount;
	private HotelStrategyDataService hotelStrategyDataService;
    //构造方法
	public HotelBirthStrategy() {
		hotelStrategyDataService = new HotelStrategyDataServiceMySqlImpl_Stub();
	}

	@Override
	public HotelStrVO getHotelStrategy(String hotelID) {
		return null;
	}

	@Override
	public ResultMessage confirmHotelStrategy(HotelStrVO hotelStrVO) {
		return null;
	}

	public double getDiscount() {
		return discount;
	}
	
	

}
