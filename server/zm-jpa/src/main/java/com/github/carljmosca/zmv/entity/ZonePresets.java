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
@Table(name = "ZonePresets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZonePresets.findAll", query = "SELECT z FROM ZonePresets z")
    , @NamedQuery(name = "ZonePresets.findById", query = "SELECT z FROM ZonePresets z WHERE z.id = :id")
    , @NamedQuery(name = "ZonePresets.findByName", query = "SELECT z FROM ZonePresets z WHERE z.name = :name")
    , @NamedQuery(name = "ZonePresets.findByType", query = "SELECT z FROM ZonePresets z WHERE z.type = :type")
    , @NamedQuery(name = "ZonePresets.findByUnits", query = "SELECT z FROM ZonePresets z WHERE z.units = :units")
    , @NamedQuery(name = "ZonePresets.findByCheckMethod", query = "SELECT z FROM ZonePresets z WHERE z.checkMethod = :checkMethod")
    , @NamedQuery(name = "ZonePresets.findByMinPixelThreshold", query = "SELECT z FROM ZonePresets z WHERE z.minPixelThreshold = :minPixelThreshold")
    , @NamedQuery(name = "ZonePresets.findByMaxPixelThreshold", query = "SELECT z FROM ZonePresets z WHERE z.maxPixelThreshold = :maxPixelThreshold")
    , @NamedQuery(name = "ZonePresets.findByMinAlarmPixels", query = "SELECT z FROM ZonePresets z WHERE z.minAlarmPixels = :minAlarmPixels")
    , @NamedQuery(name = "ZonePresets.findByMaxAlarmPixels", query = "SELECT z FROM ZonePresets z WHERE z.maxAlarmPixels = :maxAlarmPixels")
    , @NamedQuery(name = "ZonePresets.findByFilterX", query = "SELECT z FROM ZonePresets z WHERE z.filterX = :filterX")
    , @NamedQuery(name = "ZonePresets.findByFilterY", query = "SELECT z FROM ZonePresets z WHERE z.filterY = :filterY")
    , @NamedQuery(name = "ZonePresets.findByMinFilterPixels", query = "SELECT z FROM ZonePresets z WHERE z.minFilterPixels = :minFilterPixels")
    , @NamedQuery(name = "ZonePresets.findByMaxFilterPixels", query = "SELECT z FROM ZonePresets z WHERE z.maxFilterPixels = :maxFilterPixels")
    , @NamedQuery(name = "ZonePresets.findByMinBlobPixels", query = "SELECT z FROM ZonePresets z WHERE z.minBlobPixels = :minBlobPixels")
    , @NamedQuery(name = "ZonePresets.findByMaxBlobPixels", query = "SELECT z FROM ZonePresets z WHERE z.maxBlobPixels = :maxBlobPixels")
    , @NamedQuery(name = "ZonePresets.findByMinBlobs", query = "SELECT z FROM ZonePresets z WHERE z.minBlobs = :minBlobs")
    , @NamedQuery(name = "ZonePresets.findByMaxBlobs", query = "SELECT z FROM ZonePresets z WHERE z.maxBlobs = :maxBlobs")
    , @NamedQuery(name = "ZonePresets.findByOverloadFrames", query = "SELECT z FROM ZonePresets z WHERE z.overloadFrames = :overloadFrames")})
public class ZonePresets implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "Units")
    private String units;
    @Basic(optional = false)
    @Column(name = "CheckMethod")
    private String checkMethod;
    @Column(name = "MinPixelThreshold")
    private Short minPixelThreshold;
    @Column(name = "MaxPixelThreshold")
    private Short maxPixelThreshold;
    @Column(name = "MinAlarmPixels")
    private Integer minAlarmPixels;
    @Column(name = "MaxAlarmPixels")
    private Integer maxAlarmPixels;
    @Column(name = "FilterX")
    private Short filterX;
    @Column(name = "FilterY")
    private Short filterY;
    @Column(name = "MinFilterPixels")
    private Integer minFilterPixels;
    @Column(name = "MaxFilterPixels")
    private Integer maxFilterPixels;
    @Column(name = "MinBlobPixels")
    private Integer minBlobPixels;
    @Column(name = "MaxBlobPixels")
    private Integer maxBlobPixels;
    @Column(name = "MinBlobs")
    private Short minBlobs;
    @Column(name = "MaxBlobs")
    private Short maxBlobs;
    @Basic(optional = false)
    @Column(name = "OverloadFrames")
    private short overloadFrames;

    public ZonePresets() {
    }

    public ZonePresets(Integer id) {
        this.id = id;
    }

    public ZonePresets(Integer id, String name, String type, String units, String checkMethod, short overloadFrames) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.units = units;
        this.checkMethod = checkMethod;
        this.overloadFrames = overloadFrames;
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

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod;
    }

    public Short getMinPixelThreshold() {
        return minPixelThreshold;
    }

    public void setMinPixelThreshold(Short minPixelThreshold) {
        this.minPixelThreshold = minPixelThreshold;
    }

    public Short getMaxPixelThreshold() {
        return maxPixelThreshold;
    }

    public void setMaxPixelThreshold(Short maxPixelThreshold) {
        this.maxPixelThreshold = maxPixelThreshold;
    }

    public Integer getMinAlarmPixels() {
        return minAlarmPixels;
    }

    public void setMinAlarmPixels(Integer minAlarmPixels) {
        this.minAlarmPixels = minAlarmPixels;
    }

    public Integer getMaxAlarmPixels() {
        return maxAlarmPixels;
    }

    public void setMaxAlarmPixels(Integer maxAlarmPixels) {
        this.maxAlarmPixels = maxAlarmPixels;
    }

    public Short getFilterX() {
        return filterX;
    }

    public void setFilterX(Short filterX) {
        this.filterX = filterX;
    }

    public Short getFilterY() {
        return filterY;
    }

    public void setFilterY(Short filterY) {
        this.filterY = filterY;
    }

    public Integer getMinFilterPixels() {
        return minFilterPixels;
    }

    public void setMinFilterPixels(Integer minFilterPixels) {
        this.minFilterPixels = minFilterPixels;
    }

    public Integer getMaxFilterPixels() {
        return maxFilterPixels;
    }

    public void setMaxFilterPixels(Integer maxFilterPixels) {
        this.maxFilterPixels = maxFilterPixels;
    }

    public Integer getMinBlobPixels() {
        return minBlobPixels;
    }

    public void setMinBlobPixels(Integer minBlobPixels) {
        this.minBlobPixels = minBlobPixels;
    }

    public Integer getMaxBlobPixels() {
        return maxBlobPixels;
    }

    public void setMaxBlobPixels(Integer maxBlobPixels) {
        this.maxBlobPixels = maxBlobPixels;
    }

    public Short getMinBlobs() {
        return minBlobs;
    }

    public void setMinBlobs(Short minBlobs) {
        this.minBlobs = minBlobs;
    }

    public Short getMaxBlobs() {
        return maxBlobs;
    }

    public void setMaxBlobs(Short maxBlobs) {
        this.maxBlobs = maxBlobs;
    }

    public short getOverloadFrames() {
        return overloadFrames;
    }

    public void setOverloadFrames(short overloadFrames) {
        this.overloadFrames = overloadFrames;
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
        if (!(object instanceof ZonePresets)) {
            return false;
        }
        ZonePresets other = (ZonePresets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.ZonePresets[ id=" + id + " ]";
    }
    
}
