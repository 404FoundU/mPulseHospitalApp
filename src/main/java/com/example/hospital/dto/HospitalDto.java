package com.example.hospital.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HospitalDto {

    @JsonProperty("region")
    private String region;

    @JsonProperty("region_code")
    private String regionCode;

    @JsonProperty("period")
    private String period;

    @JsonProperty("pct_md_pa_np_mu_aiu")
    private String pctMdPaNpMuAiu;

    @JsonProperty("pct_md_pa_np_mu")
    private String pctMdPaNpMu;

    @JsonProperty("pct_md_mu_aiu")
    private String pctMdMuAiu;

    @JsonProperty("pct_md_mu")
    private String pctMdMu;

    @JsonProperty("pct_np_mu_aiu")
    private String pctNpMuAiu;

    @JsonProperty("pct_np_mu")
    private String pctNpMu;

    @JsonProperty("pct_pa_mu_aiu")
    private String pctPaMuAiu;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPctMdPaNpMuAiu() {
        return pctMdPaNpMuAiu;
    }

    public void setPctMdPaNpMuAiu(String pctMdPaNpMuAiu) {
        this.pctMdPaNpMuAiu = pctMdPaNpMuAiu;
    }

    public String getPctMdPaNpMu() {
        return pctMdPaNpMu;
    }

    public void setPctMdPaNpMu(String pctMdPaNpMu) {
        this.pctMdPaNpMu = pctMdPaNpMu;
    }

    public String getPctMdMuAiu() {
        return pctMdMuAiu;
    }

    public void setPctMdMuAiu(String pctMdMuAiu) {
        this.pctMdMuAiu = pctMdMuAiu;
    }

    public String getPctMdMu() {
        return pctMdMu;
    }

    public void setPctMdMu(String pctMdMu) {
        this.pctMdMu = pctMdMu;
    }

    public String getPctNpMuAiu() {
        return pctNpMuAiu;
    }

    public void setPctNpMuAiu(String pctNpMuAiu) {
        this.pctNpMuAiu = pctNpMuAiu;
    }

    public String getPctNpMu() {
        return pctNpMu;
    }

    public void setPctNpMu(String pctNpMu) {
        this.pctNpMu = pctNpMu;
    }

    public String getPctPaMuAiu() {
        return pctPaMuAiu;
    }

    public void setPctPaMuAiu(String pctPaMuAiu) {
        this.pctPaMuAiu = pctPaMuAiu;
    }

    public String getPctPaMu() {
        return pctPaMu;
    }

    public void setPctPaMu(String pctPaMu) {
        this.pctPaMu = pctPaMu;
    }

    public String getPctHospitalsMuAiu() {
        return pctHospitalsMuAiu;
    }

    public void setPctHospitalsMuAiu(String pctHospitalsMuAiu) {
        this.pctHospitalsMuAiu = pctHospitalsMuAiu;
    }

    public String getPctHospitalsMu() {
        return pctHospitalsMu;
    }

    public void setPctHospitalsMu(String pctHospitalsMu) {
        this.pctHospitalsMu = pctHospitalsMu;
    }

    public String getPctCahSmallRuralMuAiu() {
        return pctCahSmallRuralMuAiu;
    }

    public void setPctCahSmallRuralMuAiu(String pctCahSmallRuralMuAiu) {
        this.pctCahSmallRuralMuAiu = pctCahSmallRuralMuAiu;
    }

    public String getPctCahSmallRuralMu() {
        return pctCahSmallRuralMu;
    }

    public void setPctCahSmallRuralMu(String pctCahSmallRuralMu) {
        this.pctCahSmallRuralMu = pctCahSmallRuralMu;
    }

    @JsonProperty("pct_pa_mu")
    private String pctPaMu;

    @JsonProperty("pct_hospitals_mu_aiu")
    private String pctHospitalsMuAiu;

    @JsonProperty("pct_hospitals_mu")
    private String pctHospitalsMu;

    @JsonProperty("pct_cah_small_rural_mu_aiu")
    private String pctCahSmallRuralMuAiu;

    @JsonProperty("pct_cah_small_rural_mu")
    private String pctCahSmallRuralMu;


    @Override
    public String toString() {
        return "HospitalDto{" +
                "region='" + region + '\'' +
                ", regionCode='" + regionCode + '\'' +
                ", period='" + period + '\'' +
                ", pctMdPaNpMuAiu='" + pctMdPaNpMuAiu + '\'' +
                ", pctMdPaNpMu='" + pctMdPaNpMu + '\'' +
                ", pctMdMuAiu='" + pctMdMuAiu + '\'' +
                ", pctMdMu='" + pctMdMu + '\'' +
                ", pctNpMuAiu='" + pctNpMuAiu + '\'' +
                ", pctNpMu='" + pctNpMu + '\'' +
                ", pctPaMuAiu='" + pctPaMuAiu + '\'' +
                ", pctPaMu='" + pctPaMu + '\'' +
                ", pctHospitalsMuAiu='" + pctHospitalsMuAiu + '\'' +
                ", pctHospitalsMu='" + pctHospitalsMu + '\'' +
                ", pctCahSmallRuralMuAiu='" + pctCahSmallRuralMuAiu + '\'' +
                ", pctCahSmallRuralMu='" + pctCahSmallRuralMu + '\'' +
                '}';
    }
}

