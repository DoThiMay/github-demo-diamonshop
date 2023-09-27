package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Offices;
import DiamonShop.Entity.MapperOffices;

@Repository
public class OfficesDao extends BaseDao {

	public List<Offices> GetDataOffices() {
		List<Offices> list = new ArrayList<Offices>();
		String sql = "SELECT * FROM office ";
		list = _jdbcTemplate.query(sql, new MapperOffices());
		return list;

	}
}
