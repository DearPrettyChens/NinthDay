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
	public WebStrVO getDiscount() {
		return null;
	}

	@Override
	public ResultMessage setDiscount(WebStrVO vo) {
		return null;
	}

}
