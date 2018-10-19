package com.mx.atrium.models;

public class AccountOwner {
    private String address;
    private String account_guid;
    private String city;
    private String country;
    private String email;
    private String guid;
    private String member_guid;
    private String owner_name;
    private String phone;
    private String postal_code;
    private String state;
    private String user_guid;

    public String getAddress() {
        return address;
    }

    public String getAccount_Guid() {
        return account_guid;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getGuid() {
        return guid;
    }

    public String getMember_Guid() {
        return member_guid;
    }

    public String getOwner_Name() {
        return owner_name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPostal_Code() {
        return postal_code;
    }

    public String getState() {
        return state;
    }

    public String getUser_Guid() {
        return user_guid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountOwner{");
        sb.append("address='").append(address).append('\'');
        sb.append(", account_guid='").append(account_guid).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", member_guid='").append(member_guid).append('\'');
        sb.append(", owner_name='").append(owner_name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", postal_code='").append(postal_code).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", user_guid='").append(user_guid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountOwner that = (AccountOwner) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (account_guid != null ? !account_guid.equals(that.account_guid) : that.account_guid != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (member_guid != null ? !member_guid.equals(that.member_guid) : that.member_guid != null) return false;
        if (owner_name != null ? !owner_name.equals(that.owner_name) : that.owner_name != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (postal_code != null ? !postal_code.equals(that.postal_code) : that.postal_code != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        return user_guid != null ? user_guid.equals(that.user_guid) : that.user_guid == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (account_guid != null ? account_guid.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (member_guid != null ? member_guid.hashCode() : 0);
        result = 31 * result + (owner_name != null ? owner_name.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (postal_code != null ? postal_code.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (user_guid != null ? user_guid.hashCode() : 0);
        return result;
    }
}
