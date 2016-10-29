package businesslogic.personnelbl;

import java.util.ArrayList;

import blservice.personnelblservice.PersonnelBLService;
import common.ResultMessage;
import vo.personnelvo.CustomerDetailVO;
import vo.personnelvo.CustomerListVO;
import vo.personnelvo.HotelWorkerDetailVO;
import vo.personnelvo.HotelWorkerListVO;
import vo.personnelvo.WebMarketManDetailVO;
import vo.personnelvo.WebMarketManListVO;

/**
 * Personnel模块的控制类
 * @author cy
 * @version 1.0
 * 
 */
public class PersonnelController implements PersonnelBLService {
	private Personnel personnel;
	public PersonnelController(){
		
	}
    public PersonnelController(Personnel personnel){
		this.personnel=personnel;
	}

	@Override
	public ResultMessage checkUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkUserTel(String userTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkHotelTel(String hotelTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage confirmRegister(CustomerDetailVO customerDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addHotelWorker(HotelWorkerDetailVO hotelWorkerDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addWebMarketMan(WebMarketManDetailVO webMarketManDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelWorkerListVO> getHotelWorkerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<WebMarketManListVO> getWebMarketManList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerListVO> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelWorkerDetailVO getHotelWorkerDetail(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebMarketManDetailVO getWebWorkerManDetail(String webWorkerManID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDetailVO getCustomerDetail(String customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage modifyHotelworker(HotelWorkerDetailVO hotelWorkerDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage modifyWebMarketMan(WebMarketManDetailVO webMarketManDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage modifyCustomer(CustomerDetailVO customerDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
