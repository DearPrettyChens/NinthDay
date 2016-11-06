package businesslogic.hotelstrategybl;

import blservice.hotelstrategyblservice.HotelStrategyBLService;
import common.HotelStrategyType;
import common.ResultMessage;
import vo.hotelstrategyvo.HotelBestStrVO;
import vo.hotelstrategyvo.HotelStrVO;
import vo.hotelstrategyvo.OrderProvidedVO;
/**
 * 酒店策略Controller类
 * @author CYF
 * @version 1.0
 */
public class HotelStrategyController implements HotelStrategyBLService {
    //酒店策略
	private HotelStrategy hotelStrategy;
    //构造方法
	public HotelStrategyController(){
		hotelStrategy =new HotelStrategy();
	}

	@Override
	public HotelBestStrVO getBestHotelStrategy(OrderProvidedVO orderProvidedVO) {
		return null;
	}

	@Override
	public HotelStrVO getHotelStrategy(String hotelID, HotelStrategyType type) {
		//利用factory创建对应的hotelstrategy作为参数传进hotelstrategy的gethotelstrategy方法。
		return null;
	}

	@Override
	public ResultMessage confirmHotelStrategy(HotelStrVO hotelStrVO) {
		//利用factory创建对应的hotelStrategy作为参数传入hotelstrategy的confirm方法
		return null;
	}

}
