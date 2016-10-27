package businesslogic.checkinbl;

import java.util.Date;

import common.BedType;
import common.ResultMessage;
import vo.checkinvo.CheckinInfoVO;

/**
 * 单条住房记录的类
 * @author CLL
 * @version1.0
 */
public class CheckinInfo {
	private String name;//用户真实姓名
	private String ID;//身份证号（数字
	private String tel;//联系方式（11位手机号）
	private BedType bedType;//床类型
	private String roomNumber;//房间号（数字
	private Date checkinTime;//实际入住时间（-年-月-日-时-分）
	private Date checkoutTime;//实际退房时间（-年-月-日-时-分
	private String hotelNumber;//酒店编号
	private String orderNumber;//订单号
	
	public CheckinInfo(){
		
	}
	
	/**
	 * 新增住房信息的构造函数
	 * @param vo
	 */
	public CheckinInfo(CheckinInfoVO vo){
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
	
	public CheckinInfo(String name,String ID,String tel,String roomtype,BedType bedtype,String roomnumber
			,Date checkintime,Date checkouttime,String hotelnumber,String ordernumber){
		this.name=name;
		this.ID=ID;
		this.tel=tel;
		this.bedType=bedtype;
		this.roomNumber=roomnumber;
		this.checkinTime=checkintime;
		this.checkoutTime=checkouttime;
		this.hotelNumber=hotelnumber;
		this.orderNumber=ordernumber;
		
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public BedType getRoomtype() {
		return bedType;
	}
	public void setRoomtype(BedType roomtype) {
		this.bedType = roomtype;
	}
	public String getRoomnumber() {
		return roomNumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomNumber = roomnumber;
	}
	public Date getCheckintime() {
		return checkinTime;
	}
	public void setCheckintime(Date checkintime) {
		this.checkinTime = checkintime;
	}
	public Date getCheckouttime() {
		return checkoutTime;
	}
	public void setCheckouttime(Date checkouttime) {
		this.checkoutTime = checkouttime;
	}
	public String getHotelnumber() {
		return hotelNumber;
	}
	public void setHotelnumber(String hotelnumber) {
		this.hotelNumber = hotelnumber;
	}
	public String getOrdernumber() {
		return orderNumber;
	}
	public void setOrdernumber(String ordernumber) {
		this.orderNumber = ordernumber;
	}
}
