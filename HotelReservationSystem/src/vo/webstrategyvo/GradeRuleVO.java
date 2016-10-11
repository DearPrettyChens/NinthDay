package vo.webstrategyvo;

import java.util.Map;
/**
 * 等级规则vo
 * @author CYF
 * @version 1.0
 */
public class GradeRuleVO {
	//等级规则
	private Map<Integer,Integer> gradeAndValue;

	public GradeRuleVO(Map<Integer,Integer> gradeAndValue){
		this.setGradeAndValue(gradeAndValue);
	}
	public Map<Integer, Integer> getGradeAndValue() {
		return gradeAndValue;
	}

	public void setGradeAndValue(Map<Integer, Integer> gradeAndValue) {
		this.gradeAndValue = gradeAndValue;
	}
	
}
