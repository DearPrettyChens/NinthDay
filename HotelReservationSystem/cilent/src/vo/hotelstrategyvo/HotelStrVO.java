package vo.hotelstrategyvo;

import java.util.ArrayList;
import java.util.Date;

import common.HotelStrategyType;
import common.Strategy;


public class HotelStrVO {
	/**
	 * hotelStr：
	 *   包含四中折扣信息
	 *   @author Cy
	 *   @virsion 1.0
	 *   
        
	 */
	//酒店ID
	private String hotelID;
	//数量策略的数量
	private int amount;
	//策略类型
    private HotelStrategyType type;
    //折扣值
    private double discount;
    //合作企业
    private ArrayList <String> enterprise;
    //优惠日期
    private Date[] date;

	public HotelStrVO(){
		
	}

	public HotelStrategyType getType() {
		return type;
	}

	public void setType(HotelStrategyType type) {
		this.type = type;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public ArrayList<String> getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(ArrayList<String> enterprise) {
		this.enterprise = enterprise;
	}

	public Date[] getDate() {
		return date;
	}

	public void setDate(Date[] date) {
		this.date = date;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	
}