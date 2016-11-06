package businesslogic.bl.orderbl;

import businesslogic.blservice.orderblservice.CancleOrderService;
import util.OrderState;
import util.ResultMessage;

/**
 * Order模块的CancleOrderController控制类
 * @author csy
 * @version 1.0
 */
public class CancleOrderController implements CancleOrderService{

	private SingleOrder singleOrder;
    //调用singleOrder里面的方法
	public CancleOrderController() {
		singleOrder=new SingleOrder();
	}
	
	@Override
	public ResultMessage setReturnCredit(String orderID) {
		// TODO Auto-generated method stub
		return singleOrder.addOrderState(OrderState.HASCANCELED, orderID);
	}

	@Override
	public ResultMessage cancelOrderConfirm(int creditNum) {
		// TODO Auto-generated method stub
		return singleOrder.setReturnCredit(creditNum);
	}

}
