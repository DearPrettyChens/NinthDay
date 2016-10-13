package vo.webstrategyvo;

import common.Strategy;
import common.WebStrategyType;

/**
 * 网站最优策略
 * @author CYF
 * @version 1.0
 */
public class WebBestStrVO {
	//最优策略
	private Strategy bestStr;
	//网站营销策略类型 感觉写到Strategy里面会不会好一点？
	private WebStrategyType webStrategyType;
	
	public WebBestStrVO(){
	}
	public WebBestStrVO(Strategy bestStr,WebStrategyType webStrategyType){
		this.setBestStr(bestStr);
		this.setWebStrategyType(webStrategyType);
	}
	public Strategy getBestStr() {
		return bestStr;
	}
	public void setBestStr(Strategy bestStr) {
		this.bestStr = bestStr;
	}
	public WebStrategyType getWebStrategyType() {
		return webStrategyType;
	}
	public void setWebStrategyType(WebStrategyType webStrategyType) {
		this.webStrategyType = webStrategyType;
	}
}
