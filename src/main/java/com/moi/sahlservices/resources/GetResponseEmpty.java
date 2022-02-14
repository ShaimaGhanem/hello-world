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
public class GetResponseEmpty {
     private boolean IsSuccess = true;
    private String Message = "";
     private String MessageEn = "";
     private String AlertType = "";
    private TrueResultEmpty Result = null;

    /**
     * @return the IsSuccess
     */
    public boolean isIsSuccess() {
        return IsSuccess;
    }

    /**
     * @param IsSuccess the IsSuccess to set
     */
    public void setIsSuccess(boolean IsSuccess) {
        this.IsSuccess = IsSuccess;
    }

    /**
     * @return the Message
     */
    public String getMessage() {
        return Message;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

  

    /**
     * @return the MessageEn
     */
    
    public String getMessageEn() {
        return MessageEn;
    }

    /**
     * @param MessageEn the MessageEn to set
     */
    public void setMessageEn(String MessageEn) {
        this.MessageEn = MessageEn;
    }

    /**
     * @return the AlertType
     */
    public String getAlertType() {
        return AlertType;
    }

    /**
     * @param AlertType the AlertType to set
     */
    public void setAlertType(String AlertType) {
        this.AlertType = AlertType;
    }

    /**
     * @return the ResultEmpty
     */
    public TrueResultEmpty getResultEmpty() {
        return Result;
    }

    /**
     * @param ResultEmpty the ResultEmpty to set
     */
    public void setResultEmpty(TrueResultEmpty ResultEmpty) {
        this.Result = ResultEmpty;
    }

  
    
}
