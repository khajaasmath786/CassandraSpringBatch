/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vz.ids.solutions;

/**
 *
 * @author v086714
 */
public class IdsException extends Exception {
    public IdsException(String msg) {
        super(msg);
    }
    public IdsException(String msg, Throwable t) {
        super(msg, t);
    }
}
