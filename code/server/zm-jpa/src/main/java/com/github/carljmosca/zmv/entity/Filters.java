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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moscac
 */
@Entity
@Table(name = "Filters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filters.findAll", query = "SELECT f FROM Filters f")
    , @NamedQuery(name = "Filters.findByName", query = "SELECT f FROM Filters f WHERE f.name = :name")
    , @NamedQuery(name = "Filters.findByAutoArchive", query = "SELECT f FROM Filters f WHERE f.autoArchive = :autoArchive")
    , @NamedQuery(name = "Filters.findByAutoVideo", query = "SELECT f FROM Filters f WHERE f.autoVideo = :autoVideo")
    , @NamedQuery(name = "Filters.findByAutoUpload", query = "SELECT f FROM Filters f WHERE f.autoUpload = :autoUpload")
    , @NamedQuery(name = "Filters.findByAutoEmail", query = "SELECT f FROM Filters f WHERE f.autoEmail = :autoEmail")
    , @NamedQuery(name = "Filters.findByAutoMessage", query = "SELECT f FROM Filters f WHERE f.autoMessage = :autoMessage")
    , @NamedQuery(name = "Filters.findByAutoExecute", query = "SELECT f FROM Filters f WHERE f.autoExecute = :autoExecute")
    , @NamedQuery(name = "Filters.findByAutoExecuteCmd", query = "SELECT f FROM Filters f WHERE f.autoExecuteCmd = :autoExecuteCmd")
    , @NamedQuery(name = "Filters.findByAutoDelete", query = "SELECT f FROM Filters f WHERE f.autoDelete = :autoDelete")
    , @NamedQuery(name = "Filters.findByBackground", query = "SELECT f FROM Filters f WHERE f.background = :background")})
public class Filters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "Query")
    private String query;
    @Basic(optional = false)
    @Column(name = "AutoArchive")
    private short autoArchive;
    @Basic(optional = false)
    @Column(name = "AutoVideo")
    private short autoVideo;
    @Basic(optional = false)
    @Column(name = "AutoUpload")
    private short autoUpload;
    @Basic(optional = false)
    @Column(name = "AutoEmail")
    private short autoEmail;
    @Basic(optional = false)
    @Column(name = "AutoMessage")
    private short autoMessage;
    @Basic(optional = false)
    @Column(name = "AutoExecute")
    private short autoExecute;
    @Column(name = "AutoExecuteCmd")
    private String autoExecuteCmd;
    @Basic(optional = false)
    @Column(name = "AutoDelete")
    private short autoDelete;
    @Basic(optional = false)
    @Column(name = "Background")
    private boolean background;

    public Filters() {
    }

    public Filters(String name) {
        this.name = name;
    }

    public Filters(String name, String query, short autoArchive, short autoVideo, short autoUpload, short autoEmail, short autoMessage, short autoExecute, short autoDelete, boolean background) {
        this.name = name;
        this.query = query;
        this.autoArchive = autoArchive;
        this.autoVideo = autoVideo;
        this.autoUpload = autoUpload;
        this.autoEmail = autoEmail;
        this.autoMessage = autoMessage;
        this.autoExecute = autoExecute;
        this.autoDelete = autoDelete;
        this.background = background;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public short getAutoArchive() {
        return autoArchive;
    }

    public void setAutoArchive(short autoArchive) {
        this.autoArchive = autoArchive;
    }

    public short getAutoVideo() {
        return autoVideo;
    }

    public void setAutoVideo(short autoVideo) {
        this.autoVideo = autoVideo;
    }

    public short getAutoUpload() {
        return autoUpload;
    }

    public void setAutoUpload(short autoUpload) {
        this.autoUpload = autoUpload;
    }

    public short getAutoEmail() {
        return autoEmail;
    }

    public void setAutoEmail(short autoEmail) {
        this.autoEmail = autoEmail;
    }

    public short getAutoMessage() {
        return autoMessage;
    }

    public void setAutoMessage(short autoMessage) {
        this.autoMessage = autoMessage;
    }

    public short getAutoExecute() {
        return autoExecute;
    }

    public void setAutoExecute(short autoExecute) {
        this.autoExecute = autoExecute;
    }

    public String getAutoExecuteCmd() {
        return autoExecuteCmd;
    }

    public void setAutoExecuteCmd(String autoExecuteCmd) {
        this.autoExecuteCmd = autoExecuteCmd;
    }

    public short getAutoDelete() {
        return autoDelete;
    }

    public void setAutoDelete(short autoDelete) {
        this.autoDelete = autoDelete;
    }

    public boolean getBackground() {
        return background;
    }

    public void setBackground(boolean background) {
        this.background = background;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filters)) {
            return false;
        }
        Filters other = (Filters) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Filters[ name=" + name + " ]";
    }
    
}
