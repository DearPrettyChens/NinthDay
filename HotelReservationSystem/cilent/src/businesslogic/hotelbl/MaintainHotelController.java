package businesslogic.hotelbl;

import blservice.hotelblservice.MaintainHotelService;
import common.ResultMessage;
import common.Telephone;
import vo.hotelvo.HotelBasicInfoVO;

/**
 * Hotel模块的MaintainHotelController控制类
 * @author csy
 * @version 1.0
 */
public class MaintainHotelController implements MaintainHotelService{
	private Hotel hotel;
	public MaintainHotelController() {
		hotel=new Hotel();
	}
	/**
	 * 获取酒店基本信息
	 * @param hotelID String型，传递酒店编号
	 * @return HotelBasicInfoVO ，将酒店基本信息返回
	 *
	 */
	public HotelBasicInfoVO getHotelBasicInfo(String hotelID){
		return hotel.getHotelBasicInfo(hotelID);
		
	}
	
	/**
	 * 检查酒店工作人员输入的酒店电话格式
	 * @param telNum String型，传递酒店电话
	 * @return ResultMessage，格式正确返回SUCCESS,格式错误返回HOTELTELFORMATERROR
	 *
	 */
	public ResultMessage checkTel(String telNum){
		return new Telephone(telNum).checkValid();
		
	}
	
	/**
	 * 确认维护的酒店信息
	 * @param hotelBasicInfoVO HotelBasicInfoVO型，传递酒店基本信息
	 * @return ResultMessage，保存成功返回SUCCESS,失败返回FAIL，格式错误返回具体什么格式错误
	 *
	 */
	public ResultMessage confirmModifyInfo(HotelBasicInfoVO hotelInfovo){
		return hotel.confirmModifyInfo(hotelInfovo);
		
	}
}
