package businesslogic.orderbl;

import java.util.ArrayList;
import java.util.Date;

import common.ResultMessage;
import vo.availableroomvo.AvailableRoomNumberVO;
import vo.hotelvo.HotelDetailInfoVO;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.OrderVO;
import vo.ordervo.RemarkVO;
import vo.ordervo.StrategyVO;
import vo.ordervo.TypeInfoVO;
/**
 * Order模块的领域类
 * @author csy
 * @version 1.0
 */
public class Order {
	private OrderList orderList;
	private SingleOrder singleOrder;
	
	/**
	 * 检测是否有大于0的信用值可生成订单
	 * @param CustomerID String型，传递顾客编号
	 * @return ResultMessage，如果信用值大于0返回SUCCESS,否则返回LACKOFCREDIT
	 *
	 */
	public ResultMessage checkUserCredit(String CustomerID){
		return null;
		
	}
	
	/**
	 * 检查输入的入住日期的格式
	 * @param time Date型，传递入住日期
	 * @return ResultMessage，格式正确返回SUCCESS,格式错误返回DATAFORMATERROR,
	 * @throws 未定
	 *
	 */
	public ResultMessage checkTime(Date time){
		return null;
		
	}
	
	/**
	 * 新增订单信息
	 * @param 
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage confirmAddOrder(){
		return null;
		
	}
	
	/**
	 * 获取订单详细信息
	 * @param orderID String型，传递订单号
	 * @return OrderInfoVO ，将订单详细信息返回给界面或hotel模块
	 * @throws 未定
	 *
	 */
	public OrderInfoVO getOrderInfo(String orderID){
		return null;
		
	}
	
	/**
	 * 获取特定类型的订单列表
	 * @param typeInfoVO TypeInfoVO型,传递订单类型信息
	 * @return  ArrayList<OrderVO> ，将特定订单列表返回给界面
	 * @throws 未定
	 *
	 */
	public ArrayList<OrderVO> getOrderList(TypeInfoVO vo){
		return null;
		
	}
	
	/**
	 * 撤销订单，如果是异常订单撤销，返还相应的信用值
	 * @param orderID String型，界面传递过来的订单号
	 * @return ResultMessage，撤销成功返回SUCCESS,撤销失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage cancelOrderConfirm (String orderID){
		return null;
		
	}
	
	/**
	 * 评价酒店
	 * @param remarkVO RemarkVO型，界面传递过来的评价信息
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage remarkOrder(RemarkVO vo){
		return null;
		
	}
	
	/**
	 * 产生优惠信息
	 * @param orderInfoVO OrderInfoVO型，界面传递过来的订单信息
	 * @return 返回策略信息和优惠价格
	 * @throws 未定
	 *
	 */
	public StrategyVO next(OrderInfoVO orderinfovo){
		return null;
		
	}
	
	/**
	 * 保存订单实际入住时间
	 * @param time Date型，界面传递过来的实际入住时间
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage setCheckinTime(Date time){
		return null;
		
	}
	
	/**
	 * 保存订单实际退房时间
	 * @param time Date型，界面传递过来的实际退房时间
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage setCheckoutTime(Date time){
		return null;
		
	}
	
	/**
	 * 增加顾客订单总价全部或二分之一的信用值
	 * @param creditNum int 型，界面传递过来的信用值
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage setReturnCredit(int creditNum){
		return null;
		
	}
	
	/**
	 * 生成订单的界面上需要酒店的信息（可用客房+酒店地址电话）
	 * @param hotelID string 型，界面传递过来的酒店编号
	 * @return HotelDetailInfoVO，返回酒店详细信息
	 * @throws 未定
	 *
	 */
	public HotelDetailInfoVO getHotelDetailInfo(String hotelID){
		return null;
		
	}
	
	/**
	 * 检查订单上可用客房是否数量足够
	 * @param vo AvailableRoomNumberVO型，传递可用客房数量信息
	 * @return ResultMessage，数量足够返回SUCCESS,数量不够返回NOTENOUGHAVAILABLEROOM,
	 * @throws 未定
	 *
	 */
	public ResultMessage checkAvailableRoomNumber (AvailableRoomNumberVO vo){
		return null;
		
	}
	
	
	
	
}
