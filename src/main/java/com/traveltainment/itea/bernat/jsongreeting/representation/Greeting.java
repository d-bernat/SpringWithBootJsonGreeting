/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.traveltainment.itea.bernat.jsongreeting.representation;

/**
 *
 * @author Bernat
 */
public class Greeting {
    private final Long id;
    private final String content;

    public Greeting(final Long id, final String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    
    
    
}
