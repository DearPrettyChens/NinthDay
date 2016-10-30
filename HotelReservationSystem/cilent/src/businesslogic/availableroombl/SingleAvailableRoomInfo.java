package businesslogic.availableroombl;

import common.BedType;
import common.ResultMessage;
import dataservice.availableroomdataservice.AvailableRoomDataService;
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
	private AvailableRoomDataService availableRoomDataService;//数据层的引用
	
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
	//以下get,set都是和数据层的交互
	public String getHotelNumber() {
		return null;
	}

	public String getRoomType() {
		return null;
	}

	public ResultMessage setRoomType(String roomType) {
		this.roomType = roomType;
		return null;
	}

	public BedType getBedType() {
		return null;
	}

	public ResultMessage setBedType(BedType bedType) {
		this.bedType = bedType;
		return null;
	}

	public double getOriginalPrice() {
		return 0;
	}

	public ResultMessage setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
		return null;
	}

	public double getLowestPrice() {
		return 0;
	}

	public ResultMessage setLowestPrice(double lowestPrice) {
		this.lowestPrice = lowestPrice;
		return null;
	}

	public int getRoomNum() {
		return 0;
	}

	public ResultMessage setRoomNum(int roomNum) {
		this.roomNum = roomNum;
		return null;
	}
}
