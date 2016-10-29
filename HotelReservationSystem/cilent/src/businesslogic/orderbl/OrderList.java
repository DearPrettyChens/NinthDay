package businesslogic.orderbl;

import java.util.ArrayList;

import data.orderdata.OrderDataServiceMySqlImpl_Stub;
import dataservice.orderdataservice.OrderDataService;
import vo.ordervo.OrderInfoVO;
import vo.ordervo.OrderVO;
import vo.ordervo.TypeInfoVO;
/**
 * Order模块的领域类
 * @author csy
 * @version 1.0
 */
public class OrderList {
	private ArrayList<SingleOrder> singleOrders;
	private OrderDataService orderDataService;
	public OrderList() {
		orderDataService=new OrderDataServiceMySqlImpl_Stub();
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
	 * 获取订单详细信息
	 * @param orderID String型，传递订单号
	 * @return OrderInfoVO ，将订单详细信息返回给界面或hotel模块
	 * @throws 未定
	 *
	 */
	public OrderInfoVO getOrderInfo(String orderId){
		return null;
		
	}
}
