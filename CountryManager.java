package umrabulo10.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 class CountryManager implements CountryManagerInterface{
     private Connection connection;

    public CountryManager(String dbURL, String userName, String password) throws SQLException{
        connection = DriverManager.getConnection(dbURL, userName, password);
    }

    public CountryManager() {
        
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
     
    @Override
    public void addCountries(String sql) throws SQLException {
        PreparedStatement ps  = connection.prepareStatement(sql);
        Country country = new Country();
        ps.setInt(1, country.getId());
        ps.setString(2, country.getName());
        ps.setString(3, country.getNickname());
        ps.setString(4, country.getCode());
        ps.setString(5, country.getCurrency());
        ps.setInt(6, country.getLifeExpectancy());
        ps.executeUpdate();
    }

    @Override
    public Country getCountryWithLowExpec(String sql, Country country) throws SQLException {
        PreparedStatement ps  = connection.prepareStatement(sql);
        Country naga;
        String name,nkName,capCity,code,currncy;
        Integer id,lyfXpctncy;
        ps.setInt(1, country.getId());
        ps.setString(2, country.getName());
        ps.setString(3, country.getNickname());
        ps.setString(4, country.getCode());
        ps.setString(5, country.getCurrency());
        ps.setInt(6, country.getLifeExpectancy());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            id = rs.getInt("id");
            name = rs.getString("name");
            nkName = rs.getString("nickname");
            capCity = rs.getString("capitalcity");
            code = rs.getString("code");
            currncy = rs.getString("currency");
            lyfXpctncy = rs.getInt("lifeexpectancy");
            naga = new Country(id,name,nkName,capCity,code,currncy,lyfXpctncy);
            return naga;
        }
        else
            return null;
    }
}