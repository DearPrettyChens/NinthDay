package common;

import java.util.Map;

/**
 * 网站特定商圈优惠策略
 * @author CLL
 *
 */
public class WebSpecialAreaStrategy extends Strategy {
	private Map<TradingArea,Double> allDiscount;
	/**
	 * 初始化该商圈的折扣值
	 * @param specialArea
	 * @param discount
	 */
	public WebSpecialAreaStrategy(TradingArea specialArea,double discount){
		allDiscount.put(specialArea, discount);
	}
	/**
	 * 返回该商圈的折扣值
	 * @param specialArea
	 * @return double
	 */
	public double getDiscount(TradingArea specialArea) {
		return allDiscount.get(specialArea);
	}
	/**
	 * 重新设置该商圈的折扣值
	 * @param specialArea
	 * @param discount
	 */
	public void setDiscount(TradingArea specialArea,double discount) {
		allDiscount.remove(specialArea);
		allDiscount.put(specialArea, discount);
	}
	/**
	 * 返回所有商圈及其折扣值
	 * @return Map<TradingArea,Double>
	 */
	public Map<TradingArea,Double> getAllDiscount(){
		return allDiscount;
	}
}
