package businesslogic.hotelstrategybl;

import java.util.Map;

import common.HotelStrategyType;
import common.ResultMessage;
import data.hotelstrategydata.HotelStrategyDataServiceMySqlImpl_Stub;
import dataservice.hotelstrategydataservice.HotelStrategyDataService;
import vo.hotelstrategyvo.HotelStrVO;
/**
 * 酒店预订数量策略类
 * @author CYF
 * @version 1.0
 */
public class HotelAmountStrategy implements HotelStrategyInterface{
	//数量
	private int amount;
	//酒店预订数量策略折扣
	private double discount;
	private HotelStrategyDataService hotelStrategyDataService;
    //构造方法
	public HotelAmountStrategy(){
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
	
	public int getAmount() {
		return amount;
	}
	
}
