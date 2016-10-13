package vo.ordervo;

import java.util.Date;

import common.Children;
import common.OrderState;
import common.BedType;
/**
 * 订单详细信息的vo类
 * @author CLL
 * @version 1.0
 */
public class OrderInfoVO {
	//顾客编号
	private String customerID;
	//订单编号
	private String orderID;
	//顾客生成订单时填写的顾客姓名
	private String customerName;
	//顾客生成订单时填写的顾客联系方式
	private String customerTelephone;
	//酒店名称
	private String hotelName;
	//酒店ID
	private String hotelID;
	//酒店联系方式
	private String hotelTelephone;
	//预定房型
	private String roomType;
	//预定床型
	private BedType bedType;
	//预定房间数量
	private int amount;
	//预定时间
	private Date orderTime;
	//入住人数
	private int NumberOfPeople;
	//有无儿童
	private Children hasChild;
	//是否评价
	//枚举？----------------------------------//
	private boolean hasRemarked;
	//预计入住时间
	private Date expectedCheckInTime;
	//预计退房时间
	private Date expectedCheckOutTime;
	//＊＊＊＊＊＊＊＊＊＊＊＊＊疑问:最晚入住时间在什么时候生成？下订单时会产生吗？//
	//最晚入住时间
	private Date lateCheckInTime;
	//实际入住时间
	private Date actualCheckInTime;
	//实际退房时间
	private Date actuarCheckOutTime;
	//订单价格
	private double price;
	//订单状态
	private OrderState state;
	//空方法
	public OrderInfoVO(){
		
	}
	//查看所有订单信息
	public OrderInfoVO(String customerID, String orderID, String customerName, String customerTelephone,
			String hotelName, String hotelID, String hotelTelephone, String roomType, BedType bedType, int amount,
			Date orderTime, int numberOfPeople, Children hasChild, boolean hasRemarked, Date expectedCheckInTime,
			Date expectedCheckOutTime, Date lateCheckInTime, Date actualCheckInTime, Date actualCheckOutTime,
			double price, OrderState state) {
		this.setCustomerID(customerID);
		this.setOrderID(orderID);
		this.setCustomerName(customerName);
		this.setCustomerTelephone(customerTelephone);
		this.setHotelName(hotelName);
		this.setHotelID(hotelID);
		this.setHotelTelephone(hotelTelephone);
		this.setRoomType(roomType);
		this.setBedType(bedType);
		this.setAmount(amount);
		this.setOrderTime(orderTime);
		this.setNumberOfPeople(numberOfPeople);
		this.setHasChild(hasChild);
		this.setHasRemarked(hasRemarked);
		this.setExpectedCheckInTime(expectedCheckInTime);
		this.setExpectedCheckOutTime(expectedCheckOutTime);
		this.setLateCheckInTime(lateCheckInTime);
		this.setActualCheckInTime(actualCheckInTime);
		this.setActuarCheckOutTime(actualCheckOutTime);
		this.setPrice(price);
		this.setState(state);
	}

	//顾客下订单时的订单信息
	public OrderInfoVO(String orderID,String hotelID, String customerID, String customerName, String customerTelephone,
			Date expectedCheckInTime, Date expectedCheckOutTime,String roomType, BedType bedType, int amount,
			int numberOfPeople, Children hasChild,double price,OrderState state) {
		this.setOrderID(orderID);
		this.setCustomerID(customerID);
		this.setHotelID(hotelID);
		this.setCustomerName(customerName);
		this.setCustomerTelephone(customerTelephone);
		this.setExpectedCheckInTime(expectedCheckInTime);
		this.setExpectedCheckOutTime(expectedCheckOutTime);
		this.setRoomType(roomType);
		this.setBedType(bedType);
		this.setAmount(amount);
		this.setNumberOfPeople(numberOfPeople);
		this.setHasChild(hasChild);
		this.setPrice(price);
		this.setState(state);
	}
	//顾客在撤销订单前及入住之前查看订单时显示的订单信息
	//酒店管理人员checkin时获取的订单信息
	//网站营销人员撤销异常订单时获取的订单信息
	public OrderInfoVO(String orderID,String hotelID, String customerID, String customerName, String customerTelephone,
			Date expectedCheckInTime, Date expectedCheckOutTime, Date lateCheckInTime,String roomType, BedType bedType, int amount,
			int numberOfPeople, Children hasChild,double price,OrderState state) {
		this.setOrderID(orderID);
		this.setCustomerID(customerID);
		this.setHotelID(hotelID);
		this.setCustomerName(customerName);
		this.setCustomerTelephone(customerTelephone);
		this.setExpectedCheckInTime(expectedCheckInTime);
		this.setExpectedCheckOutTime(expectedCheckOutTime);
		this.setLateCheckInTime(lateCheckInTime);
		this.setRoomType(roomType);
		this.setBedType(bedType);
		this.setAmount(amount);
		this.setNumberOfPeople(numberOfPeople);
		this.setHasChild(hasChild);
		this.setPrice(price);
		this.setState(state);
	}
	//酒店管理人员checkout时获取的订单信息
	public OrderInfoVO(String orderID,String hotelID, String customerID, String customerName, String customerTelephone,
			Date expectedCheckInTime, Date expectedCheckOutTime, Date lateCheckInTime,String roomType, BedType bedType, int amount,
			int numberOfPeople, Children hasChild,OrderState state,Date actualCheckInTime){
		this.setOrderID(orderID);
		this.setCustomerID(customerID);
		this.setHotelID(hotelID);
		this.setCustomerName(customerName);
		this.setCustomerTelephone(customerTelephone);
		this.setExpectedCheckInTime(expectedCheckInTime);
		this.setExpectedCheckOutTime(expectedCheckOutTime);
		this.setLateCheckInTime(lateCheckInTime);
		this.setRoomType(roomType);
		this.setBedType(bedType);
		this.setAmount(amount);
		this.setNumberOfPeople(numberOfPeople);
		this.setHasChild(hasChild);
		this.setState(state);
		this.setActualCheckInTime(actualCheckInTime);
	}
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerTelephone() {
		return customerTelephone;
	}

	public void setCustomerTelephone(String customerTelephone) {
		this.customerTelephone = customerTelephone;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelTelephone() {
		return hotelTelephone;
	}

	public void setHotelTelephone(String hotelTelephone) {
		this.hotelTelephone = hotelTelephone;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public int getNumberOfPeople() {
		return NumberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		NumberOfPeople = numberOfPeople;
	}

	public Children isHasChild() {
		return hasChild;
	}

	public void setHasChild(Children hasChild) {
		this.hasChild = hasChild;
	}

	public boolean isHasRemarked() {
		return hasRemarked;
	}

	public void setHasRemarked(boolean hasRemarked) {
		this.hasRemarked = hasRemarked;
	}

	public Date getExpectedCheckInTime() {
		return expectedCheckInTime;
	}

	public void setExpectedCheckInTime(Date expectedCheckInTime) {
		this.expectedCheckInTime = expectedCheckInTime;
	}

	public Date getExpectedCheckOutTime() {
		return expectedCheckOutTime;
	}

	public void setExpectedCheckOutTime(Date expectedCheckOutTime) {
		this.expectedCheckOutTime = expectedCheckOutTime;
	}

	public Date getLateCheckInTime() {
		return lateCheckInTime;
	}

	public void setLateCheckInTime(Date lateCheckInTime) {
		this.lateCheckInTime = lateCheckInTime;
	}

	public Date getActualCheckInTime() {
		return actualCheckInTime;
	}

	public void setActualCheckInTime(Date actualCheckInTime) {
		this.actualCheckInTime = actualCheckInTime;
	}

	public Date getActuarCheckOutTime() {
		return actuarCheckOutTime;
	}

	public void setActuarCheckOutTime(Date actualCheckOutTime) {
		this.actuarCheckOutTime = actuarCheckOutTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

}
