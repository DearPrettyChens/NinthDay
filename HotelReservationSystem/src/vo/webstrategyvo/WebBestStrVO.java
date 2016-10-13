package vo.webstrategyvo;

import common.Strategy;

/**
 * 网站最优策略
 * @author CYF
 * @version 1.0
 */
public class WebBestStrVO {
	//最优策略
	private Strategy bestStr;
	public WebBestStrVO(){
	}
	public WebBestStrVO(Strategy bestStr){
		this.setBestStr(bestStr);
	}
	public Strategy getBestStr() {
		return bestStr;
	}
	public void setBestStr(Strategy bestStr) {
		this.bestStr = bestStr;
	}
}
