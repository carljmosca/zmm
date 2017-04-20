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
public class FramesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EventId")
    private int eventId;
    @Basic(optional = false)
    @Column(name = "FrameId")
    private int frameId;

    public FramesPK() {
    }

    public FramesPK(int eventId, int frameId) {
        this.eventId = eventId;
        this.frameId = frameId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getFrameId() {
        return frameId;
    }

    public void setFrameId(int frameId) {
        this.frameId = frameId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) eventId;
        hash += (int) frameId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FramesPK)) {
            return false;
        }
        FramesPK other = (FramesPK) object;
        if (this.eventId != other.eventId) {
            return false;
        }
        if (this.frameId != other.frameId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.FramesPK[ eventId=" + eventId + ", frameId=" + frameId + " ]";
    }
    
}
