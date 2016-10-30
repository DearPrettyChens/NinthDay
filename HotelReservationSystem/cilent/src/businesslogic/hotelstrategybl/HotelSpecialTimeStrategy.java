package businesslogic.hotelstrategybl;

import java.util.Date;
import java.util.Map;

import common.ResultMessage;
import data.hotelstrategydata.HotelStrategyDataServiceMySqlImpl_Stub;
import dataservice.hotelstrategydataservice.HotelStrategyDataService;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店特殊时期优惠策略类
 * @author CYF
 * @version 1.0
 */
public class HotelSpecialTimeStrategy implements HotelStrategyInterface{
	//特殊时期酒店策略数组 两个元素记录开始时间和结束时间
    private Date[] date;
    //折扣值
    private double discount;
    private HotelStrategyDataService hotelStrategyDataService;
    //构造方法
    public HotelSpecialTimeStrategy(){
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
