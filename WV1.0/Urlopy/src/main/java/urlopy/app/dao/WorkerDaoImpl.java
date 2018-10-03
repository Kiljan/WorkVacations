package urlopy.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import urlopy.app.model.Worker;

@Repository
public class WorkerDaoImpl implements WorkerDao {

	@Autowired
	DataSource dataSource;
	
	@Override
	public List<Worker> selectAllWorkers() {
		
		String sql = "select id, Imię, Nazwisko, username, password, role, dniUrlopu, dniUrlopuTenRok, dniUrlopuLataWstecz from UsersWacation";
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		return jdbc.query(sql, new WorkerRowMapper());
	}

	@Override
	public Worker selectOne(String username) {
		String sql = "select id, Imię, Nazwisko, username, password, role, dniUrlopu, dniUrlopuTenRok, dniUrlopuLataWstecz from UsersWacation where username = ?";
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		return jdbc.queryForObject(sql, new WorkerRowMapper(), username);
	}

	@Override
	public void save(Worker worker) {
		String sql = "update UsersWacation set dniUrlopu = ? where username = ?";
		JdbcTemplate jdbc = new JdbcTemplate(dataSource);
		jdbc.update(sql, worker.getDniUrlopu(), worker.getUsername());
		
	}
	
	public static class WorkerRowMapper implements RowMapper<Worker>{

		@Override
		public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Worker(
					rs.getString("id"),
					rs.getString("Imię"),
					rs.getString("Nazwisko"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getString("role"),
					rs.getInt("dniUrlopu"),
					rs.getInt("dniUrlopuTenRok"),
					rs.getInt("dniUrlopuLataWstecz")
					);
		}
	}
}
