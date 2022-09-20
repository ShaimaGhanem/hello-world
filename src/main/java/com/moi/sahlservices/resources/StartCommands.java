/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moi.sahlservices.resources;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StartCommands implements Runnable{
  private Active_Job activeJob;
  Runnable execute_command;

  public StartCommands(){
     activeJob = new Active_Job();
  }

  @Override
  public void run(){
    int jobId = 0;

    while(true){
      //access the db and get one row from the table by the status
      jobId = activeJob.get(Status.NEW);
      if (jobId > 0){
        activeJob.updateStatus(Status.INIT);
        execute_command = activeJob.getCommand();

        new Thread(execute_command).start();

        activeJob = new Active_Job();
        jobId = 0;
      }

        try {
            Thread.sleep(10*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StartCommands.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
  }
}