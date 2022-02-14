/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moi.sahlservices.resources;

/**
 *
 * @author MOI
 */
public class OptionControlModel {
   
    private String value="";
    private String textAr="";
    private String textEn="";

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the textAr
     */
    public String getTextAr() {
        return textAr;
    }

    /**
     * @param textAr the textAr to set
     */
    public void setTextAr(String textAr) {
        this.textAr = textAr;
    }

    /**
     * @return the textEn
     */
    public String getTextEn() {
        return textEn;
    }

    /**
     * @param textEn the textEn to set
     */
    public void setTextEn(String textEn) {
        this.textEn = textEn;
    }
    
}
