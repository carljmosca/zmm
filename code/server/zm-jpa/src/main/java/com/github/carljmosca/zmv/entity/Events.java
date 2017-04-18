/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.carljmosca.zmv.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moscac
 */
@Entity
@Table(name = "Events")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Events.findAll", query = "SELECT e FROM Events e")
    , @NamedQuery(name = "Events.findById", query = "SELECT e FROM Events e WHERE e.eventsPK.id = :id")
    , @NamedQuery(name = "Events.findByMonitorId", query = "SELECT e FROM Events e WHERE e.eventsPK.monitorId = :monitorId")
    , @NamedQuery(name = "Events.findByName", query = "SELECT e FROM Events e WHERE e.name = :name")
    , @NamedQuery(name = "Events.findByCause", query = "SELECT e FROM Events e WHERE e.cause = :cause")
    , @NamedQuery(name = "Events.findByStartTime", query = "SELECT e FROM Events e WHERE e.startTime = :startTime")
    , @NamedQuery(name = "Events.findByEndTime", query = "SELECT e FROM Events e WHERE e.endTime = :endTime")
    , @NamedQuery(name = "Events.findByWidth", query = "SELECT e FROM Events e WHERE e.width = :width")
    , @NamedQuery(name = "Events.findByHeight", query = "SELECT e FROM Events e WHERE e.height = :height")
    , @NamedQuery(name = "Events.findByLength", query = "SELECT e FROM Events e WHERE e.length = :length")
    , @NamedQuery(name = "Events.findByFrames", query = "SELECT e FROM Events e WHERE e.frames = :frames")
    , @NamedQuery(name = "Events.findByAlarmFrames", query = "SELECT e FROM Events e WHERE e.alarmFrames = :alarmFrames")
    , @NamedQuery(name = "Events.findByTotScore", query = "SELECT e FROM Events e WHERE e.totScore = :totScore")
    , @NamedQuery(name = "Events.findByAvgScore", query = "SELECT e FROM Events e WHERE e.avgScore = :avgScore")
    , @NamedQuery(name = "Events.findByMaxScore", query = "SELECT e FROM Events e WHERE e.maxScore = :maxScore")
    , @NamedQuery(name = "Events.findByArchived", query = "SELECT e FROM Events e WHERE e.archived = :archived")
    , @NamedQuery(name = "Events.findByVideoed", query = "SELECT e FROM Events e WHERE e.videoed = :videoed")
    , @NamedQuery(name = "Events.findByUploaded", query = "SELECT e FROM Events e WHERE e.uploaded = :uploaded")
    , @NamedQuery(name = "Events.findByEmailed", query = "SELECT e FROM Events e WHERE e.emailed = :emailed")
    , @NamedQuery(name = "Events.findByMessaged", query = "SELECT e FROM Events e WHERE e.messaged = :messaged")
    , @NamedQuery(name = "Events.findByExecuted", query = "SELECT e FROM Events e WHERE e.executed = :executed")})
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EventsPK eventsPK;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Cause")
    private String cause;
    @Column(name = "StartTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Column(name = "EndTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Basic(optional = false)
    @Column(name = "Width")
    private short width;
    @Basic(optional = false)
    @Column(name = "Height")
    private short height;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Length")
    private BigDecimal length;
    @Column(name = "Frames")
    private Integer frames;
    @Column(name = "AlarmFrames")
    private Integer alarmFrames;
    @Basic(optional = false)
    @Column(name = "TotScore")
    private int totScore;
    @Column(name = "AvgScore")
    private Short avgScore;
    @Column(name = "MaxScore")
    private Short maxScore;
    @Basic(optional = false)
    @Column(name = "Archived")
    private short archived;
    @Basic(optional = false)
    @Column(name = "Videoed")
    private short videoed;
    @Basic(optional = false)
    @Column(name = "Uploaded")
    private short uploaded;
    @Basic(optional = false)
    @Column(name = "Emailed")
    private short emailed;
    @Basic(optional = false)
    @Column(name = "Messaged")
    private short messaged;
    @Basic(optional = false)
    @Column(name = "Executed")
    private short executed;
    @Lob
    @Column(name = "Notes")
    private String notes;

    public Events() {
    }

    public Events(EventsPK eventsPK) {
        this.eventsPK = eventsPK;
    }

    public Events(EventsPK eventsPK, String name, String cause, short width, short height, BigDecimal length, int totScore, short archived, short videoed, short uploaded, short emailed, short messaged, short executed) {
        this.eventsPK = eventsPK;
        this.name = name;
        this.cause = cause;
        this.width = width;
        this.height = height;
        this.length = length;
        this.totScore = totScore;
        this.archived = archived;
        this.videoed = videoed;
        this.uploaded = uploaded;
        this.emailed = emailed;
        this.messaged = messaged;
        this.executed = executed;
    }

    public Events(int id, int monitorId) {
        this.eventsPK = new EventsPK(id, monitorId);
    }

    public EventsPK getEventsPK() {
        return eventsPK;
    }

    public void setEventsPK(EventsPK eventsPK) {
        this.eventsPK = eventsPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Integer getFrames() {
        return frames;
    }

    public void setFrames(Integer frames) {
        this.frames = frames;
    }

    public Integer getAlarmFrames() {
        return alarmFrames;
    }

    public void setAlarmFrames(Integer alarmFrames) {
        this.alarmFrames = alarmFrames;
    }

    public int getTotScore() {
        return totScore;
    }

    public void setTotScore(int totScore) {
        this.totScore = totScore;
    }

    public Short getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Short avgScore) {
        this.avgScore = avgScore;
    }

    public Short getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Short maxScore) {
        this.maxScore = maxScore;
    }

    public short getArchived() {
        return archived;
    }

    public void setArchived(short archived) {
        this.archived = archived;
    }

    public short getVideoed() {
        return videoed;
    }

    public void setVideoed(short videoed) {
        this.videoed = videoed;
    }

    public short getUploaded() {
        return uploaded;
    }

    public void setUploaded(short uploaded) {
        this.uploaded = uploaded;
    }

    public short getEmailed() {
        return emailed;
    }

    public void setEmailed(short emailed) {
        this.emailed = emailed;
    }

    public short getMessaged() {
        return messaged;
    }

    public void setMessaged(short messaged) {
        this.messaged = messaged;
    }

    public short getExecuted() {
        return executed;
    }

    public void setExecuted(short executed) {
        this.executed = executed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eventsPK != null ? eventsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Events)) {
            return false;
        }
        Events other = (Events) object;
        if ((this.eventsPK == null && other.eventsPK != null) || (this.eventsPK != null && !this.eventsPK.equals(other.eventsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Events[ eventsPK=" + eventsPK + " ]";
    }
    
}
