package businesslogic.availableroombl;

import java.util.ArrayList;

import common.BedType;
import common.ResultMessage;
import vo.availableroomvo.AvailableRoomInfoVO;
import vo.availableroomvo.AvailableRoomNumberVO;
/**
 * AvailableRoom的领域类
 * @author CLL
 * @version 1.0
 */
public class AvailableRoom {
	//可用住房信息列表
	ArrayList<SingleAvailableRoomInfo> singleAvailableRoomInfoList;
	//酒店编号
	String hotelID;
	
	public AvailableRoom(){
		
	}
	
	public AvailableRoom(String hotelID){
		this.hotelID=hotelID;
	}
	/**
	 * 获取酒店的可用房间信息
	 * @param hotelID
	 * @return AvailableRoomInfoVO
	 */
	public AvailableRoomInfoVO getAvailableRoomInfo(String hotelID) {
		// TODO
		return null;
	}
	/**
	 * 新增酒店房间信息
	 * @param availableRoomInfoVO
	 * @return ResultMessage
	 */
	public ResultMessage confirmAvailableRoomInfo(AvailableRoomInfoVO availableRoomInfoVO) {
		// TODO
		return null;
	}
	/**
	 * 更新可用房间信息,找到对应的singleavailableroominfo对象并委托给它
	 * @param availableRoomNumberVO
	 * @return ResultMessage
	 */
	public ResultMessage setAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO) {
		// TODO
		return null;
	}
	/**
	 * 更新各种房型的最低价格，遍历list，更新其中的房型价格
	 * @param discount
	 * @return ResultMessage
	 */
	public ResultMessage setBestPrice(double discount) {
		// TODO 
		return null;
	}
	/**
	 * 系统返回该房型价格
	 * @param hotelID
	 * @param bedType
	 * @return ResultMessage
	 */
	public double getRoomPrice(String hotelID, BedType bedType) {
		// TODO
		return 0;
	}
	/**
	 * 判断是否有足够的可用客房
	 * @param availableRoomNumberVO
	 * @return ResultMessage
	 */
	public ResultMessage checkAvailableRoomNumber(AvailableRoomNumberVO availableRoomNumberVO) {
		// TODO 
		return null;
	}
}
