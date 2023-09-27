package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlides implements RowMapper<Slides>{

	@Override
	public Slides mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slides slides = new Slides();
		slides.setId(rs.getInt("id"));
//		String caption = rs.getString("caption").length() > 3 ? rs.getString("caption").toUpperCase() : rs.getString("caption");
//		if (rs.getString("caption").length() > 3) {
//			caption = rs.getString("caption").toUpperCase();
//		}
		String caption = rs.getString("caption");
		slides.setCaption(caption);
		slides.setContent(rs.getString("content"));
		slides.setImg(rs.getString("img"));
		
		return slides;
	}

}
