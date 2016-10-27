package businesslogic.checkinbl;

import java.util.ArrayList;

import common.BedType;
import common.ResultMessage;
import vo.checkinvo.AvailableRoomInfoVO;
import vo.checkinvo.AvailableRoomNumberVO;
import vo.checkinvo.CheckinInfoVO;
import vo.checkinvo.OrderInfoVO;
/**
 * checkin的领域类
 * @author CLL
 * @version1.0
 */
public class Checkin{
	//住房信息列表
	ArrayList<CheckinInfo> checkinInfoList;
	//酒店编号
	String hotelID;
	
	public Checkin(){
		
	}
	
	public Checkin(String hotelID){
		this.hotelID=hotelID;
		//TODO 
		//这边应该有一个方法从酒店数据层拿到酒店所有的住房记录
		checkinInfoList=new ArrayList<CheckinInfo>();
	}
	/**
	 * 根据订单号获取顾客订单信息
	 * @param orderID
	 * @return OrderInfoVO
	 */
	public OrderInfoVO getOrderInfo(String orderID){
		//TODO 
		//调用ordermock类的方法
		return null;
	}
	/**
	 * 获取查找到的顾客住房信息,委托给checkininfo
	 * @param orderID
	 * @return CheckinInfo
	 */
	public CheckinInfoVO getCheckinInfo(String orderID){
		return null;
	}
	/**
	 * 判断身份证格式是否正确
	 * @param ID
	 * @return ResultMessage
	 */
	public ResultMessage checkIDLength(String ID){
		return null;
	}
	/**
	 * 新增顾客住房信息并自动更新订单信息,委托给checkininfo
	 * @param vo
	 * @return ResultMessage
	 */
	public ResultMessage confirmCheckinInfo(CheckinInfoVO vo){
		CheckinInfo checkinInfo=new CheckinInfo(vo);
		checkinInfoList.add(checkinInfo);
		//TODO
		//调用order
		return null;
	}
	/**
	 * 修改顾客住房信息并自动更新订单信息和可用客房信息
	 * @param vo
	 * @return ResultMessage
	 */
	public ResultMessage confirmCheckoutInfo(CheckinInfoVO vo){
		//TODO
		//调用checkinInfo
		//TODO
		//调用availableroom
		//TODO
		//调用order
		return null;
	}
	/**
	 * 判断输入可用客房数量是否超过该类型客房总数
	 * @param bedType
	 * @param number
	 * @return ResultMessage
	 */
	public ResultMessage checkAvailableRoomNumber(BedType bedType,String number){
		//TODO
		//调用availableroom
		return null;
	}
	/**
	 * 系统持久化修改该酒店可用客房信息
	 * @param vo
	 * @return ResultMessage
	 */
	public ResultMessage confirmAvailableRoomNumber(AvailableRoomNumberVO vo){
		//TODO
		//调用availableroom
		return null;
	}
	/**
	 * 系统返回该酒店的可用房间信息
	 * @return ResultMessage
	 */
	public AvailableRoomInfoVO getAvailableRoomInfo(){
		//TODO
		//调用availableroom
		return null;
	}

}