package businesslogic.personnelbl;

import java.util.ArrayList;

import blservice.personnelblservice.PersonnelBLService;
import common.Password;
import common.ResultMessage;
import common.Telephone;
import vo.personnelvo.CustomerDetailVO;
import vo.personnelvo.CustomerListVO;
import vo.personnelvo.HotelWorkerDetailVO;
import vo.personnelvo.HotelWorkerListVO;
import vo.personnelvo.PersonDetailVO;
import vo.personnelvo.PersonListVO;
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
	    this.personnel=new Personnel();
	}
    
	@Override
	public ResultMessage checkUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ResultMessage addPerson(PersonDetailVO personDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<PersonListVO> getPersonList(String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PersonDetailVO getPersonDetail(String personID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultMessage setPerson(PersonDetailVO personDetailVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkTel(Telephone userTel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkPassword(Password password) {
		// TODO Auto-generated method stub
		return null;
	}

}
