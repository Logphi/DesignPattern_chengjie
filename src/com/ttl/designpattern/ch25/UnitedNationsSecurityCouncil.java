package com.ttl.designpattern.ch25;

/**
 * @ClassName UnitedNationsSecurityCouncil
 * @Description TODO
 * @Author ttl
 * @Date 2020/7/2 15:16
 * Version 1.0
 **/
public class UnitedNationsSecurityCouncil extends UnitedNation {
    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    void declare(String message, Country country) {
        if (country == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }
}
