package com.AndroidHttpsClientJava.model;

import com.google.gson.annotations.SerializedName;


public class CreateNewSiteData {

    @SerializedName("CustomerId")
    private String CustomerId;
    @SerializedName("SiteId")
    private String SiteId;
    @SerializedName("SiteName")
    private String SiteName;
    @SerializedName("ConstructionCompany")
    private String ConstructionCompany;
    @SerializedName("Address")
    private String Address;
    @SerializedName("CityId")
    private String CityId;
    @SerializedName("DistrictId")
    private String DistrictId;
    @SerializedName("CountryId")
    private String CountryId;
    @SerializedName("SiteBlockId")
    private String SiteBlockId;
    @SerializedName("ApartmentId")
    private String ApartmentId;
    @SerializedName("ResidentType")
    private String ResidentType;
    @SerializedName("PostalCode")
    private String PostalCode;
    @SerializedName("Currency")
    private String Currency;
    @SerializedName("Phone")
    private String Phone;
    @SerializedName("CreatedDate")
    private String CreatedDate;
    @SerializedName("ModifiedDate")
    private String ModifiedDate;
    @SerializedName("Active")
    private String Active;
    @SerializedName("LogoPicId")
    private String LogoPicId;
    @SerializedName("FacebookPage")
    private String FacebookPage;
    @SerializedName("TwitterPage")
    private String TwitterPage;
    @SerializedName("InstagramPage")
    private String InstagramPage;
    @SerializedName("GooglePage")
    private String GooglePage;
    @SerializedName("LinkedinPage")
    private String LinkedinPage;
    @SerializedName("SiteCode")
    private String SiteCode;
    @SerializedName("SiteLicenceInfo")
    private String SiteLicenceInfo;
    @SerializedName("Email")
    private String Email;
    @SerializedName("SMSProvider")
    private String SMSProvider;
    @SerializedName("MaxApartmentCount")
    private String MaxApartmentCount;
    @SerializedName("LicenseStartDate")
    private String LicenseStartDate;
    @SerializedName("LicenseEndDate")
    private String LicenseEndDate;
    @SerializedName("IsExpiryApproaching")
    private String IsExpiryApproaching;
    @SerializedName("TotalM2")
    private String TotalM2;
    @SerializedName("msgHeader")
    private String msgHeader;
    @SerializedName("Id")
    private String Id;


    @Override
    public String toString() {
        return "CreateNewSiteData{" +
                "CustomerId='" + CustomerId + '\'' +
                ", SiteId='" + SiteId + '\'' +
                ", SiteName='" + SiteName + '\'' +
                ", ConstructionCompany='" + ConstructionCompany + '\'' +
                ", Address='" + Address + '\'' +
                ", CityId='" + CityId + '\'' +
                ", DistrictId='" + DistrictId + '\'' +
                ", CountryId='" + CountryId + '\'' +
                ", SiteBlockId='" + SiteBlockId + '\'' +
                ", ApartmentId='" + ApartmentId + '\'' +
                ", ResidentType='" + ResidentType + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Currency='" + Currency + '\'' +
                ", Phone='" + Phone + '\'' +
                ", CreatedDate='" + CreatedDate + '\'' +
                ", ModifiedDate='" + ModifiedDate + '\'' +
                ", Active='" + Active + '\'' +
                ", LogoPicId='" + LogoPicId + '\'' +
                ", FacebookPage='" + FacebookPage + '\'' +
                ", TwitterPage='" + TwitterPage + '\'' +
                ", InstagramPage='" + InstagramPage + '\'' +
                ", GooglePage='" + GooglePage + '\'' +
                ", LinkedinPage='" + LinkedinPage + '\'' +
                ", SiteCode='" + SiteCode + '\'' +
                ", SiteLicenceInfo='" + SiteLicenceInfo + '\'' +
                ", Email='" + Email + '\'' +
                ", SMSProvider='" + SMSProvider + '\'' +
                ", MaxApartmentCount='" + MaxApartmentCount + '\'' +
                ", LicenseStartDate='" + LicenseStartDate + '\'' +
                ", LicenseEndDate='" + LicenseEndDate + '\'' +
                ", IsExpiryApproaching='" + IsExpiryApproaching + '\'' +
                ", TotalM2='" + TotalM2 + '\'' +
                ", msgHeader='" + msgHeader + '\'' +
                ", Id='" + Id + '\'' +
                '}';
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getSiteId() {
        return SiteId;
    }

    public void setSiteId(String siteId) {
        SiteId = siteId;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }

    public String getConstructionCompany() {
        return ConstructionCompany;
    }

    public void setConstructionCompany(String constructionCompany) {
        ConstructionCompany = constructionCompany;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String cityId) {
        CityId = cityId;
    }

    public String getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(String districtId) {
        DistrictId = districtId;
    }

    public String getCountryId() {
        return CountryId;
    }

    public void setCountryId(String countryId) {
        CountryId = countryId;
    }

    public String getSiteBlockId() {
        return SiteBlockId;
    }

    public void setSiteBlockId(String siteBlockId) {
        SiteBlockId = siteBlockId;
    }

    public String getApartmentId() {
        return ApartmentId;
    }

    public void setApartmentId(String apartmentId) {
        ApartmentId = apartmentId;
    }

    public String getResidentType() {
        return ResidentType;
    }

    public void setResidentType(String residentType) {
        ResidentType = residentType;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getLogoPicId() {
        return LogoPicId;
    }

    public void setLogoPicId(String logoPicId) {
        LogoPicId = logoPicId;
    }

    public String getFacebookPage() {
        return FacebookPage;
    }

    public void setFacebookPage(String facebookPage) {
        FacebookPage = facebookPage;
    }

    public String getTwitterPage() {
        return TwitterPage;
    }

    public void setTwitterPage(String twitterPage) {
        TwitterPage = twitterPage;
    }

    public String getInstagramPage() {
        return InstagramPage;
    }

    public void setInstagramPage(String instagramPage) {
        InstagramPage = instagramPage;
    }

    public String getGooglePage() {
        return GooglePage;
    }

    public void setGooglePage(String googlePage) {
        GooglePage = googlePage;
    }

    public String getLinkedinPage() {
        return LinkedinPage;
    }

    public void setLinkedinPage(String linkedinPage) {
        LinkedinPage = linkedinPage;
    }

    public String getSiteCode() {
        return SiteCode;
    }

    public void setSiteCode(String siteCode) {
        SiteCode = siteCode;
    }

    public String getSiteLicenceInfo() {
        return SiteLicenceInfo;
    }

    public void setSiteLicenceInfo(String siteLicenceInfo) {
        SiteLicenceInfo = siteLicenceInfo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSMSProvider() {
        return SMSProvider;
    }

    public void setSMSProvider(String SMSProvider) {
        this.SMSProvider = SMSProvider;
    }

    public String getMaxApartmentCount() {
        return MaxApartmentCount;
    }

    public void setMaxApartmentCount(String maxApartmentCount) {
        MaxApartmentCount = maxApartmentCount;
    }

    public String getLicenseStartDate() {
        return LicenseStartDate;
    }

    public void setLicenseStartDate(String licenseStartDate) {
        LicenseStartDate = licenseStartDate;
    }

    public String getLicenseEndDate() {
        return LicenseEndDate;
    }

    public void setLicenseEndDate(String licenseEndDate) {
        LicenseEndDate = licenseEndDate;
    }

    public String getIsExpiryApproaching() {
        return IsExpiryApproaching;
    }

    public void setIsExpiryApproaching(String isExpiryApproaching) {
        IsExpiryApproaching = isExpiryApproaching;
    }

    public String getTotalM2() {
        return TotalM2;
    }

    public void setTotalM2(String totalM2) {
        TotalM2 = totalM2;
    }

    public String getMsgHeader() {
        return msgHeader;
    }

    public void setMsgHeader(String msgHeader) {
        this.msgHeader = msgHeader;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
