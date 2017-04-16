/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.zmv.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moscac
 */
@Entity
@Table(name = "ControlPresets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ControlPresets.findAll", query = "SELECT c FROM ControlPresets c")
    , @NamedQuery(name = "ControlPresets.findByMonitorId", query = "SELECT c FROM ControlPresets c WHERE c.controlPresetsPK.monitorId = :monitorId")
    , @NamedQuery(name = "ControlPresets.findByPreset", query = "SELECT c FROM ControlPresets c WHERE c.controlPresetsPK.preset = :preset")
    , @NamedQuery(name = "ControlPresets.findByLabel", query = "SELECT c FROM ControlPresets c WHERE c.label = :label")})
public class ControlPresets implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ControlPresetsPK controlPresetsPK;
    @Basic(optional = false)
    @Column(name = "Label")
    private String label;

    public ControlPresets() {
    }

    public ControlPresets(ControlPresetsPK controlPresetsPK) {
        this.controlPresetsPK = controlPresetsPK;
    }

    public ControlPresets(ControlPresetsPK controlPresetsPK, String label) {
        this.controlPresetsPK = controlPresetsPK;
        this.label = label;
    }

    public ControlPresets(int monitorId, int preset) {
        this.controlPresetsPK = new ControlPresetsPK(monitorId, preset);
    }

    public ControlPresetsPK getControlPresetsPK() {
        return controlPresetsPK;
    }

    public void setControlPresetsPK(ControlPresetsPK controlPresetsPK) {
        this.controlPresetsPK = controlPresetsPK;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlPresetsPK != null ? controlPresetsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlPresets)) {
            return false;
        }
        ControlPresets other = (ControlPresets) object;
        if ((this.controlPresetsPK == null && other.controlPresetsPK != null) || (this.controlPresetsPK != null && !this.controlPresetsPK.equals(other.controlPresetsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.ControlPresets[ controlPresetsPK=" + controlPresetsPK + " ]";
    }
    
}
