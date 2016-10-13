package po;
import java.io.Serializable;
/**
 * 传递会员等级策略的po
 * @author CLL
<<<<<<< HEAD
 * @version 1.0
=======

<<<<<<< HEAD
>>>>>>> refs/heads/Lili
=======
import java.io.Serializable;

/**
 * 传递会员等级策略的po
 * @author CLL
 *
>>>>>>> refs/remotes/origin/cyfBranch
 */
public class GradeRulePO implements Serializable {
	//每升一级所需的信用值
	private int credit;
	
	public GradeRulePO(int credit){
		this.setCredit(credit);
	}
	
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
}


