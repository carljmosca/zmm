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
@Table(name = "Frames")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Frames.findAll", query = "SELECT f FROM Frames f")
    , @NamedQuery(name = "Frames.findByEventId", query = "SELECT f FROM Frames f WHERE f.id.eventId = :eventId")
    , @NamedQuery(name = "Frames.findByFrameId", query = "SELECT f FROM Frames f WHERE f.id.frameId = :frameId")
    , @NamedQuery(name = "Frames.findByType", query = "SELECT f FROM Frames f WHERE f.type = :type")
    , @NamedQuery(name = "Frames.findByTimeStamp", query = "SELECT f FROM Frames f WHERE f.timeStamp = :timeStamp")
    , @NamedQuery(name = "Frames.findByDelta", query = "SELECT f FROM Frames f WHERE f.delta = :delta")
    , @NamedQuery(name = "Frames.findByScore", query = "SELECT f FROM Frames f WHERE f.score = :score")})
public class Frames implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FramesPK id;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "TimeStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "Delta")
    private BigDecimal delta;
    @Basic(optional = false)
    @Column(name = "Score")
    private short score;

    public Frames() {
    }

    public Frames(FramesPK id) {
        this.id = id;
    }

    public Frames(FramesPK id, String type, Date timeStamp, BigDecimal delta, short score) {
        this.id = id;
        this.type = type;
        this.timeStamp = timeStamp;
        this.delta = delta;
        this.score = score;
    }

    public Frames(int eventId, int frameId) {
        this.id = new FramesPK(eventId, frameId);
    }

    public FramesPK getId() {
        return id;
    }

    public void setId(FramesPK id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BigDecimal getDelta() {
        return delta;
    }

    public void setDelta(BigDecimal delta) {
        this.delta = delta;
    }

    public short getScore() {
        return score;
    }

    public void setScore(short score) {
        this.score = score;
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
        if (!(object instanceof Frames)) {
            return false;
        }
        Frames other = (Frames) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Frames[ framesPK=" + id + " ]";
    }
    
}
