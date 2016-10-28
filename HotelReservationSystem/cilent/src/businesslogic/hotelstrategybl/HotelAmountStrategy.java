package businesslogic.hotelstrategybl;

import java.util.Map;

import common.HotelStrategyType;
import common.ResultMessage;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店预订数量策略类
 * @author CYF
 * @version 1.0
 */
public class HotelAmountStrategy implements HotelStrategyInterface{
	//酒店预订数量策略的映射
	private Map<Integer,Double> strategy;
    //构造方法
	public HotelAmountStrategy(){
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
