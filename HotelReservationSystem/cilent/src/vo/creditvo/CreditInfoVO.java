package vo.creditvo;

import java.util.ArrayList;

public class CreditInfoVO {
	/**信用记录信息
	1)用户名
	2）用户编号
	3）当前信用值
	4)信用记录
	@author Cy
	@virsion 1.0
	*/
	private String name;//用户名
	private String customerNumber;//用户编号
	private int credit;//当前信用值
	private ArrayList<CreditVO> credits;//信用记录
	public CreditInfoVO(){
	}
	public CreditInfoVO(String name,String customerNumber,int credit,ArrayList<CreditVO> credits){
		this.name=name;
		this.customerNumber=customerNumber;
		this.credits=credits;
		this.credit=credit;
		
		
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomernumber() {
		return customerNumber;
	}
	public void setCustomernumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public ArrayList<CreditVO> getCreditinfo() {
		return credits;
	}

    public void setCreditinfo(ArrayList<CreditVO> creditinfo) {
		this.credits = creditinfo;
	}

	

}


