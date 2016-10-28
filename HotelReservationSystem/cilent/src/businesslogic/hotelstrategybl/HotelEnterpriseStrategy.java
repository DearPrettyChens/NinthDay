package businesslogic.hotelstrategybl;

import java.util.Date;
import java.util.Map;

import common.ResultMessage;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店合作企业策略类
 * @author CYF
 * @version 1.0
 */
public class HotelEnterpriseStrategy implements HotelStrategyInterface {
	//酒店合作企业折扣策略映射
	private Map<Date, Double> strategy;
    //构造方法
	public HotelEnterpriseStrategy() {
	}

	@Override
	public HotelStrVO getHotelStrategy(String hotelID) {
		return null;
	}

	@Override
	public ResultMessage confirmHotelStrategy(HotelStrVO hotelStrVO) {
		return null;
	}

}
