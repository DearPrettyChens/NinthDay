package businesslogic.webstrategybl;

import java.util.Date;
import java.util.Map;

import common.ResultMessage;
import common.TradingArea;
import common.WebStrategyType;
import vo.webstrategyvo.WebStrVO;
/**
 * 酒店特定商圈策略类
 * @author CYF
 * @version 1.0
 */
public class WebSpecialAreaStrategy implements WebStrategyInterface {
    //酒店特定商圈策略映射
	private Map<TradingArea,Double> strategy; 
	
    public WebSpecialAreaStrategy(){
    	
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

	public Map<TradingArea, Double> getStrategy() {
		return strategy;
	}



}
