package businesslogic.orderbl;

import java.util.Date;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import common.OrderState;
import common.ResultMessage;
import data.orderdata.OrderDataServiceMySqlImpl_Stub;
import dataservice.orderdataservice.OrderDataService;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.RemarkVO;
import vo.ordervo.StrategyVO;
/**
 * Order模块的领域类
 * @author csy
 * @version 1.0
 */
public class SingleOrder {
	
	OrderDataService orderDataService;
	
	public SingleOrder() {
		orderDataService=new OrderDataServiceMySqlImpl_Stub();
	}
	
	/**
	 * 获取订单详细信息
	 * @param orderID String型，传递订单号
	 * @return OrderInfoVO ，将订单详细信息返回给界面或hotel模块
	 * @throws 未定
	 *
	 */
	public OrderInfoVO getOrderInfo(){
		return null;
		
	}
	
	/**
	 * 添加订单
	 * @param vo OrderInfoVO型，用来传递新增订单信息
	 * @return ResultMessage，如果设置成功返回SUCCESS,否则返回FAIL
	 * @throws 未定
	 */
	public StrategyVO addOrder(OrderInfoVO vo){
		return null;
		
	}
	
	/**
	 * 添加订单状态
	 * @param orderstate OrderState型，用来传递订单状态
	 * @return ResultMessage，如果添加成功返回SUCCESS,否则返回FAIL
	 * @throws 未定
	 */
	public ResultMessage addOrderState(OrderState orderState,String orderID){
		return null;
		
	}
	
	/**
	 * 保存订单实际入住时间
	 * @param time Date型，orderID string型，界面传递过来的实际入住时间和订单编号
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */

	public ResultMessage setCheckinTime(Date time,String orderID){
		return null;
		
	}
	
	/**
	 * 保存订单实际退房时间
	 * @param time Date型，orderID string型界面传递过来的实际退房时间和订单编号
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 * @throws 未定
	 *
	 */
	public ResultMessage setCheckoutTime(Date time,String orderID){
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
}
