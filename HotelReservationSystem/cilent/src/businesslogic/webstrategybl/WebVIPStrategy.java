package businesslogic.webstrategybl;

import java.util.Map;

import common.ResultMessage;
import common.WebStrategyType;
import vo.webstrategyvo.WebStrVO;
/**
 * 网站vip折扣策略
 * @author CYF
 * @version 1.0
 */
public class WebVIPStrategy implements WebStrategyInterface{
	//网站vip折扣策略映射
	private Map<Integer,Double> strategy;
	public WebVIPStrategy(){
		
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
