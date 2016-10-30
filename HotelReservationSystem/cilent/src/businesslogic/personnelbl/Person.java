package businesslogic.personnelbl;

import javax.swing.ImageIcon;

import common.Password;
import common.ResultMessage;
import common.Telephone;
import vo.personnelvo.PersonDetailVO;

/**
 * 
 *各种人员的接口
 * @author cy
 * @version 1.0
 * 
 */
public interface Person {
	    
		
		
        /**
         * 增加用户信息
         * @param PersonDetailVO personDetailVO
         * @return ResultMessage
         * @throws 未定
         */
        public ResultMessage addPerson(PersonDetailVO personDetailVO);
        /**
         * 得到用户详细信息
         * @param null
         * @return PersonDetailVO
         * @throws 未定
         */
        public PersonDetailVO getDetail ();
        /**
         * 修改用户详细信息
         * @param PersonDetailVO personDetailVO
         * @return ResultMessage
         * @throws 未定
         */
        public ResultMessage setPerson (PersonDetailVO personDetailVO);
        
        
}
