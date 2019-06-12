package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PropertyRowMapper implements RowMapper<Property> 
{

	  @Override
	    public Property mapRow(ResultSet rs, int rowNum) throws SQLException {
	        Property property = new Property();
	        property.setProperty_id(rs.getInt("property_id"));
	        property.setApt(rs.getInt("apt"));
	        property.setBaths(rs.getInt("baths"));
	        property.setBedrooms(rs.getInt("bedrooms"));
	        property.setCity(rs.getString("city"));
	        property.setProperty_type(rs.getString("property_type"));
	        property.setState(rs.getString("state"));
	        property.setStreet_address(rs.getString("street_address"));
	        property.setZip(rs.getInt("zip"));
	       
	        return property;
	    }
}
