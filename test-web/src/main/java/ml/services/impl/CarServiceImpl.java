package ml.services.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import ml.model.Product;
import ml.model.User;
import ml.services.CarService;

@Component("carService")
public class CarServiceImpl implements CarService {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private TransactionTemplate transationTemplate;

	@Autowired
	@Qualifier("car")
	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public Product getProduct() {
		return product;
	}

	@Override
	public User getUserById(long id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String sql = "select * from User where id=?";
			ps = conn.prepareStatement(sql);
			ps.setObject(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				User model = new User();
				model.setId(rs.getLong(1));
				model.setUsername(rs.getString(2));
				model.setPassword(rs.getString(3));
				return model;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				disposeDBSource(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean insertUser(User user) {
		User userD = transationTemplate.execute(new TransactionCallback<User>() {
			@Override
			public User doInTransaction(TransactionStatus status) {
				System.out.println(user);
				return user;
			}
		});
		return userD.getId() > 0 ? true : false;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public TransactionTemplate getTransationTemplate() {
		return transationTemplate;
	}

	public void setTransationTemplate(TransactionTemplate transationTemplate) {
		this.transationTemplate = transationTemplate;
	}

	public void disposeDBSource(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				throw e;
			} finally {
				if (conn != null)
					conn.close();
				System.out.println("关闭数据源");
			}
		}
	}
}