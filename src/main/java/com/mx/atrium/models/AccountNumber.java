package com.mx.atrium.models;

public class AccountNumber {
    private String account_guid;
    private String account_number;
    private String guid;
    private String member_guid;
    private String routing_number;
    private String user_guid;

    public String getAccount_Guid() {
        return account_guid;
    }

    public String getAccount_Number() {
        return account_number;
    }

    public String getGuid() {
        return guid;
    }

    public String getMember_Guid() {
        return member_guid;
    }

    public String getRouting_Number() {
        return routing_number;
    }

    public String getUser_Guid() {
        return user_guid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountNumber{");
        sb.append("account_guid='").append(account_guid).append('\'');
        sb.append(", account_number='").append(account_number).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", member_guid='").append(member_guid).append('\'');
        sb.append(", routing_number='").append(routing_number).append('\'');
        sb.append(", user_guid='").append(user_guid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountNumber that = (AccountNumber) o;

        if (account_guid != null ? !account_guid.equals(that.account_guid) : that.account_guid != null) return false;
        if (account_number != null ? !account_number.equals(that.account_number) : that.account_number != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (member_guid != null ? !member_guid.equals(that.member_guid) : that.member_guid != null) return false;
        if (routing_number != null ? !routing_number.equals(that.routing_number) : that.routing_number != null) return false;
        return user_guid != null ? user_guid.equals(that.user_guid) : that.user_guid == null;
    }

    @Override
    public int hashCode() {
        int result = account_guid != null ? account_guid.hashCode() : 0;
        result = 31 * result + (account_number != null ? account_number.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (member_guid != null ? member_guid.hashCode() : 0);
        result = 31 * result + (routing_number != null ? routing_number.hashCode() : 0);
        result = 31 * result + (user_guid != null ? user_guid.hashCode() : 0);
        return result;
    }
}
