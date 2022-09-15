/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umrabulo10.api;

import java.sql.SQLException;

/**
 *
 * @author Paul
 */
public interface CountryManagerInterface {
    public void addCountries(String sql) throws SQLException;
    public Country getCountryWithLowExpec(String sql,Country country) throws SQLException;
}
