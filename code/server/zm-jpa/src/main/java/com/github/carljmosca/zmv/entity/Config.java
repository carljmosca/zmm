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
@Table(name = "Config")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Config.findAll", query = "SELECT c FROM Config c")
    , @NamedQuery(name = "Config.findById", query = "SELECT c FROM Config c WHERE c.id = :id")
    , @NamedQuery(name = "Config.findByName", query = "SELECT c FROM Config c WHERE c.name = :name")
    , @NamedQuery(name = "Config.findByType", query = "SELECT c FROM Config c WHERE c.type = :type")
    , @NamedQuery(name = "Config.findByHint", query = "SELECT c FROM Config c WHERE c.hint = :hint")
    , @NamedQuery(name = "Config.findByPattern", query = "SELECT c FROM Config c WHERE c.pattern = :pattern")
    , @NamedQuery(name = "Config.findByFormat", query = "SELECT c FROM Config c WHERE c.format = :format")
    , @NamedQuery(name = "Config.findByPrompt", query = "SELECT c FROM Config c WHERE c.prompt = :prompt")
    , @NamedQuery(name = "Config.findByCategory", query = "SELECT c FROM Config c WHERE c.category = :category")
    , @NamedQuery(name = "Config.findByReadonly", query = "SELECT c FROM Config c WHERE c.readonly = :readonly")})
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "Id")
    private short id;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "Value")
    private String value;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Lob
    @Column(name = "DefaultValue")
    private String defaultValue;
    @Column(name = "Hint")
    private String hint;
    @Column(name = "Pattern")
    private String pattern;
    @Column(name = "Format")
    private String format;
    @Column(name = "Prompt")
    private String prompt;
    @Lob
    @Column(name = "Help")
    private String help;
    @Basic(optional = false)
    @Column(name = "Category")
    private String category;
    @Basic(optional = false)
    @Column(name = "Readonly")
    private short readonly;
    @Lob
    @Column(name = "Requires")
    private String requires;

    public Config() {
    }

    public Config(String name) {
        this.name = name;
    }

    public Config(String name, short id, String value, String type, String category, short readonly) {
        this.name = name;
        this.id = id;
        this.value = value;
        this.type = type;
        this.category = category;
        this.readonly = readonly;
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public short getReadonly() {
        return readonly;
    }

    public void setReadonly(short readonly) {
        this.readonly = readonly;
    }

    public String getRequires() {
        return requires;
    }

    public void setRequires(String requires) {
        this.requires = requires;
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
        if (!(object instanceof Config)) {
            return false;
        }
        Config other = (Config) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Config[ name=" + name + " ]";
    }
    
}
