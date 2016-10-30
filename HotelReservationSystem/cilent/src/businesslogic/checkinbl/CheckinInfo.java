package businesslogic.checkinbl;

import java.util.Date;

import common.BedType;
import common.ResultMessage;
import dataservice.availableroomdataservice.AvailableRoomDataService;
import vo.checkinvo.CheckinInfoVO;

/**
 * 单条住房记录的类
 * @author CLL
 * @version1.0
 */
public class CheckinInfo {
	private String hotelID;//酒店编号
	private String name;//用户真实姓名
	private String ID;//身份证号（数字
	private String tel;//联系方式（11位手机号）
	private BedType bedType;//床类型
	private String roomNumber;//房间号（数字
	private Date checkinTime;//实际入住时间（-年-月-日-时-分）
	private Date checkoutTime;//实际退房时间（-年-月-日-时-分
	private String hotelNumber;//酒店编号
	private String orderNumber;//订单号
	//数据层的引用
	private AvailableRoomDataService availableRoomDataService;
	
	public CheckinInfo(){
		
	}
	
	/**
	 * 新增住房信息的构造函数
	 * @param vo
	 */
	public CheckinInfo(CheckinInfoVO vo){
		this.hotelID=vo.getHotelnumber();
		this.name=vo.getCostumername();
		this.ID=vo.getID();
		this.tel=vo.getTel();
		this.bedType=vo.getBedtype();
		this.roomNumber=vo.getRoomnumber();
		this.checkinTime=vo.getCheckintime();
		this.checkoutTime=vo.getCheckouttime();
		this.hotelNumber=vo.getHotelnumber();
		this.orderNumber=vo.getOrdernumber();
	}
	
	
	/**
	 * 获取查找到的顾客住房信息
	 * @param orderID
	 * @return CheckinInfo
	 */
	public CheckinInfoVO getCheckinInfo(){
		return null;
	}
	
	/**
	 * 修改顾客住房信息
	 * @param vo
	 * @return ResultMessage
	 */
	public ResultMessage confirmCheckoutInfo(CheckinInfoVO vo){
		return null;
	}
	//以下get,set都是和数据层的交互
	public String getName() {
		return null;
	}
	public void setName(String name) {
		
	}
	public String getID() {
		return null;
	}
	public ResultMessage setID(String iD) {
		return null;
		
	}
	public String getTel() {
		return null;
	}
	public ResultMessage setTel(String tel) {
		return null;
		
	}
	public BedType getRoomtype() {
		return null;
	}
	public ResultMessage setRoomtype(BedType roomtype) {
		return null;
		
	}
	public String getRoomnumber() {
		return null;
	}
	public ResultMessage setRoomnumber(String roomnumber) {
		return null;
		
	}
	public Date getCheckintime() {
		return null;
	}
	public ResultMessage setCheckintime(Date checkintime) {
		return null;
		
	}
	public Date getCheckouttime() {
		return null;
	}
	public ResultMessage setCheckouttime(Date checkouttime) {
		return null;
		
	}
	public String getHotelnumber() {
		return null;
	}
	public ResultMessage setHotelnumber(String hotelnumber) {
		return null;
		
	}
	public String getOrdernumber() {
		return null;
	}
	public ResultMessage setOrdernumber(String ordernumber) {
		return null;
		
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
}
