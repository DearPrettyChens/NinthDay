package vo.checkinvo;

import java.io.Serializable;
import java.util.Map;

import common.BedType;


public class AvailableRoomInfoVO implements Serializable {
	
	
	
	/**
	 * 当前可用客房信息（AvailableroomPO)
	 * 房型、床型、各房型总数量、可用客房数量、原始价格、最低价格、酒店编号
	 * 
	 * @author Cy
	 * @virsion 1.0
	 * */
	private String  hotelNumber;//酒店编号
	private String hotelName;//酒店名字
	private String[] roomType;//房型
	private BedType[] bedType;//床型
	private double[] originalPrice;//原始价格
	private double[] lowestPrice;//最低价格
	private int[] originalNumbers;//各房型总数量
	
	private Map<BedType,int []> availableRoom;//30天可用客房数
	public AvailableRoomInfoVO(){
		
	}
    public AvailableRoomInfoVO(String  hotelNumber,String hotelName,String[] roomType
    		,BedType[] bedType,double[] originalPrice,double[] lowestPrice,int[] originalNumbers){
		this.hotelName=hotelName;
		this.hotelNumber=hotelNumber;
		this.roomType=roomType;
		this.bedType=bedType;
		this.originalPrice=originalPrice;
		this.lowestPrice=lowestPrice;
		this.originalNumbers=originalNumbers;
		
	}
	
	public String getHotelNumber() {
		return hotelNumber;
	}

	public void setHotelNumber(String hotelNumber) {
		this.hotelNumber = hotelNumber;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String[] getRoomType() {
		return roomType;
	}

	public void setRoomType(String[] roomType) {
		this.roomType = roomType;
	}

	public BedType[] getBedType() {
		return bedType;
	}

	public void setBedType(BedType[] bedType) {
		this.bedType = bedType;
	}

	public double[] getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double[] originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double[] getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(double[] lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public int[] getOriginalNumbers() {
		return originalNumbers;
	}

	public void setOriginalNumbers(int[] originalNumbers) {
		this.originalNumbers = originalNumbers;
	}

	public Map<BedType, int[]> getAvailableRoom() {
		return availableRoom;
	}

	public void setAvailableRoom(Map<BedType, int[]> availableRoom) {
		this.availableRoom = availableRoom;
	}

	

}

