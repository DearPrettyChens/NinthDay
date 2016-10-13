package dataservice.availableroomdataservice;

import common.BedType;
import common.ResultMessage;
import po.AvailableRoomInfoPO;
import po.AvailableRoomNumberPO;

/**
 * 负责保存酒店可用客房信息
 * @author csy
 * @version 1.0
 * 
 */
public interface AvailableRoomDataService {
	public void initial();
	public AvailableRoomInfoPO getAvailableRoomInfo (String hotelID);
	public ResultMessage addAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage modifyAvailableRoomInfo (AvailableRoomInfoPO po);
	public ResultMessage setAvailableRoomNumber (AvailableRoomNumberPO po);
	public double getRoomPrice(String hotelID,BedType bedType);
	public ResultMessage setBestPrice(AvailableRoomInfoPO po);
}
