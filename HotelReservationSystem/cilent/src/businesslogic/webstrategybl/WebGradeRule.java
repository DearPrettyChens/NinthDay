package businesslogic.webstrategybl;

import common.ResultMessage;
import data.webstrategydata.WebStrategyDataServiceMySqlImpl_Stub;
import dataservice.webstrategydataservice.WebStrategyDataService;
import vo.webstrategyvo.GradeRuleVO;
/**
 * 网站等级规则类
 * @author CYF
 * @version 1.0
 */
public class WebGradeRule {
	//每升一级的信用值
	private int credit;
	private WebStrategyDataService webStrategyDataService;
	public WebGradeRule(){
		webStrategyDataService = new WebStrategyDataServiceMySqlImpl_Stub();
	}
    /**
     * 获取信用值
     * @return GradeRuleVO
     */
	public GradeRuleVO getCredit() {
		return null;
	}
    /**
     * 设置信用值
     * @param vo
     * @return ResultMessage
     */
	public ResultMessage setCredit(GradeRuleVO vo) {
		return null;
	}
}
