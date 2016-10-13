package vo.webstrategyvo;

import common.WebSpecialAreaStrategy;
import common.WebSpecialTimeStrategy;
import common.WebVIPStrategy;
/**
 * 网站所有的营销策略
 * @author CYF
 * @version
 */
public class WebStrVO {
	//网站特定商圈优惠策略
	private WebSpecialAreaStrategy webSpecialAreaStrategy;
	//网站特定时期优惠策略
	private WebSpecialTimeStrategy webSpecialTimeStrategy;
	//网站VIP优惠策略
	private WebVIPStrategy webVIPStrategy;
    public WebStrVO(){
    }
	public WebStrVO(WebSpecialAreaStrategy webSpecialAreaStrategy, WebSpecialTimeStrategy webSpecialTimeStrategy,
			WebVIPStrategy webVIPStrategy) {
		this.setWebSpecialAreaStrategy(webSpecialAreaStrategy);
		this.setWebSpecialTimeStrategy(webSpecialTimeStrategy);
		this.setWebVIPStrategy(webVIPStrategy);
	}

	public WebSpecialAreaStrategy getWebSpecialAreaStrategy() {
		return webSpecialAreaStrategy;
	}

	public void setWebSpecialAreaStrategy(WebSpecialAreaStrategy webSpecialAreaStrategy) {
		this.webSpecialAreaStrategy = webSpecialAreaStrategy;
	}

	public WebSpecialTimeStrategy getWebSpecialTimeStrategy() {
		return webSpecialTimeStrategy;
	}

	public void setWebSpecialTimeStrategy(WebSpecialTimeStrategy webSpecialTimeStrategy) {
		this.webSpecialTimeStrategy = webSpecialTimeStrategy;
	}

	public WebVIPStrategy getWebVIPStrategy() {
		return webVIPStrategy;
	}

	public void setWebVIPStrategy(WebVIPStrategy webVIPStrategy) {
		this.webVIPStrategy = webVIPStrategy;
	}
}
