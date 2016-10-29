package businesslogic.searchhotelbl;

import java.util.ArrayList;

import common.HotelSortType;
import common.OrderState;
import vo.searchhotelvo.HotelListVO;

public class SearchHotel {
	private ArrayList<HotelListVO> hotelList;
	public SearchHotel(){
		
	}
    public SearchHotel(ArrayList<HotelListVO> hotelList){
		this.hotelList=hotelList;
	}
	
	public ArrayList<HotelListVO> getHotelList() {
		
		return null;
	}

	
	public ArrayList<HotelListVO> getSortedHotelList(HotelSortType type) {
	
		return null;
	}

	
	public ArrayList<HotelListVO> getBookedHotelList(HotelSortType type, OrderState orderState) {
		
		return null;
	}	
}
