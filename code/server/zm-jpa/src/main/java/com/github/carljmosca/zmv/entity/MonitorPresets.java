/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.zmv.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "MonitorPresets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MonitorPresets.findAll", query = "SELECT m FROM MonitorPresets m")
    , @NamedQuery(name = "MonitorPresets.findById", query = "SELECT m FROM MonitorPresets m WHERE m.id = :id")
    , @NamedQuery(name = "MonitorPresets.findByName", query = "SELECT m FROM MonitorPresets m WHERE m.name = :name")
    , @NamedQuery(name = "MonitorPresets.findByType", query = "SELECT m FROM MonitorPresets m WHERE m.type = :type")
    , @NamedQuery(name = "MonitorPresets.findByDevice", query = "SELECT m FROM MonitorPresets m WHERE m.device = :device")
    , @NamedQuery(name = "MonitorPresets.findByChannel", query = "SELECT m FROM MonitorPresets m WHERE m.channel = :channel")
    , @NamedQuery(name = "MonitorPresets.findByFormat", query = "SELECT m FROM MonitorPresets m WHERE m.format = :format")
    , @NamedQuery(name = "MonitorPresets.findByProtocol", query = "SELECT m FROM MonitorPresets m WHERE m.protocol = :protocol")
    , @NamedQuery(name = "MonitorPresets.findByMethod", query = "SELECT m FROM MonitorPresets m WHERE m.method = :method")
    , @NamedQuery(name = "MonitorPresets.findByHost", query = "SELECT m FROM MonitorPresets m WHERE m.host = :host")
    , @NamedQuery(name = "MonitorPresets.findByPort", query = "SELECT m FROM MonitorPresets m WHERE m.port = :port")
    , @NamedQuery(name = "MonitorPresets.findByPath", query = "SELECT m FROM MonitorPresets m WHERE m.path = :path")
    , @NamedQuery(name = "MonitorPresets.findBySubPath", query = "SELECT m FROM MonitorPresets m WHERE m.subPath = :subPath")
    , @NamedQuery(name = "MonitorPresets.findByWidth", query = "SELECT m FROM MonitorPresets m WHERE m.width = :width")
    , @NamedQuery(name = "MonitorPresets.findByHeight", query = "SELECT m FROM MonitorPresets m WHERE m.height = :height")
    , @NamedQuery(name = "MonitorPresets.findByPalette", query = "SELECT m FROM MonitorPresets m WHERE m.palette = :palette")
    , @NamedQuery(name = "MonitorPresets.findByMaxFPS", query = "SELECT m FROM MonitorPresets m WHERE m.maxFPS = :maxFPS")
    , @NamedQuery(name = "MonitorPresets.findByControllable", query = "SELECT m FROM MonitorPresets m WHERE m.controllable = :controllable")
    , @NamedQuery(name = "MonitorPresets.findByControlId", query = "SELECT m FROM MonitorPresets m WHERE m.controlId = :controlId")
    , @NamedQuery(name = "MonitorPresets.findByControlDevice", query = "SELECT m FROM MonitorPresets m WHERE m.controlDevice = :controlDevice")
    , @NamedQuery(name = "MonitorPresets.findByControlAddress", query = "SELECT m FROM MonitorPresets m WHERE m.controlAddress = :controlAddress")
    , @NamedQuery(name = "MonitorPresets.findByDefaultRate", query = "SELECT m FROM MonitorPresets m WHERE m.defaultRate = :defaultRate")
    , @NamedQuery(name = "MonitorPresets.findByDefaultScale", query = "SELECT m FROM MonitorPresets m WHERE m.defaultScale = :defaultScale")})
public class MonitorPresets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Column(name = "Device")
    private String device;
    @Column(name = "Channel")
    private String channel;
    @Column(name = "Format")
    private Integer format;
    @Column(name = "Protocol")
    private String protocol;
    @Column(name = "Method")
    private String method;
    @Column(name = "Host")
    private String host;
    @Column(name = "Port")
    private String port;
    @Column(name = "Path")
    private String path;
    @Column(name = "SubPath")
    private String subPath;
    @Column(name = "Width")
    private Short width;
    @Column(name = "Height")
    private Short height;
    @Column(name = "Palette")
    private Integer palette;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MaxFPS")
    private BigDecimal maxFPS;
    @Basic(optional = false)
    @Column(name = "Controllable")
    private short controllable;
    @Column(name = "ControlId")
    private String controlId;
    @Column(name = "ControlDevice")
    private String controlDevice;
    @Column(name = "ControlAddress")
    private String controlAddress;
    @Basic(optional = false)
    @Column(name = "DefaultRate")
    private short defaultRate;
    @Basic(optional = false)
    @Column(name = "DefaultScale")
    private short defaultScale;

    public MonitorPresets() {
    }

    public MonitorPresets(Integer id) {
        this.id = id;
    }

    public MonitorPresets(Integer id, String name, String type, short controllable, short defaultRate, short defaultScale) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.controllable = controllable;
        this.defaultRate = defaultRate;
        this.defaultScale = defaultScale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getFormat() {
        return format;
    }

    public void setFormat(Integer format) {
        this.format = format;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Integer getPalette() {
        return palette;
    }

    public void setPalette(Integer palette) {
        this.palette = palette;
    }

    public BigDecimal getMaxFPS() {
        return maxFPS;
    }

    public void setMaxFPS(BigDecimal maxFPS) {
        this.maxFPS = maxFPS;
    }

    public short getControllable() {
        return controllable;
    }

    public void setControllable(short controllable) {
        this.controllable = controllable;
    }

    public String getControlId() {
        return controlId;
    }

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    public String getControlDevice() {
        return controlDevice;
    }

    public void setControlDevice(String controlDevice) {
        this.controlDevice = controlDevice;
    }

    public String getControlAddress() {
        return controlAddress;
    }

    public void setControlAddress(String controlAddress) {
        this.controlAddress = controlAddress;
    }

    public short getDefaultRate() {
        return defaultRate;
    }

    public void setDefaultRate(short defaultRate) {
        this.defaultRate = defaultRate;
    }

    public short getDefaultScale() {
        return defaultScale;
    }

    public void setDefaultScale(short defaultScale) {
        this.defaultScale = defaultScale;
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
        if (!(object instanceof MonitorPresets)) {
            return false;
        }
        MonitorPresets other = (MonitorPresets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.MonitorPresets[ id=" + id + " ]";
    }
    
}
