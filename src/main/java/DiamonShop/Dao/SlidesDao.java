package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperSlides;
import DiamonShop.Entity.Slides;

@Repository
public class SlidesDao extends BaseDao{
	
	public List<Slides> GetDataSlides(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "SELECT * FROM slides ";
		list = _jdbcTemplate.query(sql, new MapperSlides());
//		for(Slides item : list) {
//			if (item.getCaption().length() > 3) {
//				// item.getCaption().toUpperCase();
//				// String toUpper = item.getCaption().toUpperCase();
//				item.setCaption(item.getCaption().toUpperCase());
//			}
//		}
		return list;
	}

}

