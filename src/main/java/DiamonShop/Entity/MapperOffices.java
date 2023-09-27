package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperOffices implements RowMapper<Offices> {

	@Override
	public Offices mapRow(ResultSet rs, int rowNum) throws SQLException {
		Offices offices = new Offices();
		offices.setId(rs.getInt("id"));
		offices.setTenchi_nhanh(rs.getString("tenchi_nhanh"));
		offices.setDia_chi(rs.getString("dia_chi"));
		offices.setGio_mo(rs.getString("gio_mo"));
		offices.setGio_dong(rs.getString("gio_dong"));
		return offices;

	}
}
