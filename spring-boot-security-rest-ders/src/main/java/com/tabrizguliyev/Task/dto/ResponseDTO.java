/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabrizguliyev.Task.dto;

import lombok.Data;

/**
 *
 * @author sarkhanrasullu
 */
@Data
public class ResponseDTO {

    private String msg;
    private int errCode;
    private Object obj;

    public ResponseDTO(String msg, int errCode, Object obj) {
        this.msg = msg;
        this.errCode = errCode;
        this.obj = obj;
    }

    public ResponseDTO(Object obj) {
        this.obj = obj;
    }
    
    
}
