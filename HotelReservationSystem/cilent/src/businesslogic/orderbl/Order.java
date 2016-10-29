package businesslogic.orderbl;

import java.util.Date;

import common.ResultMessage;
import vo.availableroomvo.AvailableRoomNumberVO;
import vo.hotelvo.HotelDetailInfoVO;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.RemarkVO;
import vo.ordervo.TypeInfoVO;

public class Order {
	public ResultMessage checkUserCredit(String CustomerID){
		return null;
		
	}
	public ResultMessage checkTelephone(String telNum){
		return null;
		
	}
	public ResultMessage checkTime(Date time){
		return null;
		
	}
	public ResultMessage confirmAddOrder(){
		return null;
		
	}
	public OrderInfoVO getOrderInfo(String orderID){
		return null;
		
	}
	public ArrayList<OrderVO> getOrderList(TypeInfoVO vo){
		
	}
	public ResultMessage cancelOrderConfirm (String orderID){
		return null;
		
	}
	public ResultMessage remarkOrder(RemarkVO vo){
		return null;
		
	}
	public StrategyVO next(OrderInfoVO orderinfovo){
		
	}
	public ResultMessage setCheckinTime(Date time){
		return null;
		
	}
	public ResultMessage setCheckoutTime(Date time){
		return null;
		
	}
	public ResultMessage setReturnCredit(int creditNum){
		return null;
		
	}
	public HotelDetailInfoVO getHotelDetailInfo(String hotelID){
		return null;
		
	}
	public ResultMessage checkAvailableRoomNumber (AvailableRoomNumberVO vo){
		return null;
		
	}
	
	
	
	
}
