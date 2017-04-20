/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.zmv.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moscac
 */
@Entity
@Table(name = "TriggersX10")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TriggersX10.findAll", query = "SELECT t FROM TriggersX10 t")
    , @NamedQuery(name = "TriggersX10.findByMonitorId", query = "SELECT t FROM TriggersX10 t WHERE t.monitorId = :monitorId")
    , @NamedQuery(name = "TriggersX10.findByActivation", query = "SELECT t FROM TriggersX10 t WHERE t.activation = :activation")
    , @NamedQuery(name = "TriggersX10.findByAlarmInput", query = "SELECT t FROM TriggersX10 t WHERE t.alarmInput = :alarmInput")
    , @NamedQuery(name = "TriggersX10.findByAlarmOutput", query = "SELECT t FROM TriggersX10 t WHERE t.alarmOutput = :alarmOutput")})
public class TriggersX10 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MonitorId")
    private Integer monitorId;
    @Column(name = "Activation")
    private String activation;
    @Column(name = "AlarmInput")
    private String alarmInput;
    @Column(name = "AlarmOutput")
    private String alarmOutput;

    public TriggersX10() {
    }

    public TriggersX10(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public Integer getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Integer monitorId) {
        this.monitorId = monitorId;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getAlarmInput() {
        return alarmInput;
    }

    public void setAlarmInput(String alarmInput) {
        this.alarmInput = alarmInput;
    }

    public String getAlarmOutput() {
        return alarmOutput;
    }

    public void setAlarmOutput(String alarmOutput) {
        this.alarmOutput = alarmOutput;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monitorId != null ? monitorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TriggersX10)) {
            return false;
        }
        TriggersX10 other = (TriggersX10) object;
        if ((this.monitorId == null && other.monitorId != null) || (this.monitorId != null && !this.monitorId.equals(other.monitorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.TriggersX10[ monitorId=" + monitorId + " ]";
    }
    
}
