package businesslogic.webstrategybl;

import java.util.Map;

import common.ResultMessage;
import common.WebStrategyType;
import data.webstrategydata.WebStrategyDataServiceMySqlImpl_Stub;
import dataservice.webstrategydataservice.WebStrategyDataService;
import vo.webstrategyvo.WebStrVO;
/**
 * 网站vip折扣策略
 * @author CYF
 * @version 1.0
 */
public class WebVIPStrategy implements WebStrategyInterface{
	//网站vip折扣策略映射
	private Map<Integer,Double> strategy;
	private WebStrategyDataService webStrategyDataService;
	public WebVIPStrategy(){
		webStrategyDataService = new WebStrategyDataServiceMySqlImpl_Stub();
	}
	@Override
	public WebStrVO getWebStrategy() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ResultMessage setWebStrategy(WebStrVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	public Map<Integer, Double> getStrategy() {
		return strategy;
	}
	

}
