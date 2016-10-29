package businesslogic.hotelbl;

import java.util.ArrayList;

import common.ResultMessage;
import vo.hotelvo.HotelBasicInfoVO;
import vo.hotelvo.HotelDetailInfoVO;
import vo.hotelvo.HotelOrderInfoVO;
import vo.hotelvo.HotelOrderVO;

/**
 * Hotel模块的领域类
 * @author csy
 * @version 1.0
 */
public class Hotel {
	
	/**
	 * 获取酒店基本信息
	 * @param hotelID String型，传递酒店编号
	 * @return HotelBasicInfoVO ，将酒店基本信息返回
	 *
	 */
	public HotelBasicInfoVO getHotelBasicInfo(String hotelID){
		return null;
		
	}
	
	/**
	 * 获取酒店详细信息
	 * @param hotelID String型， customerID String型，传递酒店编号和顾客编号
	 * @return HotelDetailInfoVO ，将酒店详细信息返回
	 *
	 */
	public HotelDetailInfoVO getHotelDetailInfo(String hotelID,String customerID){
		return null;
		
	}
	
	/**
	 * 检查酒店工作人员输入的酒店电话格式
	 * @param telNum String型，传递酒店电话
	 * @return ResultMessage，格式正确返回SUCCESS,格式错误返回HOTELTELFORMATERROR
	 *
	 */
	public ResultMessage checkTel(String telNum){
		return null;
		
	}
	
	/**
	 * 确认维护的酒店信息
	 * @param hotelBasicInfoVO HotelBasicInfoVO型，传递酒店基本信息
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 *
	 */
	public ResultMessage confirmModifyInfo(HotelBasicInfoVO hotelInfovo){
		return null;
		
	}
	
	/**
	 * 获取酒店的订单列表
	 * @param hotelID String型，传递酒店编号
	 * @return ArrayList<HotelOrderVO>，返回酒店的订单列表
	 *
	 */
	public ArrayList<HotelOrderVO> getHotelOrderList(String hotelID){
		return null;
		
	}
	
	/**
	 * 获取酒店的订单详细信息
	 * @param orderID String型，传递订单编号
	 * @return HotelOrderInfoVO，返回酒店的订单详细信息
	 *
	 */
	public HotelOrderInfoVO getHotelOrderInfo(String orderID){
		return null;
		
	}
}
