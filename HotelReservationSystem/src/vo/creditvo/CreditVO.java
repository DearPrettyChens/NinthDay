package vo.creditvo;

import java.io.Serializable;
import java.util.Date;

public class CreditVO  implements Serializable{
	
	
	
	/**记录用户每条信用值：
	
	 * @author Cy
	 * @virsion 1.0
     */
	private String name;//用户名
	private String ID;//编号
	private double credit;//信用值
	private double CreditChange;//信用值变化
	private String reason;//原因
	private Date time;//时间
	
	public CreditVO(){
		
	}
    public CreditVO(String name,String ID,double credit,double CreditChange,String reason,Date time){
		this.credit=credit;
		this.CreditChange=CreditChange;
		this.reason=reason;
		this.time=time;
		this.reason=reason;
		this.ID=ID;
		
		
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getCreditChange() {
		return CreditChange;
	}
	public void setCreditChange(double creditChange) {
		CreditChange = creditChange;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	
	
	
	
	}

	

}
