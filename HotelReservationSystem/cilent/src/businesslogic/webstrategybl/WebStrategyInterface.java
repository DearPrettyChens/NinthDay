package businesslogic.webstrategybl;

import common.ResultMessage;
import common.WebStrategyType;
import vo.webstrategyvo.WebStrVO;
/**
 * 网站策略接口类
 * @author CYF
 * @version 1.0
 */
public interface WebStrategyInterface {
	/**
	 * 获取策略折扣
	 * @return WebStrVO
	 */
	public WebStrVO getDiscount() ;
	/**
	 * 设置策略折扣
	 * @param vo
	 * @return ResultMessage
	 */
	public ResultMessage setDiscount(WebStrVO vo);
	
}