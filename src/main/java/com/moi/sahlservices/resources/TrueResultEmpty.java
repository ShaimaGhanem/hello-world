/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moi.sahlservices.resources;

import com.google.gson.annotations.Expose;
import java.util.List;

/**
 *
 * @author MOI
 */
public class TrueResultEmpty {
    
   @Expose (serialize = false, deserialize = true)
    private String nameAr = "";
   @Expose (serialize = false, deserialize = true)
    private String nameEn = "";
   @Expose (serialize = false, deserialize = true)
    private int stepNo;
   @Expose (serialize = false, deserialize = true)
    private String buttonLabelAr = "";
   @Expose (serialize = false, deserialize = true)
    private String buttonLabelEn = "";
   @Expose (serialize = false, deserialize = true)
    private List<ControlsModel> controlsModels = null;

    /**+
     * @return the nameAr
     */
    public String getNameAr() {
        return nameAr;
    }

    /**
     * @param nameAr the nameAr to set
     */
    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    /**
     * @return the nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * @param nameEn the nameEn to set
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    /**
     * @return the stepNo
     */
    public int getStepNo() {
        return stepNo;
    }

    /**
     * @param stepNo the stepNo to set
     */
    public void setStepNo(int stepNo) {
        this.stepNo = stepNo;
    }

    /**
     * @return the buttonLabelAr
     */
    public String getButtonLabelAr() {
        return buttonLabelAr;
    }

    /**
     * @param buttonLabelAr the buttonLabelAr to set
     */
    public void setButtonLabelAr(String buttonLabelAr) {
        this.buttonLabelAr = buttonLabelAr;
    }

    /**
     * @return the buttonLabelEn
     */
    public String getButtonLabelEn() {
        return buttonLabelEn;
    }

    /**
     * @param buttonLabelEn the buttonLabelEn to set
     */
    public void setButtonLabelEn(String buttonLabelEn) {
        this.buttonLabelEn = buttonLabelEn;
    }

    /**
     * @return the controlsModels
     */
    public List<ControlsModel> getControlsModels() {
        return controlsModels;
    }

    /**
     * @param controlsModels the controlsModels to set
     */
    public void setControlsModels(List<ControlsModel> controlsModels) {
        this.controlsModels = controlsModels;
    }

   
}
