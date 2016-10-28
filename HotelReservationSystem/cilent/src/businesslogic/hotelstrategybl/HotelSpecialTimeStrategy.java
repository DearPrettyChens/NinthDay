package businesslogic.hotelstrategybl;

import java.util.Date;
import java.util.Map;

import common.ResultMessage;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店特殊时期优惠策略类
 * @author CYF
 * @version 1.0
 */
public class HotelSpecialTimeStrategy implements HotelStrategyInterface{
	//特殊时期酒店策略的映射
    private Map<Date,Double> strategy;
    //构造方法
    public HotelSpecialTimeStrategy(){
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
