package businesslogic.availableroombl;

import common.BedType;
import vo.availableroomvo.SingleAvailableRoomInfoVO;
/**
 * 某一种客房的类
 * @author CLL
 * @version 1.0
 */
public class SingleAvailableRoomInfo {
	private String  hotelNumber;//酒店编号
	private String roomType;//房型
	private BedType bedType;//床型
	private double originalPrice;//原始价格
	private double lowestPrice;//最低价格
	private int roomNum;//房间数量
	
	public SingleAvailableRoomInfo(){
		
	}
	
	public SingleAvailableRoomInfo(SingleAvailableRoomInfoVO vo){
		this.hotelNumber=vo.getHotelNumber();
		this.setRoomType(vo.getRoomType());
		this.setBedType(vo.getBedType());
		this.setOriginalPrice(vo.getOriginalPrice());
		this.setLowestPrice(vo.getLowestPrice());
		this.setRoomNum(roomNum);
	}

	public String getHotelNumber() {
		return hotelNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BedType getBedType() {
		return bedType;
	}

	public void setBedType(BedType bedType) {
		this.bedType = bedType;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
}
