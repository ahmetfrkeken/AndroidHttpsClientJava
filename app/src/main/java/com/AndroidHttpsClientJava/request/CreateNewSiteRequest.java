package com.AndroidHttpsClientJava.request;

public class CreateNewSiteRequest extends Request{

    private int countryId;
    private int cityId;
    private int districtId;
    private int postalCode;
    private String siteName;
    private String constructionCompany;
    private String phone;
    private String currency;
    private String address;
    private String facebookPage;
    private String twitterPage;
    private String instagramPage;
    private String linkedinPage;


    public String getFacebookPage() {
        return facebookPage;
    }

    public void setFacebookPage(String facebookPage) {
        this.facebookPage = facebookPage;
    }

    public String getTwitterPage() {
        return twitterPage;
    }

    public void setTwitterPage(String twitterPage) {
        this.twitterPage = twitterPage;
    }

    public String getInstagramPage() {
        return instagramPage;
    }

    public void setInstagramPage(String instagramPage) {
        this.instagramPage = instagramPage;
    }

    public String getLinkedinPage() {
        return linkedinPage;
    }

    public void setLinkedinPage(String linkedinPage) {
        this.linkedinPage = linkedinPage;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getConstructionCompany() {
        return constructionCompany;
    }

    public void setConstructionCompany(String constructionCompany) {
        this.constructionCompany = constructionCompany;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "CreateNewSiteRequest{" +
                "countryId=" + countryId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", siteName='" + siteName + '\'' +
                ", constructionCompany='" + constructionCompany + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", currency='" + currency + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
