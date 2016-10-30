package vo.webstrategyvo;

import java.util.Date;
import java.util.Map;

import common.Strategy;
import common.TradingArea;

/**
 * 网站所有的营销策略
 * 
 * @author CYF
 * @version
 */
public class WebStrVO {

	//商圈折扣映射
	private Map<TradingArea, Double> tradingAreaStrategy;
	//vip折扣映射
	private Map<Integer,Double> specialTimeStrategy;
	//日期
	private Date[] date;
	//时期折扣值
	private double discount;

	public WebStrVO() {
	}

	public Map<TradingArea, Double> getTradingAreaStrategy() {
		return tradingAreaStrategy;
	}

	public void setTradingAreaStrategy(Map<TradingArea, Double> tradingAreaStrategy) {
		this.tradingAreaStrategy = tradingAreaStrategy;
	}

	public Map<Integer, Double> getSpecialTimeStrategy() {
		return specialTimeStrategy;
	}

	public void setSpecialTimeStrategy(Map<Integer, Double> specialTimeStrategy) {
		this.specialTimeStrategy = specialTimeStrategy;
	}

	public Date[] getDate() {
		return date;
	}

	public void setDate(Date[] date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	

}
