package businesslogic.webstrategybl;

import java.util.Date;
import java.util.Map;

import common.ResultMessage;
import common.WebStrategyType;
import vo.webstrategyvo.WebStrVO;
/**
 * 网站特定时期策略
 * @author CYF
 * @version 1.0
 */
public class WebSpecialTimeStrategy implements WebStrategyInterface{
	//网站特定时期策略映射
	private Map<Date,Double> strategy; 
	
	public WebSpecialTimeStrategy(){
		
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
