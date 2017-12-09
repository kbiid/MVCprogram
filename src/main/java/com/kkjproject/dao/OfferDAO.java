package com.kkjproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kkjproject.model.Offer;

@Repository
public class OfferDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from course";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	public Offer getOffer(int year) {
		String sqlStatement = "select * from course order by year ASC where year = ?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { year }, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();

				offer.setCoursecode(rs.getString("coursecode"));
				offer.setCoursename(rs.getString("coursename"));
				offer.setYear(rs.getInt("year"));
				offer.setCredit(rs.getInt("credit"));
				offer.setDivision(rs.getString("division"));
				offer.setSemester(rs.getInt("semester"));

				
				return offer;
			}
		});
	}
	
	public List<Offer> getOffers() {
		String sqlStatement = "select * from course order by year ASC" ;

		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();

				offer.setCoursecode(rs.getString("coursecode"));
				offer.setCoursename(rs.getString("coursename"));
				offer.setYear(rs.getInt("year"));
				offer.setCredit(rs.getInt("credit"));
				offer.setDivision(rs.getString("division"));
				offer.setSemester(rs.getInt("semester"));

				return offer;
			}
		});
	}
	
	public List<Offer> getYearOffers(int year) {
		String sqlStatement = "select * from course where year = ?";

		return jdbcTemplate.query(sqlStatement, new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {

				Offer offer = new Offer();

				offer.setCoursecode(rs.getString("coursecode"));
				offer.setCoursename(rs.getString("coursename"));
				offer.setYear(rs.getInt("year"));
				offer.setCredit(rs.getInt("credit"));
				offer.setDivision(rs.getString("division"));
				offer.setSemester(rs.getInt("semester"));

				return offer;
			}
		});
	}

	public boolean insert(Offer offer) {

		int year = offer.getYear();
		int semester = offer.getSemester();
		String coursecode = offer.getCoursecode();
		String coursename = offer.getCoursename();
		String division = offer.getDivision();
		int credit = offer.getCredit();

		String sqlStatement = "insert into course (year, semester, coursecode, coursename, division, credit) values (?, ?, ?, ?, ?, ?)";

		return (jdbcTemplate.update(sqlStatement,
				new Object[] { year, semester, coursecode, coursename, division, credit }) == 1);
	}
}
