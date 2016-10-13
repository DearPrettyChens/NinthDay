package po;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;

import javax.swing.ImageIcon;

/**
 * 酒店基本信息
 * 
 * @author CYF
 * @version 1.0
 */
public class HotelBasicInfoPO implements Serializable {
	// 酒店id
	private String hotelID;
	// 酒店名
	private String name;
	//酒店图片
	private ImageIcon hotelImage;
	// 地址
	private String address;
	// 联系方式
	private String telephone;
	// 星级
	private int star;
	// 评分
	private double score;
	// 最低价格
	private double lowestPrice;
	// 预定记录？
	// private String reserveRecords;
	// 酒店简介
	private String introduce;
	// 通用设施
	private String commonFacility;
	// 活动设施
	private String activityFacility;
	// 服务项目
	private String service;
	// 客房设施
	private String roomFacility;
	// 住户点评
	private List<RemarkPO> remarks;

	public HotelBasicInfoPO(String hotelID, String name, ImageIcon hotelImage,String address, String telephone, int star, double score,
			double lowestPrice, String introduce, String commonFacility, String activityFacility, String service,
			String roomFacility, List remarks) {
		this.setHotelID(hotelID);
		this.setName(name);
		this.setAddress(address);
		this.setTelephone(telephone);
		this.setStar(star);
		this.setScore(score);
		this.setLowestPrice(lowestPrice);
		this.setIntroduce(introduce);
		this.setCommonFacility(commonFacility);
		this.setActivityFacility(activityFacility);
		this.setService(service);
		this.setRoomFacility(roomFacility);
		this.setRemarks(remarks);

	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public double getLowestPrice() {
		return lowestPrice;
	}

	public void setLowestPrice(double lowestPrice) {
		this.lowestPrice = lowestPrice;
	}

	public List<RemarkPO> getRemarks() {
		return remarks;
	}

	public void setRemarks(List<RemarkPO> remarks) {
		this.remarks = remarks;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getCommonFacility() {
		return commonFacility;
	}

	public void setCommonFacility(String commonFacility) {
		this.commonFacility = commonFacility;
	}

	public String getActivityFacility() {
		return activityFacility;
	}

	public void setActivityFacility(String activityFacility) {
		this.activityFacility = activityFacility;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getRoomFacility() {
		return roomFacility;
	}

	public void setRoomFacility(String roomFacility) {
		this.roomFacility = roomFacility;
	}

	public ImageIcon getHotelImage() {
		return hotelImage;
	}

	public void setHotelImage(ImageIcon hotelImage) {
		this.hotelImage = hotelImage;
	}

}
