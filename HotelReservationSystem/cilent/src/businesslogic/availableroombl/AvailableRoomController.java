package businesslogic.availableroombl;

import blservice.availableroomblservice.AvailableRoomBLService;
import common.BedType;
import common.ResultMessage;
import vo.availableroomvo.AvailableRoomInfoVO;
import vo.availableroomvo.AvailableRoomNumberVO;
/**
 * AvailableRoom模块的控制类
 * @author CLL
 * @version 1.0
 */
public class AvailableRoomController implements AvailableRoomBLService{
	//持有AvailableRoom引用
	AvailableRoom availableRoom=new AvailableRoom();
	
	@Override
	public AvailableRoomInfoVO getAvailableRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage confirmAvailableRoomInfo(AvailableRoomInfoVO availableRoomInfoVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setBestPrice(double discount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getRoomPrice(String hotelID, BedType bedType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage checkAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
