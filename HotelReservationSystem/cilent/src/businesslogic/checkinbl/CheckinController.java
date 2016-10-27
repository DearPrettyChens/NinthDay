package businesslogic.checkinbl;

import blservice.checkinblservice.CheckinBLService;
import common.BedType;
import common.ResultMessage;
import vo.checkinvo.AvailableRoomInfoVO;
import vo.checkinvo.AvailableRoomNumberVO;
import vo.checkinvo.CheckinInfoVO;
import vo.checkinvo.OrderInfoVO;
/**
 * checkin的控制类
 * @author CLL
 * @version1.0
 */
public class CheckinController implements CheckinBLService{
	//所属酒店编号
	String hotelID;
	//持有checkin的引用
	Checkin checkin=new Checkin(hotelID);
	
	public CheckinController(){
		
	}
	
	public CheckinController(String hotelID){
		this.hotelID=hotelID;
	}
	
	@Override
	public OrderInfoVO getOrderInfo(String orderID) {
		// TODO Auto-generated method stub
		return checkin.getOrderInfo(orderID);
	}

	@Override
	public CheckinInfoVO getCheckinInfo(String orderID) {
		// TODO Auto-generated method stub
		return checkin.getCheckinInfo(orderID);
	}

	@Override
	public ResultMessage checkIDLength(String ID) {
		// TODO Auto-generated method stub
		return checkin.checkIDLength(ID);
	}

	@Override
	public ResultMessage confirmCheckinInfo(CheckinInfoVO checkinInfoVO) {
		// TODO Auto-generated method stub
		return checkin.confirmCheckinInfo(checkinInfoVO);
	}

	@Override
	public ResultMessage confirmCheckoutInfo(CheckinInfoVO checkinInfoVO) {
		// TODO Auto-generated method stub
		return checkin.confirmCheckoutInfo(checkinInfoVO);
	}

	@Override
	public ResultMessage checkAvailableRoomNumber(BedType bedType, String number) {
		// TODO Auto-generated method stub
		return checkin.checkAvailableRoomNumber(bedType, number);
	}

	@Override
	public ResultMessage confirmAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO) {
		// TODO Auto-generated method stub
		return checkin.confirmAvailableRoomNumber(availableRoomNumberVO);
	}

	@Override
	public AvailableRoomInfoVO getAvailableRoomInfo() {
		// TODO Auto-generated method stub
		return checkin.getAvailableRoomInfo();
	}

}
