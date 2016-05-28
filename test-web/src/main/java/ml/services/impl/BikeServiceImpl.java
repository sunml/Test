package ml.services.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import ml.model.Product;
import ml.model.User;
import ml.services.BikeService;

@Component("bikeService")
public class BikeServiceImpl implements BikeService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("bike")
	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public Product getProduct() {
		return product;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User getUserById(long id) {
		String sql = "select * from User where id=?";
		RowMapper<User> rowMapper = new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getLong(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;
			}
		};
		User user = jdbcTemplate.queryForObject(sql, rowMapper, id);
		return user;
	}

}
