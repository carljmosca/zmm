/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.zmv.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author moscac
 */
@Embeddable
public class EventsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Id")
    private int id;
    @Basic(optional = false)
    @Column(name = "MonitorId")
    private int monitorId;

    public EventsPK() {
    }

    public EventsPK(int id, int monitorId) {
        this.id = id;
        this.monitorId = monitorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) monitorId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventsPK)) {
            return false;
        }
        EventsPK other = (EventsPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.monitorId != other.monitorId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.EventsPK[ id=" + id + ", monitorId=" + monitorId + " ]";
    }
    
}
