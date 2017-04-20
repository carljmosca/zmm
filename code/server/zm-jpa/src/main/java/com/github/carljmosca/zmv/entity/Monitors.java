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
@Table(name = "Monitors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Monitors.findAll", query = "SELECT m FROM Monitors m")
    , @NamedQuery(name = "Monitors.findById", query = "SELECT m FROM Monitors m WHERE m.id = :id")
    , @NamedQuery(name = "Monitors.findByName", query = "SELECT m FROM Monitors m WHERE m.name = :name")
    , @NamedQuery(name = "Monitors.findByType", query = "SELECT m FROM Monitors m WHERE m.type = :type")
    , @NamedQuery(name = "Monitors.findByFunction", query = "SELECT m FROM Monitors m WHERE m.function = :function")
    , @NamedQuery(name = "Monitors.findByEnabled", query = "SELECT m FROM Monitors m WHERE m.enabled = :enabled")
    , @NamedQuery(name = "Monitors.findByLinkedMonitors", query = "SELECT m FROM Monitors m WHERE m.linkedMonitors = :linkedMonitors")
    , @NamedQuery(name = "Monitors.findByTriggers", query = "SELECT m FROM Monitors m WHERE m.triggers = :triggers")
    , @NamedQuery(name = "Monitors.findByDevice", query = "SELECT m FROM Monitors m WHERE m.device = :device")
    , @NamedQuery(name = "Monitors.findByChannel", query = "SELECT m FROM Monitors m WHERE m.channel = :channel")
    , @NamedQuery(name = "Monitors.findByFormat", query = "SELECT m FROM Monitors m WHERE m.format = :format")
    , @NamedQuery(name = "Monitors.findByProtocol", query = "SELECT m FROM Monitors m WHERE m.protocol = :protocol")
    , @NamedQuery(name = "Monitors.findByMethod", query = "SELECT m FROM Monitors m WHERE m.method = :method")
    , @NamedQuery(name = "Monitors.findByHost", query = "SELECT m FROM Monitors m WHERE m.host = :host")
    , @NamedQuery(name = "Monitors.findByPort", query = "SELECT m FROM Monitors m WHERE m.port = :port")
    , @NamedQuery(name = "Monitors.findBySubPath", query = "SELECT m FROM Monitors m WHERE m.subPath = :subPath")
    , @NamedQuery(name = "Monitors.findByPath", query = "SELECT m FROM Monitors m WHERE m.path = :path")
    , @NamedQuery(name = "Monitors.findByWidth", query = "SELECT m FROM Monitors m WHERE m.width = :width")
    , @NamedQuery(name = "Monitors.findByHeight", query = "SELECT m FROM Monitors m WHERE m.height = :height")
    , @NamedQuery(name = "Monitors.findByColours", query = "SELECT m FROM Monitors m WHERE m.colours = :colours")
    , @NamedQuery(name = "Monitors.findByPalette", query = "SELECT m FROM Monitors m WHERE m.palette = :palette")
    , @NamedQuery(name = "Monitors.findByOrientation", query = "SELECT m FROM Monitors m WHERE m.orientation = :orientation")
    , @NamedQuery(name = "Monitors.findByDeinterlacing", query = "SELECT m FROM Monitors m WHERE m.deinterlacing = :deinterlacing")
    , @NamedQuery(name = "Monitors.findByBrightness", query = "SELECT m FROM Monitors m WHERE m.brightness = :brightness")
    , @NamedQuery(name = "Monitors.findByContrast", query = "SELECT m FROM Monitors m WHERE m.contrast = :contrast")
    , @NamedQuery(name = "Monitors.findByHue", query = "SELECT m FROM Monitors m WHERE m.hue = :hue")
    , @NamedQuery(name = "Monitors.findByColour", query = "SELECT m FROM Monitors m WHERE m.colour = :colour")
    , @NamedQuery(name = "Monitors.findByEventPrefix", query = "SELECT m FROM Monitors m WHERE m.eventPrefix = :eventPrefix")
    , @NamedQuery(name = "Monitors.findByLabelFormat", query = "SELECT m FROM Monitors m WHERE m.labelFormat = :labelFormat")
    , @NamedQuery(name = "Monitors.findByLabelX", query = "SELECT m FROM Monitors m WHERE m.labelX = :labelX")
    , @NamedQuery(name = "Monitors.findByLabelY", query = "SELECT m FROM Monitors m WHERE m.labelY = :labelY")
    , @NamedQuery(name = "Monitors.findByImageBufferCount", query = "SELECT m FROM Monitors m WHERE m.imageBufferCount = :imageBufferCount")
    , @NamedQuery(name = "Monitors.findByWarmupCount", query = "SELECT m FROM Monitors m WHERE m.warmupCount = :warmupCount")
    , @NamedQuery(name = "Monitors.findByPreEventCount", query = "SELECT m FROM Monitors m WHERE m.preEventCount = :preEventCount")
    , @NamedQuery(name = "Monitors.findByPostEventCount", query = "SELECT m FROM Monitors m WHERE m.postEventCount = :postEventCount")
    , @NamedQuery(name = "Monitors.findByStreamReplayBuffer", query = "SELECT m FROM Monitors m WHERE m.streamReplayBuffer = :streamReplayBuffer")
    , @NamedQuery(name = "Monitors.findByAlarmFrameCount", query = "SELECT m FROM Monitors m WHERE m.alarmFrameCount = :alarmFrameCount")
    , @NamedQuery(name = "Monitors.findBySectionLength", query = "SELECT m FROM Monitors m WHERE m.sectionLength = :sectionLength")
    , @NamedQuery(name = "Monitors.findByFrameSkip", query = "SELECT m FROM Monitors m WHERE m.frameSkip = :frameSkip")
    , @NamedQuery(name = "Monitors.findByMaxFPS", query = "SELECT m FROM Monitors m WHERE m.maxFPS = :maxFPS")
    , @NamedQuery(name = "Monitors.findByAlarmMaxFPS", query = "SELECT m FROM Monitors m WHERE m.alarmMaxFPS = :alarmMaxFPS")
    , @NamedQuery(name = "Monitors.findByFPSReportInterval", query = "SELECT m FROM Monitors m WHERE m.fPSReportInterval = :fPSReportInterval")
    , @NamedQuery(name = "Monitors.findByRefBlendPerc", query = "SELECT m FROM Monitors m WHERE m.refBlendPerc = :refBlendPerc")
    , @NamedQuery(name = "Monitors.findByAlarmRefBlendPerc", query = "SELECT m FROM Monitors m WHERE m.alarmRefBlendPerc = :alarmRefBlendPerc")
    , @NamedQuery(name = "Monitors.findByControllable", query = "SELECT m FROM Monitors m WHERE m.controllable = :controllable")
    , @NamedQuery(name = "Monitors.findByControlId", query = "SELECT m FROM Monitors m WHERE m.controlId = :controlId")
    , @NamedQuery(name = "Monitors.findByControlDevice", query = "SELECT m FROM Monitors m WHERE m.controlDevice = :controlDevice")
    , @NamedQuery(name = "Monitors.findByControlAddress", query = "SELECT m FROM Monitors m WHERE m.controlAddress = :controlAddress")
    , @NamedQuery(name = "Monitors.findByAutoStopTimeout", query = "SELECT m FROM Monitors m WHERE m.autoStopTimeout = :autoStopTimeout")
    , @NamedQuery(name = "Monitors.findByTrackMotion", query = "SELECT m FROM Monitors m WHERE m.trackMotion = :trackMotion")
    , @NamedQuery(name = "Monitors.findByTrackDelay", query = "SELECT m FROM Monitors m WHERE m.trackDelay = :trackDelay")
    , @NamedQuery(name = "Monitors.findByReturnLocation", query = "SELECT m FROM Monitors m WHERE m.returnLocation = :returnLocation")
    , @NamedQuery(name = "Monitors.findByReturnDelay", query = "SELECT m FROM Monitors m WHERE m.returnDelay = :returnDelay")
    , @NamedQuery(name = "Monitors.findByDefaultView", query = "SELECT m FROM Monitors m WHERE m.defaultView = :defaultView")
    , @NamedQuery(name = "Monitors.findByDefaultRate", query = "SELECT m FROM Monitors m WHERE m.defaultRate = :defaultRate")
    , @NamedQuery(name = "Monitors.findByDefaultScale", query = "SELECT m FROM Monitors m WHERE m.defaultScale = :defaultScale")
    , @NamedQuery(name = "Monitors.findBySignalCheckColour", query = "SELECT m FROM Monitors m WHERE m.signalCheckColour = :signalCheckColour")
    , @NamedQuery(name = "Monitors.findByWebColour", query = "SELECT m FROM Monitors m WHERE m.webColour = :webColour")
    , @NamedQuery(name = "Monitors.findBySequence", query = "SELECT m FROM Monitors m WHERE m.sequence = :sequence")})
public class Monitors implements Serializable {

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
    @Column(name = "Function")
    private String function;
    @Basic(optional = false)
    @Column(name = "Enabled")
    private short enabled;
    @Basic(optional = false)
    @Column(name = "LinkedMonitors")
    private String linkedMonitors;
    @Basic(optional = false)
    @Column(name = "Triggers")
    private String triggers;
    @Basic(optional = false)
    @Column(name = "Device")
    private String device;
    @Basic(optional = false)
    @Column(name = "Channel")
    private short channel;
    @Basic(optional = false)
    @Column(name = "Format")
    private int format;
    @Basic(optional = false)
    @Column(name = "Protocol")
    private String protocol;
    @Basic(optional = false)
    @Column(name = "Method")
    private String method;
    @Basic(optional = false)
    @Column(name = "Host")
    private String host;
    @Basic(optional = false)
    @Column(name = "Port")
    private String port;
    @Basic(optional = false)
    @Column(name = "SubPath")
    private String subPath;
    @Basic(optional = false)
    @Column(name = "Path")
    private String path;
    @Basic(optional = false)
    @Column(name = "Width")
    private short width;
    @Basic(optional = false)
    @Column(name = "Height")
    private short height;
    @Basic(optional = false)
    @Column(name = "Colours")
    private short colours;
    @Basic(optional = false)
    @Column(name = "Palette")
    private int palette;
    @Basic(optional = false)
    @Column(name = "Orientation")
    private String orientation;
    @Basic(optional = false)
    @Column(name = "Deinterlacing")
    private int deinterlacing;
    @Basic(optional = false)
    @Column(name = "Brightness")
    private int brightness;
    @Basic(optional = false)
    @Column(name = "Contrast")
    private int contrast;
    @Basic(optional = false)
    @Column(name = "Hue")
    private int hue;
    @Basic(optional = false)
    @Column(name = "Colour")
    private int colour;
    @Basic(optional = false)
    @Column(name = "EventPrefix")
    private String eventPrefix;
    @Basic(optional = false)
    @Column(name = "LabelFormat")
    private String labelFormat;
    @Basic(optional = false)
    @Column(name = "LabelX")
    private short labelX;
    @Basic(optional = false)
    @Column(name = "LabelY")
    private short labelY;
    @Basic(optional = false)
    @Column(name = "ImageBufferCount")
    private short imageBufferCount;
    @Basic(optional = false)
    @Column(name = "WarmupCount")
    private short warmupCount;
    @Basic(optional = false)
    @Column(name = "PreEventCount")
    private short preEventCount;
    @Basic(optional = false)
    @Column(name = "PostEventCount")
    private short postEventCount;
    @Basic(optional = false)
    @Column(name = "StreamReplayBuffer")
    private int streamReplayBuffer;
    @Basic(optional = false)
    @Column(name = "AlarmFrameCount")
    private short alarmFrameCount;
    @Basic(optional = false)
    @Column(name = "SectionLength")
    private int sectionLength;
    @Basic(optional = false)
    @Column(name = "FrameSkip")
    private short frameSkip;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MaxFPS")
    private BigDecimal maxFPS;
    @Column(name = "AlarmMaxFPS")
    private BigDecimal alarmMaxFPS;
    @Basic(optional = false)
    @Column(name = "FPSReportInterval")
    private short fPSReportInterval;
    @Basic(optional = false)
    @Column(name = "RefBlendPerc")
    private short refBlendPerc;
    @Basic(optional = false)
    @Column(name = "AlarmRefBlendPerc")
    private short alarmRefBlendPerc;
    @Basic(optional = false)
    @Column(name = "Controllable")
    private short controllable;
    @Basic(optional = false)
    @Column(name = "ControlId")
    private int controlId;
    @Column(name = "ControlDevice")
    private String controlDevice;
    @Column(name = "ControlAddress")
    private String controlAddress;
    @Column(name = "AutoStopTimeout")
    private BigDecimal autoStopTimeout;
    @Basic(optional = false)
    @Column(name = "TrackMotion")
    private short trackMotion;
    @Basic(optional = false)
    @Column(name = "TrackDelay")
    private short trackDelay;
    @Basic(optional = false)
    @Column(name = "ReturnLocation")
    private short returnLocation;
    @Basic(optional = false)
    @Column(name = "ReturnDelay")
    private short returnDelay;
    @Basic(optional = false)
    @Column(name = "DefaultView")
    private String defaultView;
    @Basic(optional = false)
    @Column(name = "DefaultRate")
    private short defaultRate;
    @Basic(optional = false)
    @Column(name = "DefaultScale")
    private short defaultScale;
    @Basic(optional = false)
    @Column(name = "SignalCheckColour")
    private String signalCheckColour;
    @Basic(optional = false)
    @Column(name = "WebColour")
    private String webColour;
    @Column(name = "Sequence")
    private Short sequence;

    public Monitors() {
    }

    public Monitors(Integer id) {
        this.id = id;
    }

    public Monitors(Integer id, String name, String type, String function, short enabled, String linkedMonitors, String triggers, String device, short channel, int format, String protocol, String method, String host, String port, String subPath, String path, short width, short height, short colours, int palette, String orientation, int deinterlacing, int brightness, int contrast, int hue, int colour, String eventPrefix, String labelFormat, short labelX, short labelY, short imageBufferCount, short warmupCount, short preEventCount, short postEventCount, int streamReplayBuffer, short alarmFrameCount, int sectionLength, short frameSkip, short fPSReportInterval, short refBlendPerc, short alarmRefBlendPerc, short controllable, int controlId, short trackMotion, short trackDelay, short returnLocation, short returnDelay, String defaultView, short defaultRate, short defaultScale, String signalCheckColour, String webColour) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.function = function;
        this.enabled = enabled;
        this.linkedMonitors = linkedMonitors;
        this.triggers = triggers;
        this.device = device;
        this.channel = channel;
        this.format = format;
        this.protocol = protocol;
        this.method = method;
        this.host = host;
        this.port = port;
        this.subPath = subPath;
        this.path = path;
        this.width = width;
        this.height = height;
        this.colours = colours;
        this.palette = palette;
        this.orientation = orientation;
        this.deinterlacing = deinterlacing;
        this.brightness = brightness;
        this.contrast = contrast;
        this.hue = hue;
        this.colour = colour;
        this.eventPrefix = eventPrefix;
        this.labelFormat = labelFormat;
        this.labelX = labelX;
        this.labelY = labelY;
        this.imageBufferCount = imageBufferCount;
        this.warmupCount = warmupCount;
        this.preEventCount = preEventCount;
        this.postEventCount = postEventCount;
        this.streamReplayBuffer = streamReplayBuffer;
        this.alarmFrameCount = alarmFrameCount;
        this.sectionLength = sectionLength;
        this.frameSkip = frameSkip;
        this.fPSReportInterval = fPSReportInterval;
        this.refBlendPerc = refBlendPerc;
        this.alarmRefBlendPerc = alarmRefBlendPerc;
        this.controllable = controllable;
        this.controlId = controlId;
        this.trackMotion = trackMotion;
        this.trackDelay = trackDelay;
        this.returnLocation = returnLocation;
        this.returnDelay = returnDelay;
        this.defaultView = defaultView;
        this.defaultRate = defaultRate;
        this.defaultScale = defaultScale;
        this.signalCheckColour = signalCheckColour;
        this.webColour = webColour;
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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public short getEnabled() {
        return enabled;
    }

    public void setEnabled(short enabled) {
        this.enabled = enabled;
    }

    public String getLinkedMonitors() {
        return linkedMonitors;
    }

    public void setLinkedMonitors(String linkedMonitors) {
        this.linkedMonitors = linkedMonitors;
    }

    public String getTriggers() {
        return triggers;
    }

    public void setTriggers(String triggers) {
        this.triggers = triggers;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public short getChannel() {
        return channel;
    }

    public void setChannel(short channel) {
        this.channel = channel;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
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

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public short getColours() {
        return colours;
    }

    public void setColours(short colours) {
        this.colours = colours;
    }

    public int getPalette() {
        return palette;
    }

    public void setPalette(int palette) {
        this.palette = palette;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public int getDeinterlacing() {
        return deinterlacing;
    }

    public void setDeinterlacing(int deinterlacing) {
        this.deinterlacing = deinterlacing;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }

    public int getHue() {
        return hue;
    }

    public void setHue(int hue) {
        this.hue = hue;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    public String getEventPrefix() {
        return eventPrefix;
    }

    public void setEventPrefix(String eventPrefix) {
        this.eventPrefix = eventPrefix;
    }

    public String getLabelFormat() {
        return labelFormat;
    }

    public void setLabelFormat(String labelFormat) {
        this.labelFormat = labelFormat;
    }

    public short getLabelX() {
        return labelX;
    }

    public void setLabelX(short labelX) {
        this.labelX = labelX;
    }

    public short getLabelY() {
        return labelY;
    }

    public void setLabelY(short labelY) {
        this.labelY = labelY;
    }

    public short getImageBufferCount() {
        return imageBufferCount;
    }

    public void setImageBufferCount(short imageBufferCount) {
        this.imageBufferCount = imageBufferCount;
    }

    public short getWarmupCount() {
        return warmupCount;
    }

    public void setWarmupCount(short warmupCount) {
        this.warmupCount = warmupCount;
    }

    public short getPreEventCount() {
        return preEventCount;
    }

    public void setPreEventCount(short preEventCount) {
        this.preEventCount = preEventCount;
    }

    public short getPostEventCount() {
        return postEventCount;
    }

    public void setPostEventCount(short postEventCount) {
        this.postEventCount = postEventCount;
    }

    public int getStreamReplayBuffer() {
        return streamReplayBuffer;
    }

    public void setStreamReplayBuffer(int streamReplayBuffer) {
        this.streamReplayBuffer = streamReplayBuffer;
    }

    public short getAlarmFrameCount() {
        return alarmFrameCount;
    }

    public void setAlarmFrameCount(short alarmFrameCount) {
        this.alarmFrameCount = alarmFrameCount;
    }

    public int getSectionLength() {
        return sectionLength;
    }

    public void setSectionLength(int sectionLength) {
        this.sectionLength = sectionLength;
    }

    public short getFrameSkip() {
        return frameSkip;
    }

    public void setFrameSkip(short frameSkip) {
        this.frameSkip = frameSkip;
    }

    public BigDecimal getMaxFPS() {
        return maxFPS;
    }

    public void setMaxFPS(BigDecimal maxFPS) {
        this.maxFPS = maxFPS;
    }

    public BigDecimal getAlarmMaxFPS() {
        return alarmMaxFPS;
    }

    public void setAlarmMaxFPS(BigDecimal alarmMaxFPS) {
        this.alarmMaxFPS = alarmMaxFPS;
    }

    public short getFPSReportInterval() {
        return fPSReportInterval;
    }

    public void setFPSReportInterval(short fPSReportInterval) {
        this.fPSReportInterval = fPSReportInterval;
    }

    public short getRefBlendPerc() {
        return refBlendPerc;
    }

    public void setRefBlendPerc(short refBlendPerc) {
        this.refBlendPerc = refBlendPerc;
    }

    public short getAlarmRefBlendPerc() {
        return alarmRefBlendPerc;
    }

    public void setAlarmRefBlendPerc(short alarmRefBlendPerc) {
        this.alarmRefBlendPerc = alarmRefBlendPerc;
    }

    public short getControllable() {
        return controllable;
    }

    public void setControllable(short controllable) {
        this.controllable = controllable;
    }

    public int getControlId() {
        return controlId;
    }

    public void setControlId(int controlId) {
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

    public BigDecimal getAutoStopTimeout() {
        return autoStopTimeout;
    }

    public void setAutoStopTimeout(BigDecimal autoStopTimeout) {
        this.autoStopTimeout = autoStopTimeout;
    }

    public short getTrackMotion() {
        return trackMotion;
    }

    public void setTrackMotion(short trackMotion) {
        this.trackMotion = trackMotion;
    }

    public short getTrackDelay() {
        return trackDelay;
    }

    public void setTrackDelay(short trackDelay) {
        this.trackDelay = trackDelay;
    }

    public short getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(short returnLocation) {
        this.returnLocation = returnLocation;
    }

    public short getReturnDelay() {
        return returnDelay;
    }

    public void setReturnDelay(short returnDelay) {
        this.returnDelay = returnDelay;
    }

    public String getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
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

    public String getSignalCheckColour() {
        return signalCheckColour;
    }

    public void setSignalCheckColour(String signalCheckColour) {
        this.signalCheckColour = signalCheckColour;
    }

    public String getWebColour() {
        return webColour;
    }

    public void setWebColour(String webColour) {
        this.webColour = webColour;
    }

    public Short getSequence() {
        return sequence;
    }

    public void setSequence(Short sequence) {
        this.sequence = sequence;
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
        if (!(object instanceof Monitors)) {
            return false;
        }
        Monitors other = (Monitors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
}
