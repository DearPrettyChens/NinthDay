package businesslogic.hotelstrategybl;

import vo.hotelstrategyvo.HotelBestStrVO;
import vo.hotelstrategyvo.HotelStrVO;
import vo.hotelstrategyvo.OrderProvidedVO;

/**
 * 模拟酒店策略模块界面层和逻辑层交互的实现
 * @author CLL
 *
 */
public class HotelStrategyBL_Driver {
	public void drive(HotelStrategyBL_Stub stub){
		HotelBestStrVO hotelBestStrVO=stub.getBestHotelStrategy(new OrderProvidedVO());
		HotelStrVO hotelStrVO=stub.getHotelStrategy("0001", null);
		System.out.println(stub.confirmHotelStrategy(hotelStrVO));
	}
	
	public static void main(String[] args){
		new HotelStrategyBL_Driver().drive(new HotelStrategyBL_Stub());
	}
}
