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
@Table(name = "Zones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zones.findAll", query = "SELECT z FROM Zones z")
    , @NamedQuery(name = "Zones.findById", query = "SELECT z FROM Zones z WHERE z.id = :id")
    , @NamedQuery(name = "Zones.findByMonitorId", query = "SELECT z FROM Zones z WHERE z.monitorId = :monitorId")
    , @NamedQuery(name = "Zones.findByName", query = "SELECT z FROM Zones z WHERE z.name = :name")
    , @NamedQuery(name = "Zones.findByType", query = "SELECT z FROM Zones z WHERE z.type = :type")
    , @NamedQuery(name = "Zones.findByUnits", query = "SELECT z FROM Zones z WHERE z.units = :units")
    , @NamedQuery(name = "Zones.findByNumCoords", query = "SELECT z FROM Zones z WHERE z.numCoords = :numCoords")
    , @NamedQuery(name = "Zones.findByCoords", query = "SELECT z FROM Zones z WHERE z.coords = :coords")
    , @NamedQuery(name = "Zones.findByArea", query = "SELECT z FROM Zones z WHERE z.area = :area")
    , @NamedQuery(name = "Zones.findByAlarmRGB", query = "SELECT z FROM Zones z WHERE z.alarmRGB = :alarmRGB")
    , @NamedQuery(name = "Zones.findByCheckMethod", query = "SELECT z FROM Zones z WHERE z.checkMethod = :checkMethod")
    , @NamedQuery(name = "Zones.findByMinPixelThreshold", query = "SELECT z FROM Zones z WHERE z.minPixelThreshold = :minPixelThreshold")
    , @NamedQuery(name = "Zones.findByMaxPixelThreshold", query = "SELECT z FROM Zones z WHERE z.maxPixelThreshold = :maxPixelThreshold")
    , @NamedQuery(name = "Zones.findByMinAlarmPixels", query = "SELECT z FROM Zones z WHERE z.minAlarmPixels = :minAlarmPixels")
    , @NamedQuery(name = "Zones.findByMaxAlarmPixels", query = "SELECT z FROM Zones z WHERE z.maxAlarmPixels = :maxAlarmPixels")
    , @NamedQuery(name = "Zones.findByFilterX", query = "SELECT z FROM Zones z WHERE z.filterX = :filterX")
    , @NamedQuery(name = "Zones.findByFilterY", query = "SELECT z FROM Zones z WHERE z.filterY = :filterY")
    , @NamedQuery(name = "Zones.findByMinFilterPixels", query = "SELECT z FROM Zones z WHERE z.minFilterPixels = :minFilterPixels")
    , @NamedQuery(name = "Zones.findByMaxFilterPixels", query = "SELECT z FROM Zones z WHERE z.maxFilterPixels = :maxFilterPixels")
    , @NamedQuery(name = "Zones.findByMinBlobPixels", query = "SELECT z FROM Zones z WHERE z.minBlobPixels = :minBlobPixels")
    , @NamedQuery(name = "Zones.findByMaxBlobPixels", query = "SELECT z FROM Zones z WHERE z.maxBlobPixels = :maxBlobPixels")
    , @NamedQuery(name = "Zones.findByMinBlobs", query = "SELECT z FROM Zones z WHERE z.minBlobs = :minBlobs")
    , @NamedQuery(name = "Zones.findByMaxBlobs", query = "SELECT z FROM Zones z WHERE z.maxBlobs = :maxBlobs")
    , @NamedQuery(name = "Zones.findByOverloadFrames", query = "SELECT z FROM Zones z WHERE z.overloadFrames = :overloadFrames")})
public class Zones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "MonitorId")
    private int monitorId;
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
    @Column(name = "NumCoords")
    private short numCoords;
    @Basic(optional = false)
    @Column(name = "Coords")
    private String coords;
    @Basic(optional = false)
    @Column(name = "Area")
    private int area;
    @Column(name = "AlarmRGB")
    private Integer alarmRGB;
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

    public Zones() {
    }

    public Zones(Integer id) {
        this.id = id;
    }

    public Zones(Integer id, int monitorId, String name, String type, String units, short numCoords, String coords, int area, String checkMethod, short overloadFrames) {
        this.id = id;
        this.monitorId = monitorId;
        this.name = name;
        this.type = type;
        this.units = units;
        this.numCoords = numCoords;
        this.coords = coords;
        this.area = area;
        this.checkMethod = checkMethod;
        this.overloadFrames = overloadFrames;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(int monitorId) {
        this.monitorId = monitorId;
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

    public short getNumCoords() {
        return numCoords;
    }

    public void setNumCoords(short numCoords) {
        this.numCoords = numCoords;
    }

    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public Integer getAlarmRGB() {
        return alarmRGB;
    }

    public void setAlarmRGB(Integer alarmRGB) {
        this.alarmRGB = alarmRGB;
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
        if (!(object instanceof Zones)) {
            return false;
        }
        Zones other = (Zones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Zones[ id=" + id + " ]";
    }
    
}
