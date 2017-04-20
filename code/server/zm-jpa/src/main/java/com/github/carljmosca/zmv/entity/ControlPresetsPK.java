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
public class ControlPresetsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MonitorId")
    private int monitorId;
    @Basic(optional = false)
    @Column(name = "Preset")
    private int preset;

    public ControlPresetsPK() {
    }

    public ControlPresetsPK(int monitorId, int preset) {
        this.monitorId = monitorId;
        this.preset = preset;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
    }

    public int getPreset() {
        return preset;
    }

    public void setPreset(int preset) {
        this.preset = preset;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) monitorId;
        hash += (int) preset;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlPresetsPK)) {
            return false;
        }
        ControlPresetsPK other = (ControlPresetsPK) object;
        if (this.monitorId != other.monitorId) {
            return false;
        }
        if (this.preset != other.preset) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.ControlPresetsPK[ monitorId=" + monitorId + ", preset=" + preset + " ]";
    }
    
}
