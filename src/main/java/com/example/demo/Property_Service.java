package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Property_Service
{
	@Autowired
    private JdbcTemplate jdbcTemplate;
 
    @Transactional(readOnly=true)
    public List<Property> findAll() {
        return jdbcTemplate.query("select * from add_property", 
                new PropertyRowMapper());
    }
 
    @Transactional(readOnly=true)
    public Property findUserById(int id) {
        return jdbcTemplate.queryForObject(
            "select * from add_property where property_id=?",
            new Object[]{id}, new PropertyRowMapper());
    }
 
    public Property create(final Property property) 
    {
        final String sql = "insert into add_property(apt,baths,bedrooms,zip,city,property_type,state,street_address) values(?,?,?,?,?,?,?,?)";
 
     
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				/* ps.setInt(1, property.getProperty_id()); */
                ps.setInt(1, property.getApt());
                ps.setInt(2, property.getBaths());
                ps.setInt(3, property.getBedrooms());
                ps.setInt(4, property.getZip());
                ps.setString(5, property.getCity());
                ps.setString(6, property.getProperty_type());
                ps.setString(7, property.getState());
                ps.setString(8, property.getStreet_address());
                
             
                return ps;
            }
        }, holder);
 
        int newPropertyId = holder.getKey().intValue();
        property.setProperty_id(newPropertyId);
        return property;
    }

}
