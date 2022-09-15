/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umrabulo10.api;

/**
 *
 * @author Paul
 */
public class Country {
    // id, name, nickname, capital city,  code, currency, and life expectancy
    private Integer id;
    private String name;
    private String nickname;
    private String capitalCity;
    private String code;
    private String currency;
    private Integer lifeExpectancy;

    public Country(Integer id, String name, String nickname, String capitalCity, String code, String currency, Integer lifeExpectancy) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.capitalCity = capitalCity;
        this.code = code;
        this.currency = currency;
        this.lifeExpectancy = lifeExpectancy;
    }

    public Country() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Integer lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }
    
}
