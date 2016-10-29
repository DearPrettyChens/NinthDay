package businesslogic.personnelbl;

import javax.swing.ImageIcon;

import common.Password;
import common.ResultMessage;
import common.Telephone;
import vo.personnelvo.PersonDetailVO;

/**
 * 
 *各种人员的父类
 * @author cy
 * @version 1.0
 * 
 */
public class Person {
	    //头像
		ImageIcon userImage;
		//用户名
		String name;
		//联系方式11位
		Telephone telephone;
		//密码
		Password password;
		//用户编号
		String id;
		public Person(){
			
		}
        public Person(ImageIcon userImage,String name,Telephone telephone,Password password,String id){
			this.userImage=userImage;
			this.name=name;
			this.telephone=telephone;
			this.password=password;
			this.id=id;
			
					
		}
        /**
         * 增加用户信息
         * @param PersonDetailVO personDetailVO
         * @return ResultMessage
         * @throws 未定
         */
        public ResultMessage addPerson(PersonDetailVO personDetailVO){
        	return null;
        	
        }
        /**
         * 得到用户详细信息
         * @param null
         * @return PersonDetailVO
         * @throws 未定
         */
        public PersonDetailVO getDetail (){
        	return null;
        }
        /**
         * 修改用户详细信息
         * @param PersonDetailVO personDetailVO
         * @return ResultMessage
         * @throws 未定
         */
        public ResultMessage setPerson (PersonDetailVO personDetailVO){
        	return null;
        	
        }
        
}
