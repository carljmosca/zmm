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
@Table(name = "Controls")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Controls.findAll", query = "SELECT c FROM Controls c")
    , @NamedQuery(name = "Controls.findById", query = "SELECT c FROM Controls c WHERE c.id = :id")
    , @NamedQuery(name = "Controls.findByName", query = "SELECT c FROM Controls c WHERE c.name = :name")
    , @NamedQuery(name = "Controls.findByType", query = "SELECT c FROM Controls c WHERE c.type = :type")
    , @NamedQuery(name = "Controls.findByProtocol", query = "SELECT c FROM Controls c WHERE c.protocol = :protocol")
    , @NamedQuery(name = "Controls.findByCanWake", query = "SELECT c FROM Controls c WHERE c.canWake = :canWake")
    , @NamedQuery(name = "Controls.findByCanSleep", query = "SELECT c FROM Controls c WHERE c.canSleep = :canSleep")
    , @NamedQuery(name = "Controls.findByCanReset", query = "SELECT c FROM Controls c WHERE c.canReset = :canReset")
    , @NamedQuery(name = "Controls.findByCanZoom", query = "SELECT c FROM Controls c WHERE c.canZoom = :canZoom")
    , @NamedQuery(name = "Controls.findByCanAutoZoom", query = "SELECT c FROM Controls c WHERE c.canAutoZoom = :canAutoZoom")
    , @NamedQuery(name = "Controls.findByCanZoomAbs", query = "SELECT c FROM Controls c WHERE c.canZoomAbs = :canZoomAbs")
    , @NamedQuery(name = "Controls.findByCanZoomRel", query = "SELECT c FROM Controls c WHERE c.canZoomRel = :canZoomRel")
    , @NamedQuery(name = "Controls.findByCanZoomCon", query = "SELECT c FROM Controls c WHERE c.canZoomCon = :canZoomCon")
    , @NamedQuery(name = "Controls.findByMinZoomRange", query = "SELECT c FROM Controls c WHERE c.minZoomRange = :minZoomRange")
    , @NamedQuery(name = "Controls.findByMaxZoomRange", query = "SELECT c FROM Controls c WHERE c.maxZoomRange = :maxZoomRange")
    , @NamedQuery(name = "Controls.findByMinZoomStep", query = "SELECT c FROM Controls c WHERE c.minZoomStep = :minZoomStep")
    , @NamedQuery(name = "Controls.findByMaxZoomStep", query = "SELECT c FROM Controls c WHERE c.maxZoomStep = :maxZoomStep")
    , @NamedQuery(name = "Controls.findByHasZoomSpeed", query = "SELECT c FROM Controls c WHERE c.hasZoomSpeed = :hasZoomSpeed")
    , @NamedQuery(name = "Controls.findByMinZoomSpeed", query = "SELECT c FROM Controls c WHERE c.minZoomSpeed = :minZoomSpeed")
    , @NamedQuery(name = "Controls.findByMaxZoomSpeed", query = "SELECT c FROM Controls c WHERE c.maxZoomSpeed = :maxZoomSpeed")
    , @NamedQuery(name = "Controls.findByCanFocus", query = "SELECT c FROM Controls c WHERE c.canFocus = :canFocus")
    , @NamedQuery(name = "Controls.findByCanAutoFocus", query = "SELECT c FROM Controls c WHERE c.canAutoFocus = :canAutoFocus")
    , @NamedQuery(name = "Controls.findByCanFocusAbs", query = "SELECT c FROM Controls c WHERE c.canFocusAbs = :canFocusAbs")
    , @NamedQuery(name = "Controls.findByCanFocusRel", query = "SELECT c FROM Controls c WHERE c.canFocusRel = :canFocusRel")
    , @NamedQuery(name = "Controls.findByCanFocusCon", query = "SELECT c FROM Controls c WHERE c.canFocusCon = :canFocusCon")
    , @NamedQuery(name = "Controls.findByMinFocusRange", query = "SELECT c FROM Controls c WHERE c.minFocusRange = :minFocusRange")
    , @NamedQuery(name = "Controls.findByMaxFocusRange", query = "SELECT c FROM Controls c WHERE c.maxFocusRange = :maxFocusRange")
    , @NamedQuery(name = "Controls.findByMinFocusStep", query = "SELECT c FROM Controls c WHERE c.minFocusStep = :minFocusStep")
    , @NamedQuery(name = "Controls.findByMaxFocusStep", query = "SELECT c FROM Controls c WHERE c.maxFocusStep = :maxFocusStep")
    , @NamedQuery(name = "Controls.findByHasFocusSpeed", query = "SELECT c FROM Controls c WHERE c.hasFocusSpeed = :hasFocusSpeed")
    , @NamedQuery(name = "Controls.findByMinFocusSpeed", query = "SELECT c FROM Controls c WHERE c.minFocusSpeed = :minFocusSpeed")
    , @NamedQuery(name = "Controls.findByMaxFocusSpeed", query = "SELECT c FROM Controls c WHERE c.maxFocusSpeed = :maxFocusSpeed")
    , @NamedQuery(name = "Controls.findByCanIris", query = "SELECT c FROM Controls c WHERE c.canIris = :canIris")
    , @NamedQuery(name = "Controls.findByCanAutoIris", query = "SELECT c FROM Controls c WHERE c.canAutoIris = :canAutoIris")
    , @NamedQuery(name = "Controls.findByCanIrisAbs", query = "SELECT c FROM Controls c WHERE c.canIrisAbs = :canIrisAbs")
    , @NamedQuery(name = "Controls.findByCanIrisRel", query = "SELECT c FROM Controls c WHERE c.canIrisRel = :canIrisRel")
    , @NamedQuery(name = "Controls.findByCanIrisCon", query = "SELECT c FROM Controls c WHERE c.canIrisCon = :canIrisCon")
    , @NamedQuery(name = "Controls.findByMinIrisRange", query = "SELECT c FROM Controls c WHERE c.minIrisRange = :minIrisRange")
    , @NamedQuery(name = "Controls.findByMaxIrisRange", query = "SELECT c FROM Controls c WHERE c.maxIrisRange = :maxIrisRange")
    , @NamedQuery(name = "Controls.findByMinIrisStep", query = "SELECT c FROM Controls c WHERE c.minIrisStep = :minIrisStep")
    , @NamedQuery(name = "Controls.findByMaxIrisStep", query = "SELECT c FROM Controls c WHERE c.maxIrisStep = :maxIrisStep")
    , @NamedQuery(name = "Controls.findByHasIrisSpeed", query = "SELECT c FROM Controls c WHERE c.hasIrisSpeed = :hasIrisSpeed")
    , @NamedQuery(name = "Controls.findByMinIrisSpeed", query = "SELECT c FROM Controls c WHERE c.minIrisSpeed = :minIrisSpeed")
    , @NamedQuery(name = "Controls.findByMaxIrisSpeed", query = "SELECT c FROM Controls c WHERE c.maxIrisSpeed = :maxIrisSpeed")
    , @NamedQuery(name = "Controls.findByCanGain", query = "SELECT c FROM Controls c WHERE c.canGain = :canGain")
    , @NamedQuery(name = "Controls.findByCanAutoGain", query = "SELECT c FROM Controls c WHERE c.canAutoGain = :canAutoGain")
    , @NamedQuery(name = "Controls.findByCanGainAbs", query = "SELECT c FROM Controls c WHERE c.canGainAbs = :canGainAbs")
    , @NamedQuery(name = "Controls.findByCanGainRel", query = "SELECT c FROM Controls c WHERE c.canGainRel = :canGainRel")
    , @NamedQuery(name = "Controls.findByCanGainCon", query = "SELECT c FROM Controls c WHERE c.canGainCon = :canGainCon")
    , @NamedQuery(name = "Controls.findByMinGainRange", query = "SELECT c FROM Controls c WHERE c.minGainRange = :minGainRange")
    , @NamedQuery(name = "Controls.findByMaxGainRange", query = "SELECT c FROM Controls c WHERE c.maxGainRange = :maxGainRange")
    , @NamedQuery(name = "Controls.findByMinGainStep", query = "SELECT c FROM Controls c WHERE c.minGainStep = :minGainStep")
    , @NamedQuery(name = "Controls.findByMaxGainStep", query = "SELECT c FROM Controls c WHERE c.maxGainStep = :maxGainStep")
    , @NamedQuery(name = "Controls.findByHasGainSpeed", query = "SELECT c FROM Controls c WHERE c.hasGainSpeed = :hasGainSpeed")
    , @NamedQuery(name = "Controls.findByMinGainSpeed", query = "SELECT c FROM Controls c WHERE c.minGainSpeed = :minGainSpeed")
    , @NamedQuery(name = "Controls.findByMaxGainSpeed", query = "SELECT c FROM Controls c WHERE c.maxGainSpeed = :maxGainSpeed")
    , @NamedQuery(name = "Controls.findByCanWhite", query = "SELECT c FROM Controls c WHERE c.canWhite = :canWhite")
    , @NamedQuery(name = "Controls.findByCanAutoWhite", query = "SELECT c FROM Controls c WHERE c.canAutoWhite = :canAutoWhite")
    , @NamedQuery(name = "Controls.findByCanWhiteAbs", query = "SELECT c FROM Controls c WHERE c.canWhiteAbs = :canWhiteAbs")
    , @NamedQuery(name = "Controls.findByCanWhiteRel", query = "SELECT c FROM Controls c WHERE c.canWhiteRel = :canWhiteRel")
    , @NamedQuery(name = "Controls.findByCanWhiteCon", query = "SELECT c FROM Controls c WHERE c.canWhiteCon = :canWhiteCon")
    , @NamedQuery(name = "Controls.findByMinWhiteRange", query = "SELECT c FROM Controls c WHERE c.minWhiteRange = :minWhiteRange")
    , @NamedQuery(name = "Controls.findByMaxWhiteRange", query = "SELECT c FROM Controls c WHERE c.maxWhiteRange = :maxWhiteRange")
    , @NamedQuery(name = "Controls.findByMinWhiteStep", query = "SELECT c FROM Controls c WHERE c.minWhiteStep = :minWhiteStep")
    , @NamedQuery(name = "Controls.findByMaxWhiteStep", query = "SELECT c FROM Controls c WHERE c.maxWhiteStep = :maxWhiteStep")
    , @NamedQuery(name = "Controls.findByHasWhiteSpeed", query = "SELECT c FROM Controls c WHERE c.hasWhiteSpeed = :hasWhiteSpeed")
    , @NamedQuery(name = "Controls.findByMinWhiteSpeed", query = "SELECT c FROM Controls c WHERE c.minWhiteSpeed = :minWhiteSpeed")
    , @NamedQuery(name = "Controls.findByMaxWhiteSpeed", query = "SELECT c FROM Controls c WHERE c.maxWhiteSpeed = :maxWhiteSpeed")
    , @NamedQuery(name = "Controls.findByHasPresets", query = "SELECT c FROM Controls c WHERE c.hasPresets = :hasPresets")
    , @NamedQuery(name = "Controls.findByNumPresets", query = "SELECT c FROM Controls c WHERE c.numPresets = :numPresets")
    , @NamedQuery(name = "Controls.findByHasHomePreset", query = "SELECT c FROM Controls c WHERE c.hasHomePreset = :hasHomePreset")
    , @NamedQuery(name = "Controls.findByCanSetPresets", query = "SELECT c FROM Controls c WHERE c.canSetPresets = :canSetPresets")
    , @NamedQuery(name = "Controls.findByCanMove", query = "SELECT c FROM Controls c WHERE c.canMove = :canMove")
    , @NamedQuery(name = "Controls.findByCanMoveDiag", query = "SELECT c FROM Controls c WHERE c.canMoveDiag = :canMoveDiag")
    , @NamedQuery(name = "Controls.findByCanMoveMap", query = "SELECT c FROM Controls c WHERE c.canMoveMap = :canMoveMap")
    , @NamedQuery(name = "Controls.findByCanMoveAbs", query = "SELECT c FROM Controls c WHERE c.canMoveAbs = :canMoveAbs")
    , @NamedQuery(name = "Controls.findByCanMoveRel", query = "SELECT c FROM Controls c WHERE c.canMoveRel = :canMoveRel")
    , @NamedQuery(name = "Controls.findByCanMoveCon", query = "SELECT c FROM Controls c WHERE c.canMoveCon = :canMoveCon")
    , @NamedQuery(name = "Controls.findByCanPan", query = "SELECT c FROM Controls c WHERE c.canPan = :canPan")
    , @NamedQuery(name = "Controls.findByMinPanRange", query = "SELECT c FROM Controls c WHERE c.minPanRange = :minPanRange")
    , @NamedQuery(name = "Controls.findByMaxPanRange", query = "SELECT c FROM Controls c WHERE c.maxPanRange = :maxPanRange")
    , @NamedQuery(name = "Controls.findByMinPanStep", query = "SELECT c FROM Controls c WHERE c.minPanStep = :minPanStep")
    , @NamedQuery(name = "Controls.findByMaxPanStep", query = "SELECT c FROM Controls c WHERE c.maxPanStep = :maxPanStep")
    , @NamedQuery(name = "Controls.findByHasPanSpeed", query = "SELECT c FROM Controls c WHERE c.hasPanSpeed = :hasPanSpeed")
    , @NamedQuery(name = "Controls.findByMinPanSpeed", query = "SELECT c FROM Controls c WHERE c.minPanSpeed = :minPanSpeed")
    , @NamedQuery(name = "Controls.findByMaxPanSpeed", query = "SELECT c FROM Controls c WHERE c.maxPanSpeed = :maxPanSpeed")
    , @NamedQuery(name = "Controls.findByHasTurboPan", query = "SELECT c FROM Controls c WHERE c.hasTurboPan = :hasTurboPan")
    , @NamedQuery(name = "Controls.findByTurboPanSpeed", query = "SELECT c FROM Controls c WHERE c.turboPanSpeed = :turboPanSpeed")
    , @NamedQuery(name = "Controls.findByCanTilt", query = "SELECT c FROM Controls c WHERE c.canTilt = :canTilt")
    , @NamedQuery(name = "Controls.findByMinTiltRange", query = "SELECT c FROM Controls c WHERE c.minTiltRange = :minTiltRange")
    , @NamedQuery(name = "Controls.findByMaxTiltRange", query = "SELECT c FROM Controls c WHERE c.maxTiltRange = :maxTiltRange")
    , @NamedQuery(name = "Controls.findByMinTiltStep", query = "SELECT c FROM Controls c WHERE c.minTiltStep = :minTiltStep")
    , @NamedQuery(name = "Controls.findByMaxTiltStep", query = "SELECT c FROM Controls c WHERE c.maxTiltStep = :maxTiltStep")
    , @NamedQuery(name = "Controls.findByHasTiltSpeed", query = "SELECT c FROM Controls c WHERE c.hasTiltSpeed = :hasTiltSpeed")
    , @NamedQuery(name = "Controls.findByMinTiltSpeed", query = "SELECT c FROM Controls c WHERE c.minTiltSpeed = :minTiltSpeed")
    , @NamedQuery(name = "Controls.findByMaxTiltSpeed", query = "SELECT c FROM Controls c WHERE c.maxTiltSpeed = :maxTiltSpeed")
    , @NamedQuery(name = "Controls.findByHasTurboTilt", query = "SELECT c FROM Controls c WHERE c.hasTurboTilt = :hasTurboTilt")
    , @NamedQuery(name = "Controls.findByTurboTiltSpeed", query = "SELECT c FROM Controls c WHERE c.turboTiltSpeed = :turboTiltSpeed")
    , @NamedQuery(name = "Controls.findByCanAutoScan", query = "SELECT c FROM Controls c WHERE c.canAutoScan = :canAutoScan")
    , @NamedQuery(name = "Controls.findByNumScanPaths", query = "SELECT c FROM Controls c WHERE c.numScanPaths = :numScanPaths")})
public class Controls implements Serializable {

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
    @Column(name = "Protocol")
    private String protocol;
    @Basic(optional = false)
    @Column(name = "CanWake")
    private short canWake;
    @Basic(optional = false)
    @Column(name = "CanSleep")
    private short canSleep;
    @Basic(optional = false)
    @Column(name = "CanReset")
    private short canReset;
    @Basic(optional = false)
    @Column(name = "CanZoom")
    private short canZoom;
    @Basic(optional = false)
    @Column(name = "CanAutoZoom")
    private short canAutoZoom;
    @Basic(optional = false)
    @Column(name = "CanZoomAbs")
    private short canZoomAbs;
    @Basic(optional = false)
    @Column(name = "CanZoomRel")
    private short canZoomRel;
    @Basic(optional = false)
    @Column(name = "CanZoomCon")
    private short canZoomCon;
    @Column(name = "MinZoomRange")
    private Integer minZoomRange;
    @Column(name = "MaxZoomRange")
    private Integer maxZoomRange;
    @Column(name = "MinZoomStep")
    private Integer minZoomStep;
    @Column(name = "MaxZoomStep")
    private Integer maxZoomStep;
    @Basic(optional = false)
    @Column(name = "HasZoomSpeed")
    private short hasZoomSpeed;
    @Column(name = "MinZoomSpeed")
    private Integer minZoomSpeed;
    @Column(name = "MaxZoomSpeed")
    private Integer maxZoomSpeed;
    @Basic(optional = false)
    @Column(name = "CanFocus")
    private short canFocus;
    @Basic(optional = false)
    @Column(name = "CanAutoFocus")
    private short canAutoFocus;
    @Basic(optional = false)
    @Column(name = "CanFocusAbs")
    private short canFocusAbs;
    @Basic(optional = false)
    @Column(name = "CanFocusRel")
    private short canFocusRel;
    @Basic(optional = false)
    @Column(name = "CanFocusCon")
    private short canFocusCon;
    @Column(name = "MinFocusRange")
    private Integer minFocusRange;
    @Column(name = "MaxFocusRange")
    private Integer maxFocusRange;
    @Column(name = "MinFocusStep")
    private Integer minFocusStep;
    @Column(name = "MaxFocusStep")
    private Integer maxFocusStep;
    @Basic(optional = false)
    @Column(name = "HasFocusSpeed")
    private short hasFocusSpeed;
    @Column(name = "MinFocusSpeed")
    private Integer minFocusSpeed;
    @Column(name = "MaxFocusSpeed")
    private Integer maxFocusSpeed;
    @Basic(optional = false)
    @Column(name = "CanIris")
    private short canIris;
    @Basic(optional = false)
    @Column(name = "CanAutoIris")
    private short canAutoIris;
    @Basic(optional = false)
    @Column(name = "CanIrisAbs")
    private short canIrisAbs;
    @Basic(optional = false)
    @Column(name = "CanIrisRel")
    private short canIrisRel;
    @Basic(optional = false)
    @Column(name = "CanIrisCon")
    private short canIrisCon;
    @Column(name = "MinIrisRange")
    private Integer minIrisRange;
    @Column(name = "MaxIrisRange")
    private Integer maxIrisRange;
    @Column(name = "MinIrisStep")
    private Integer minIrisStep;
    @Column(name = "MaxIrisStep")
    private Integer maxIrisStep;
    @Basic(optional = false)
    @Column(name = "HasIrisSpeed")
    private short hasIrisSpeed;
    @Column(name = "MinIrisSpeed")
    private Integer minIrisSpeed;
    @Column(name = "MaxIrisSpeed")
    private Integer maxIrisSpeed;
    @Basic(optional = false)
    @Column(name = "CanGain")
    private short canGain;
    @Basic(optional = false)
    @Column(name = "CanAutoGain")
    private short canAutoGain;
    @Basic(optional = false)
    @Column(name = "CanGainAbs")
    private short canGainAbs;
    @Basic(optional = false)
    @Column(name = "CanGainRel")
    private short canGainRel;
    @Basic(optional = false)
    @Column(name = "CanGainCon")
    private short canGainCon;
    @Column(name = "MinGainRange")
    private Integer minGainRange;
    @Column(name = "MaxGainRange")
    private Integer maxGainRange;
    @Column(name = "MinGainStep")
    private Integer minGainStep;
    @Column(name = "MaxGainStep")
    private Integer maxGainStep;
    @Basic(optional = false)
    @Column(name = "HasGainSpeed")
    private short hasGainSpeed;
    @Column(name = "MinGainSpeed")
    private Integer minGainSpeed;
    @Column(name = "MaxGainSpeed")
    private Integer maxGainSpeed;
    @Basic(optional = false)
    @Column(name = "CanWhite")
    private short canWhite;
    @Basic(optional = false)
    @Column(name = "CanAutoWhite")
    private short canAutoWhite;
    @Basic(optional = false)
    @Column(name = "CanWhiteAbs")
    private short canWhiteAbs;
    @Basic(optional = false)
    @Column(name = "CanWhiteRel")
    private short canWhiteRel;
    @Basic(optional = false)
    @Column(name = "CanWhiteCon")
    private short canWhiteCon;
    @Column(name = "MinWhiteRange")
    private Integer minWhiteRange;
    @Column(name = "MaxWhiteRange")
    private Integer maxWhiteRange;
    @Column(name = "MinWhiteStep")
    private Integer minWhiteStep;
    @Column(name = "MaxWhiteStep")
    private Integer maxWhiteStep;
    @Basic(optional = false)
    @Column(name = "HasWhiteSpeed")
    private short hasWhiteSpeed;
    @Column(name = "MinWhiteSpeed")
    private Integer minWhiteSpeed;
    @Column(name = "MaxWhiteSpeed")
    private Integer maxWhiteSpeed;
    @Basic(optional = false)
    @Column(name = "HasPresets")
    private short hasPresets;
    @Basic(optional = false)
    @Column(name = "NumPresets")
    private short numPresets;
    @Basic(optional = false)
    @Column(name = "HasHomePreset")
    private short hasHomePreset;
    @Basic(optional = false)
    @Column(name = "CanSetPresets")
    private short canSetPresets;
    @Basic(optional = false)
    @Column(name = "CanMove")
    private short canMove;
    @Basic(optional = false)
    @Column(name = "CanMoveDiag")
    private short canMoveDiag;
    @Basic(optional = false)
    @Column(name = "CanMoveMap")
    private short canMoveMap;
    @Basic(optional = false)
    @Column(name = "CanMoveAbs")
    private short canMoveAbs;
    @Basic(optional = false)
    @Column(name = "CanMoveRel")
    private short canMoveRel;
    @Basic(optional = false)
    @Column(name = "CanMoveCon")
    private short canMoveCon;
    @Basic(optional = false)
    @Column(name = "CanPan")
    private short canPan;
    @Column(name = "MinPanRange")
    private Integer minPanRange;
    @Column(name = "MaxPanRange")
    private Integer maxPanRange;
    @Column(name = "MinPanStep")
    private Integer minPanStep;
    @Column(name = "MaxPanStep")
    private Integer maxPanStep;
    @Basic(optional = false)
    @Column(name = "HasPanSpeed")
    private short hasPanSpeed;
    @Column(name = "MinPanSpeed")
    private Integer minPanSpeed;
    @Column(name = "MaxPanSpeed")
    private Integer maxPanSpeed;
    @Basic(optional = false)
    @Column(name = "HasTurboPan")
    private short hasTurboPan;
    @Column(name = "TurboPanSpeed")
    private Integer turboPanSpeed;
    @Basic(optional = false)
    @Column(name = "CanTilt")
    private short canTilt;
    @Column(name = "MinTiltRange")
    private Integer minTiltRange;
    @Column(name = "MaxTiltRange")
    private Integer maxTiltRange;
    @Column(name = "MinTiltStep")
    private Integer minTiltStep;
    @Column(name = "MaxTiltStep")
    private Integer maxTiltStep;
    @Basic(optional = false)
    @Column(name = "HasTiltSpeed")
    private short hasTiltSpeed;
    @Column(name = "MinTiltSpeed")
    private Integer minTiltSpeed;
    @Column(name = "MaxTiltSpeed")
    private Integer maxTiltSpeed;
    @Basic(optional = false)
    @Column(name = "HasTurboTilt")
    private short hasTurboTilt;
    @Column(name = "TurboTiltSpeed")
    private Integer turboTiltSpeed;
    @Basic(optional = false)
    @Column(name = "CanAutoScan")
    private short canAutoScan;
    @Basic(optional = false)
    @Column(name = "NumScanPaths")
    private short numScanPaths;

    public Controls() {
    }

    public Controls(Integer id) {
        this.id = id;
    }

    public Controls(Integer id, String name, String type, short canWake, short canSleep, short canReset, short canZoom, short canAutoZoom, short canZoomAbs, short canZoomRel, short canZoomCon, short hasZoomSpeed, short canFocus, short canAutoFocus, short canFocusAbs, short canFocusRel, short canFocusCon, short hasFocusSpeed, short canIris, short canAutoIris, short canIrisAbs, short canIrisRel, short canIrisCon, short hasIrisSpeed, short canGain, short canAutoGain, short canGainAbs, short canGainRel, short canGainCon, short hasGainSpeed, short canWhite, short canAutoWhite, short canWhiteAbs, short canWhiteRel, short canWhiteCon, short hasWhiteSpeed, short hasPresets, short numPresets, short hasHomePreset, short canSetPresets, short canMove, short canMoveDiag, short canMoveMap, short canMoveAbs, short canMoveRel, short canMoveCon, short canPan, short hasPanSpeed, short hasTurboPan, short canTilt, short hasTiltSpeed, short hasTurboTilt, short canAutoScan, short numScanPaths) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.canWake = canWake;
        this.canSleep = canSleep;
        this.canReset = canReset;
        this.canZoom = canZoom;
        this.canAutoZoom = canAutoZoom;
        this.canZoomAbs = canZoomAbs;
        this.canZoomRel = canZoomRel;
        this.canZoomCon = canZoomCon;
        this.hasZoomSpeed = hasZoomSpeed;
        this.canFocus = canFocus;
        this.canAutoFocus = canAutoFocus;
        this.canFocusAbs = canFocusAbs;
        this.canFocusRel = canFocusRel;
        this.canFocusCon = canFocusCon;
        this.hasFocusSpeed = hasFocusSpeed;
        this.canIris = canIris;
        this.canAutoIris = canAutoIris;
        this.canIrisAbs = canIrisAbs;
        this.canIrisRel = canIrisRel;
        this.canIrisCon = canIrisCon;
        this.hasIrisSpeed = hasIrisSpeed;
        this.canGain = canGain;
        this.canAutoGain = canAutoGain;
        this.canGainAbs = canGainAbs;
        this.canGainRel = canGainRel;
        this.canGainCon = canGainCon;
        this.hasGainSpeed = hasGainSpeed;
        this.canWhite = canWhite;
        this.canAutoWhite = canAutoWhite;
        this.canWhiteAbs = canWhiteAbs;
        this.canWhiteRel = canWhiteRel;
        this.canWhiteCon = canWhiteCon;
        this.hasWhiteSpeed = hasWhiteSpeed;
        this.hasPresets = hasPresets;
        this.numPresets = numPresets;
        this.hasHomePreset = hasHomePreset;
        this.canSetPresets = canSetPresets;
        this.canMove = canMove;
        this.canMoveDiag = canMoveDiag;
        this.canMoveMap = canMoveMap;
        this.canMoveAbs = canMoveAbs;
        this.canMoveRel = canMoveRel;
        this.canMoveCon = canMoveCon;
        this.canPan = canPan;
        this.hasPanSpeed = hasPanSpeed;
        this.hasTurboPan = hasTurboPan;
        this.canTilt = canTilt;
        this.hasTiltSpeed = hasTiltSpeed;
        this.hasTurboTilt = hasTurboTilt;
        this.canAutoScan = canAutoScan;
        this.numScanPaths = numScanPaths;
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

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public short getCanWake() {
        return canWake;
    }

    public void setCanWake(short canWake) {
        this.canWake = canWake;
    }

    public short getCanSleep() {
        return canSleep;
    }

    public void setCanSleep(short canSleep) {
        this.canSleep = canSleep;
    }

    public short getCanReset() {
        return canReset;
    }

    public void setCanReset(short canReset) {
        this.canReset = canReset;
    }

    public short getCanZoom() {
        return canZoom;
    }

    public void setCanZoom(short canZoom) {
        this.canZoom = canZoom;
    }

    public short getCanAutoZoom() {
        return canAutoZoom;
    }

    public void setCanAutoZoom(short canAutoZoom) {
        this.canAutoZoom = canAutoZoom;
    }

    public short getCanZoomAbs() {
        return canZoomAbs;
    }

    public void setCanZoomAbs(short canZoomAbs) {
        this.canZoomAbs = canZoomAbs;
    }

    public short getCanZoomRel() {
        return canZoomRel;
    }

    public void setCanZoomRel(short canZoomRel) {
        this.canZoomRel = canZoomRel;
    }

    public short getCanZoomCon() {
        return canZoomCon;
    }

    public void setCanZoomCon(short canZoomCon) {
        this.canZoomCon = canZoomCon;
    }

    public Integer getMinZoomRange() {
        return minZoomRange;
    }

    public void setMinZoomRange(Integer minZoomRange) {
        this.minZoomRange = minZoomRange;
    }

    public Integer getMaxZoomRange() {
        return maxZoomRange;
    }

    public void setMaxZoomRange(Integer maxZoomRange) {
        this.maxZoomRange = maxZoomRange;
    }

    public Integer getMinZoomStep() {
        return minZoomStep;
    }

    public void setMinZoomStep(Integer minZoomStep) {
        this.minZoomStep = minZoomStep;
    }

    public Integer getMaxZoomStep() {
        return maxZoomStep;
    }

    public void setMaxZoomStep(Integer maxZoomStep) {
        this.maxZoomStep = maxZoomStep;
    }

    public short getHasZoomSpeed() {
        return hasZoomSpeed;
    }

    public void setHasZoomSpeed(short hasZoomSpeed) {
        this.hasZoomSpeed = hasZoomSpeed;
    }

    public Integer getMinZoomSpeed() {
        return minZoomSpeed;
    }

    public void setMinZoomSpeed(Integer minZoomSpeed) {
        this.minZoomSpeed = minZoomSpeed;
    }

    public Integer getMaxZoomSpeed() {
        return maxZoomSpeed;
    }

    public void setMaxZoomSpeed(Integer maxZoomSpeed) {
        this.maxZoomSpeed = maxZoomSpeed;
    }

    public short getCanFocus() {
        return canFocus;
    }

    public void setCanFocus(short canFocus) {
        this.canFocus = canFocus;
    }

    public short getCanAutoFocus() {
        return canAutoFocus;
    }

    public void setCanAutoFocus(short canAutoFocus) {
        this.canAutoFocus = canAutoFocus;
    }

    public short getCanFocusAbs() {
        return canFocusAbs;
    }

    public void setCanFocusAbs(short canFocusAbs) {
        this.canFocusAbs = canFocusAbs;
    }

    public short getCanFocusRel() {
        return canFocusRel;
    }

    public void setCanFocusRel(short canFocusRel) {
        this.canFocusRel = canFocusRel;
    }

    public short getCanFocusCon() {
        return canFocusCon;
    }

    public void setCanFocusCon(short canFocusCon) {
        this.canFocusCon = canFocusCon;
    }

    public Integer getMinFocusRange() {
        return minFocusRange;
    }

    public void setMinFocusRange(Integer minFocusRange) {
        this.minFocusRange = minFocusRange;
    }

    public Integer getMaxFocusRange() {
        return maxFocusRange;
    }

    public void setMaxFocusRange(Integer maxFocusRange) {
        this.maxFocusRange = maxFocusRange;
    }

    public Integer getMinFocusStep() {
        return minFocusStep;
    }

    public void setMinFocusStep(Integer minFocusStep) {
        this.minFocusStep = minFocusStep;
    }

    public Integer getMaxFocusStep() {
        return maxFocusStep;
    }

    public void setMaxFocusStep(Integer maxFocusStep) {
        this.maxFocusStep = maxFocusStep;
    }

    public short getHasFocusSpeed() {
        return hasFocusSpeed;
    }

    public void setHasFocusSpeed(short hasFocusSpeed) {
        this.hasFocusSpeed = hasFocusSpeed;
    }

    public Integer getMinFocusSpeed() {
        return minFocusSpeed;
    }

    public void setMinFocusSpeed(Integer minFocusSpeed) {
        this.minFocusSpeed = minFocusSpeed;
    }

    public Integer getMaxFocusSpeed() {
        return maxFocusSpeed;
    }

    public void setMaxFocusSpeed(Integer maxFocusSpeed) {
        this.maxFocusSpeed = maxFocusSpeed;
    }

    public short getCanIris() {
        return canIris;
    }

    public void setCanIris(short canIris) {
        this.canIris = canIris;
    }

    public short getCanAutoIris() {
        return canAutoIris;
    }

    public void setCanAutoIris(short canAutoIris) {
        this.canAutoIris = canAutoIris;
    }

    public short getCanIrisAbs() {
        return canIrisAbs;
    }

    public void setCanIrisAbs(short canIrisAbs) {
        this.canIrisAbs = canIrisAbs;
    }

    public short getCanIrisRel() {
        return canIrisRel;
    }

    public void setCanIrisRel(short canIrisRel) {
        this.canIrisRel = canIrisRel;
    }

    public short getCanIrisCon() {
        return canIrisCon;
    }

    public void setCanIrisCon(short canIrisCon) {
        this.canIrisCon = canIrisCon;
    }

    public Integer getMinIrisRange() {
        return minIrisRange;
    }

    public void setMinIrisRange(Integer minIrisRange) {
        this.minIrisRange = minIrisRange;
    }

    public Integer getMaxIrisRange() {
        return maxIrisRange;
    }

    public void setMaxIrisRange(Integer maxIrisRange) {
        this.maxIrisRange = maxIrisRange;
    }

    public Integer getMinIrisStep() {
        return minIrisStep;
    }

    public void setMinIrisStep(Integer minIrisStep) {
        this.minIrisStep = minIrisStep;
    }

    public Integer getMaxIrisStep() {
        return maxIrisStep;
    }

    public void setMaxIrisStep(Integer maxIrisStep) {
        this.maxIrisStep = maxIrisStep;
    }

    public short getHasIrisSpeed() {
        return hasIrisSpeed;
    }

    public void setHasIrisSpeed(short hasIrisSpeed) {
        this.hasIrisSpeed = hasIrisSpeed;
    }

    public Integer getMinIrisSpeed() {
        return minIrisSpeed;
    }

    public void setMinIrisSpeed(Integer minIrisSpeed) {
        this.minIrisSpeed = minIrisSpeed;
    }

    public Integer getMaxIrisSpeed() {
        return maxIrisSpeed;
    }

    public void setMaxIrisSpeed(Integer maxIrisSpeed) {
        this.maxIrisSpeed = maxIrisSpeed;
    }

    public short getCanGain() {
        return canGain;
    }

    public void setCanGain(short canGain) {
        this.canGain = canGain;
    }

    public short getCanAutoGain() {
        return canAutoGain;
    }

    public void setCanAutoGain(short canAutoGain) {
        this.canAutoGain = canAutoGain;
    }

    public short getCanGainAbs() {
        return canGainAbs;
    }

    public void setCanGainAbs(short canGainAbs) {
        this.canGainAbs = canGainAbs;
    }

    public short getCanGainRel() {
        return canGainRel;
    }

    public void setCanGainRel(short canGainRel) {
        this.canGainRel = canGainRel;
    }

    public short getCanGainCon() {
        return canGainCon;
    }

    public void setCanGainCon(short canGainCon) {
        this.canGainCon = canGainCon;
    }

    public Integer getMinGainRange() {
        return minGainRange;
    }

    public void setMinGainRange(Integer minGainRange) {
        this.minGainRange = minGainRange;
    }

    public Integer getMaxGainRange() {
        return maxGainRange;
    }

    public void setMaxGainRange(Integer maxGainRange) {
        this.maxGainRange = maxGainRange;
    }

    public Integer getMinGainStep() {
        return minGainStep;
    }

    public void setMinGainStep(Integer minGainStep) {
        this.minGainStep = minGainStep;
    }

    public Integer getMaxGainStep() {
        return maxGainStep;
    }

    public void setMaxGainStep(Integer maxGainStep) {
        this.maxGainStep = maxGainStep;
    }

    public short getHasGainSpeed() {
        return hasGainSpeed;
    }

    public void setHasGainSpeed(short hasGainSpeed) {
        this.hasGainSpeed = hasGainSpeed;
    }

    public Integer getMinGainSpeed() {
        return minGainSpeed;
    }

    public void setMinGainSpeed(Integer minGainSpeed) {
        this.minGainSpeed = minGainSpeed;
    }

    public Integer getMaxGainSpeed() {
        return maxGainSpeed;
    }

    public void setMaxGainSpeed(Integer maxGainSpeed) {
        this.maxGainSpeed = maxGainSpeed;
    }

    public short getCanWhite() {
        return canWhite;
    }

    public void setCanWhite(short canWhite) {
        this.canWhite = canWhite;
    }

    public short getCanAutoWhite() {
        return canAutoWhite;
    }

    public void setCanAutoWhite(short canAutoWhite) {
        this.canAutoWhite = canAutoWhite;
    }

    public short getCanWhiteAbs() {
        return canWhiteAbs;
    }

    public void setCanWhiteAbs(short canWhiteAbs) {
        this.canWhiteAbs = canWhiteAbs;
    }

    public short getCanWhiteRel() {
        return canWhiteRel;
    }

    public void setCanWhiteRel(short canWhiteRel) {
        this.canWhiteRel = canWhiteRel;
    }

    public short getCanWhiteCon() {
        return canWhiteCon;
    }

    public void setCanWhiteCon(short canWhiteCon) {
        this.canWhiteCon = canWhiteCon;
    }

    public Integer getMinWhiteRange() {
        return minWhiteRange;
    }

    public void setMinWhiteRange(Integer minWhiteRange) {
        this.minWhiteRange = minWhiteRange;
    }

    public Integer getMaxWhiteRange() {
        return maxWhiteRange;
    }

    public void setMaxWhiteRange(Integer maxWhiteRange) {
        this.maxWhiteRange = maxWhiteRange;
    }

    public Integer getMinWhiteStep() {
        return minWhiteStep;
    }

    public void setMinWhiteStep(Integer minWhiteStep) {
        this.minWhiteStep = minWhiteStep;
    }

    public Integer getMaxWhiteStep() {
        return maxWhiteStep;
    }

    public void setMaxWhiteStep(Integer maxWhiteStep) {
        this.maxWhiteStep = maxWhiteStep;
    }

    public short getHasWhiteSpeed() {
        return hasWhiteSpeed;
    }

    public void setHasWhiteSpeed(short hasWhiteSpeed) {
        this.hasWhiteSpeed = hasWhiteSpeed;
    }

    public Integer getMinWhiteSpeed() {
        return minWhiteSpeed;
    }

    public void setMinWhiteSpeed(Integer minWhiteSpeed) {
        this.minWhiteSpeed = minWhiteSpeed;
    }

    public Integer getMaxWhiteSpeed() {
        return maxWhiteSpeed;
    }

    public void setMaxWhiteSpeed(Integer maxWhiteSpeed) {
        this.maxWhiteSpeed = maxWhiteSpeed;
    }

    public short getHasPresets() {
        return hasPresets;
    }

    public void setHasPresets(short hasPresets) {
        this.hasPresets = hasPresets;
    }

    public short getNumPresets() {
        return numPresets;
    }

    public void setNumPresets(short numPresets) {
        this.numPresets = numPresets;
    }

    public short getHasHomePreset() {
        return hasHomePreset;
    }

    public void setHasHomePreset(short hasHomePreset) {
        this.hasHomePreset = hasHomePreset;
    }

    public short getCanSetPresets() {
        return canSetPresets;
    }

    public void setCanSetPresets(short canSetPresets) {
        this.canSetPresets = canSetPresets;
    }

    public short getCanMove() {
        return canMove;
    }

    public void setCanMove(short canMove) {
        this.canMove = canMove;
    }

    public short getCanMoveDiag() {
        return canMoveDiag;
    }

    public void setCanMoveDiag(short canMoveDiag) {
        this.canMoveDiag = canMoveDiag;
    }

    public short getCanMoveMap() {
        return canMoveMap;
    }

    public void setCanMoveMap(short canMoveMap) {
        this.canMoveMap = canMoveMap;
    }

    public short getCanMoveAbs() {
        return canMoveAbs;
    }

    public void setCanMoveAbs(short canMoveAbs) {
        this.canMoveAbs = canMoveAbs;
    }

    public short getCanMoveRel() {
        return canMoveRel;
    }

    public void setCanMoveRel(short canMoveRel) {
        this.canMoveRel = canMoveRel;
    }

    public short getCanMoveCon() {
        return canMoveCon;
    }

    public void setCanMoveCon(short canMoveCon) {
        this.canMoveCon = canMoveCon;
    }

    public short getCanPan() {
        return canPan;
    }

    public void setCanPan(short canPan) {
        this.canPan = canPan;
    }

    public Integer getMinPanRange() {
        return minPanRange;
    }

    public void setMinPanRange(Integer minPanRange) {
        this.minPanRange = minPanRange;
    }

    public Integer getMaxPanRange() {
        return maxPanRange;
    }

    public void setMaxPanRange(Integer maxPanRange) {
        this.maxPanRange = maxPanRange;
    }

    public Integer getMinPanStep() {
        return minPanStep;
    }

    public void setMinPanStep(Integer minPanStep) {
        this.minPanStep = minPanStep;
    }

    public Integer getMaxPanStep() {
        return maxPanStep;
    }

    public void setMaxPanStep(Integer maxPanStep) {
        this.maxPanStep = maxPanStep;
    }

    public short getHasPanSpeed() {
        return hasPanSpeed;
    }

    public void setHasPanSpeed(short hasPanSpeed) {
        this.hasPanSpeed = hasPanSpeed;
    }

    public Integer getMinPanSpeed() {
        return minPanSpeed;
    }

    public void setMinPanSpeed(Integer minPanSpeed) {
        this.minPanSpeed = minPanSpeed;
    }

    public Integer getMaxPanSpeed() {
        return maxPanSpeed;
    }

    public void setMaxPanSpeed(Integer maxPanSpeed) {
        this.maxPanSpeed = maxPanSpeed;
    }

    public short getHasTurboPan() {
        return hasTurboPan;
    }

    public void setHasTurboPan(short hasTurboPan) {
        this.hasTurboPan = hasTurboPan;
    }

    public Integer getTurboPanSpeed() {
        return turboPanSpeed;
    }

    public void setTurboPanSpeed(Integer turboPanSpeed) {
        this.turboPanSpeed = turboPanSpeed;
    }

    public short getCanTilt() {
        return canTilt;
    }

    public void setCanTilt(short canTilt) {
        this.canTilt = canTilt;
    }

    public Integer getMinTiltRange() {
        return minTiltRange;
    }

    public void setMinTiltRange(Integer minTiltRange) {
        this.minTiltRange = minTiltRange;
    }

    public Integer getMaxTiltRange() {
        return maxTiltRange;
    }

    public void setMaxTiltRange(Integer maxTiltRange) {
        this.maxTiltRange = maxTiltRange;
    }

    public Integer getMinTiltStep() {
        return minTiltStep;
    }

    public void setMinTiltStep(Integer minTiltStep) {
        this.minTiltStep = minTiltStep;
    }

    public Integer getMaxTiltStep() {
        return maxTiltStep;
    }

    public void setMaxTiltStep(Integer maxTiltStep) {
        this.maxTiltStep = maxTiltStep;
    }

    public short getHasTiltSpeed() {
        return hasTiltSpeed;
    }

    public void setHasTiltSpeed(short hasTiltSpeed) {
        this.hasTiltSpeed = hasTiltSpeed;
    }

    public Integer getMinTiltSpeed() {
        return minTiltSpeed;
    }

    public void setMinTiltSpeed(Integer minTiltSpeed) {
        this.minTiltSpeed = minTiltSpeed;
    }

    public Integer getMaxTiltSpeed() {
        return maxTiltSpeed;
    }

    public void setMaxTiltSpeed(Integer maxTiltSpeed) {
        this.maxTiltSpeed = maxTiltSpeed;
    }

    public short getHasTurboTilt() {
        return hasTurboTilt;
    }

    public void setHasTurboTilt(short hasTurboTilt) {
        this.hasTurboTilt = hasTurboTilt;
    }

    public Integer getTurboTiltSpeed() {
        return turboTiltSpeed;
    }

    public void setTurboTiltSpeed(Integer turboTiltSpeed) {
        this.turboTiltSpeed = turboTiltSpeed;
    }

    public short getCanAutoScan() {
        return canAutoScan;
    }

    public void setCanAutoScan(short canAutoScan) {
        this.canAutoScan = canAutoScan;
    }

    public short getNumScanPaths() {
        return numScanPaths;
    }

    public void setNumScanPaths(short numScanPaths) {
        this.numScanPaths = numScanPaths;
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
        if (!(object instanceof Controls)) {
            return false;
        }
        Controls other = (Controls) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.carljmosca.zmjet.entity.Controls[ id=" + id + " ]";
    }
    
}
