package businesslogic.availableroombl;

import blservice.availableroomblservice.RoomPriceService;
import common.BedType;
import common.ResultMessage;

public class RoomPriceController implements RoomPriceService{
	//持有AvailableRoom引用
	private AvailableRoom availableRoom;
	public RoomPriceController(){
		availableRoom=new AvailableRoom();
	}

	@Override
	public double getRoomPrice(String hotelID, BedType bedType) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultMessage setBestPrice(String hotelID, double discount) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
