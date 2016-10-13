package businesslogic.hotelstrategybl;

import blservice.hotelstrategyblservice.HotelStrategyBLService;
<<<<<<< HEAD
=======
import common.HotelStrategyType;
>>>>>>> master
import common.ResultMessage;
import vo.hotelstrategyvo.HotelBestStrVO;
import vo.hotelstrategyvo.HotelStrVO;
import vo.hotelstrategyvo.OrderProvidedVO;
<<<<<<< HEAD
/**
 * 模拟酒店策略模块界面层和逻辑层交互的实现
 * @author CLL
 *
=======

/**
 * 模拟酒店策略模块界面层和逻辑层交互的实现
 * @author csy
 * @version 1.0
 * 
>>>>>>> master
 */
public class HotelStrategyBL_Stub implements HotelStrategyBLService{

	@Override
	public HotelBestStrVO getBestHotelStrategy(OrderProvidedVO orderProvidedVO) {
		// TODO Auto-generated method stub
		return new HotelBestStrVO();
	}

	@Override
<<<<<<< HEAD
	public HotelStrVO getHotelStrategy(String hotelID, String type) {
=======
	public HotelStrVO getHotelStrategy(String hotelID, HotelStrategyType type) {
>>>>>>> master
		// TODO Auto-generated method stub
		return new HotelStrVO();
	}

	@Override
	public ResultMessage confirmHotelStrategy(HotelStrVO hotelStrVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

}
