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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "Users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findById", query = "SELECT u FROM Users u WHERE u.id = :id")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByLanguage", query = "SELECT u FROM Users u WHERE u.language = :language")
    , @NamedQuery(name = "Users.findByEnabled", query = "SELECT u FROM Users u WHERE u.enabled = :enabled")
    , @NamedQuery(name = "Users.findByStream", query = "SELECT u FROM Users u WHERE u.stream = :stream")
    , @NamedQuery(name = "Users.findByEvents", query = "SELECT u FROM Users u WHERE u.events = :events")
    , @NamedQuery(name = "Users.findByControl", query = "SELECT u FROM Users u WHERE u.control = :control")
    , @NamedQuery(name = "Users.findByMonitors", query = "SELECT u FROM Users u WHERE u.monitors = :monitors")
    , @NamedQuery(name = "Users.findByDevices", query = "SELECT u FROM Users u WHERE u.devices = :devices")
    , @NamedQuery(name = "Users.findBySystem", query = "SELECT u FROM Users u WHERE u.system = :system")
    , @NamedQuery(name = "Users.findByMaxBandwidth", query = "SELECT u FROM Users u WHERE u.maxBandwidth = :maxBandwidth")
    , @NamedQuery(name = "Users.findByMonitorIds", query = "SELECT u FROM Users u WHERE u.monitorIds = :monitorIds")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "Language")
    private String language;
    @Basic(optional = false)
    @Column(name = "Enabled")
    private short enabled;
    @Basic(optional = false)
    @Column(name = "Stream")
    private String stream;
    @Basic(optional = false)
    @Column(name = "Events")
    private String events;
    @Basic(optional = false)
    @Column(name = "Control")
    private String control;
    @Basic(optional = false)
    @Column(name = "Monitors")
    private String monitors;
    @Basic(optional = false)
    @Column(name = "Devices")
    private String devices;
    @Basic(optional = false)
    @Column(name = "System")
    private String system;
    @Basic(optional = false)
    @Column(name = "MaxBandwidth")
    private String maxBandwidth;
    @Basic(optional = false)
    @Column(name = "MonitorIds")
    private String monitorIds;

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(Integer id, String username, String password, String language, short enabled, String stream, String events, String control, String monitors, String devices, String system, String maxBandwidth, String monitorIds) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.language = language;
        this.enabled = enabled;
        this.stream = stream;
        this.events = events;
        this.control = control;
        this.monitors = monitors;
        this.devices = devices;
        this.system = system;
        this.maxBandwidth = maxBandwidth;
        this.monitorIds = monitorIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getMonitors() {
        return monitors;
    }

    public void setMonitors(String monitors) {
        this.monitors = monitors;
    }

    public String getDevices() {
        return devices;
    }

    public void setDevices(String devices) {
        this.devices = devices;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(String maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public String getMonitorIds() {
        return monitorIds;
    }

    public void setMonitorIds(String monitorIds) {
        this.monitorIds = monitorIds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Users[ id=" + id + " ]";
    }
    
}
