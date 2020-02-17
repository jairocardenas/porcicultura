/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ustatunja.controller;

import com.ustatunja.utility.RaisePig;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author camol
 */
public class PigController {

    private TimerTask objTask;
    private Timer objTimer;
    private RaisePig objRaisePig;

    public PigController() {
        objRaisePig = new RaisePig();
        objTimer = new Timer(true);
        objTask = new RaisePig();
    }

    public PigController(TimerTask objTask, Timer objTimer, RaisePig objrRaisePig) {
        this.objTask = objTask;
        this.objTimer = objTimer;
        this.objRaisePig = objrRaisePig;
    }

}
