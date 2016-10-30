package businesslogic.searchhotelbl;

import java.util.ArrayList;

import blservice.searchhotelblservice.SearchHotelBLService;
import common.HotelSortType;
import common.OrderState;
import vo.searchhotelvo.HotelListVO;

/**
 * SearchHotel模块的控制类
 * @author cy
 * @version 1.0
 * 
 */
public class SearchHotelController implements SearchHotelBLService{
     private SearchHotel searchHotel;//持有的credit的引用
     
     public SearchHotelController(){
    	 searchHotel=new SearchHotel();
    	 
     }
    
	@Override
	public ArrayList<HotelListVO> getHotelList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelListVO> getSortedHotelList(HotelSortType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelListVO> getBookedHotelList(HotelSortType type, OrderState orderState,String ID) {
		// TODO Auto-generated method stub
		return null;
	}

}
