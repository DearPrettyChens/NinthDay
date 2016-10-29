package businesslogic.orderbl;

import java.util.ArrayList;
import java.util.Date;

import blservice.orderblservice.OrderBLService;

import common.ResultMessage;
import common.Telephone;
import vo.availableroomvo.AvailableRoomNumberVO;
import vo.hotelvo.HotelDetailInfoVO;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.OrderVO;
import vo.ordervo.RemarkVO;
import vo.ordervo.StrategyVO;
import vo.ordervo.TypeInfoVO;

/**
 * Order模块的控制类
 * @author csy
 * @version 1.0
 */
public class OrderController implements OrderBLService{
    Order order;
    
	public OrderController() {
		order = new Order();
	}

	@Override
	public ResultMessage checkUserCredit(String CustomerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkTelephone(String telNum) {
		return new Telephone(telNum).checkValid();
	}

	@Override
	public ResultMessage checkTime(Date time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage confirmAddOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StrategyVO next(OrderInfoVO orderinfovo) {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderInfoVO getOrderInfo(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrderVO> getOrderList(TypeInfoVO typeInfoVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage cancelOrderConfirm(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage remarkOrder(RemarkVO remarkVO) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ResultMessage setReturnCredit(int creditNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelDetailInfoVO getHotelDetailInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkAvailableRoomNumber(AvailableRoomNumberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setCheckinTime(Date time, String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setCheckoutTime(Date time, String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
