package com.mx.atrium.models;

public class Account {
    private String apr;
    private String apy;
    private String available_balance;
    private String available_credit;
    private String balance;
    private String created_at;
    private String credit_limit;
    private String day_payment_is_due;
    private String guid;
    private String institution_code;
    private String interest_rate;
    private String is_closed;
    private String last_payment;
    private String last_payment_at;
    private String matures_on;
    private String member_guid;
    private String minimum_balance;
    private String minimum_payment;
    private String name;
    private String original_balance;
    private String payment_due_at;
    private String payoff_balance;
    private String started_on;
    private String subtype;
    private String total_account_value;
    private String type;
    private String updated_at;
    private String user_guid;

    public String getApr() {
        return apr;
    }

    public String getApy() {
        return apy;
    }

    public String getAvailable_Balance() {
        return available_balance;
    }

    public String getAvailable_Credit() {
        return available_credit;
    }

    public String getBalance() {
        return balance;
    }

    public String getCreated_At() {
        return created_at;
    }

    public String getCredit_Limit() {
        return credit_limit;
    }

    public String getDay_Payment_Is_Due() {
        return day_payment_is_due;
    }

    public String getGuid() {
        return guid;
    }

    public String getInstitution_Code() {
        return institution_code;
    }

    public String getInterest_Rate() {
        return interest_rate;
    }

    public String getIs_Closed() {
        return is_closed;
    }

    public String getLast_Payment() {
        return last_payment;
    }

    public String getLast_Payment_At() {
        return last_payment_at;
    }

    public String getMatures_On() {
        return matures_on;
    }

    public String getMember_Guid() {
        return member_guid;
    }

    public String getMinimum_Balance() {
        return minimum_balance;
    }

    public String getMinimum_Payment() {
        return minimum_payment;
    }

    public String getName() {
        return name;
    }

    public String getOriginal_Balance() {
        return original_balance;
    }

    public String getPayment_Due_At() {
        return payment_due_at;
    }

    public String getPayoff_Balance() {
        return payoff_balance;
    }

    public String getStarted_On() {
        return started_on;
    }

    public String getSubtype() {
        return subtype;
    }

    public String getTotal_Account_Value() {
        return total_account_value;
    }

    public String getType() {
        return type;
    }

    public String getUpdated_At() {
        return updated_at;
    }

    public String getUser_Guid() {
        return user_guid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("apr='").append(apr).append('\'');
        sb.append(", apy='").append(apy).append('\'');
        sb.append(", available_balance='").append(available_balance).append('\'');
        sb.append(", available_credit='").append(available_credit).append('\'');
        sb.append(", balance='").append(balance).append('\'');
        sb.append(", created_at='").append(created_at).append('\'');
        sb.append(", credit_limit='").append(credit_limit).append('\'');
        sb.append(", day_payment_is_due='").append(day_payment_is_due).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", institution_code='").append(institution_code).append('\'');
        sb.append(", interest_rate='").append(interest_rate).append('\'');
        sb.append(", is_closed='").append(is_closed).append('\'');
        sb.append(", last_payment='").append(last_payment).append('\'');
        sb.append(", last_payment_at='").append(last_payment_at).append('\'');
        sb.append(", matures_on='").append(matures_on).append('\'');
        sb.append(", member_guid='").append(member_guid).append('\'');
        sb.append(", minimum_balance='").append(minimum_balance).append('\'');
        sb.append(", minimum_payment='").append(minimum_payment).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", original_balance='").append(original_balance).append('\'');
        sb.append(", payment_due_at='").append(payment_due_at).append('\'');
        sb.append(", payoff_balance='").append(payoff_balance).append('\'');
        sb.append(", started_on='").append(started_on).append('\'');
        sb.append(", subtype='").append(subtype).append('\'');
        sb.append(", total_account_value='").append(total_account_value).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", updated_at='").append(updated_at).append('\'');
        sb.append(", user_guid='").append(user_guid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (apr != null ? !apr.equals(account.apr) : account.apr != null) return false;
        if (apy != null ? !apy.equals(account.apy) : account.apy != null) return false;
        if (available_balance != null ? !available_balance.equals(account.available_balance) : account.available_balance != null)
            return false;
        if (available_credit != null ? !available_credit.equals(account.available_credit) : account.available_credit != null)
            return false;
        if (balance != null ? !balance.equals(account.balance) : account.balance != null) return false;
        if (created_at != null ? !created_at.equals(account.created_at) : account.created_at != null) return false;
        if (credit_limit != null ? !credit_limit.equals(account.credit_limit) : account.credit_limit != null)
            return false;
        if (day_payment_is_due != null ? !day_payment_is_due.equals(account.day_payment_is_due) : account.day_payment_is_due != null)
            return false;
        if (guid != null ? !guid.equals(account.guid) : account.guid != null) return false;
        if (institution_code != null ? !institution_code.equals(account.institution_code) : account.institution_code != null)
            return false;
        if (interest_rate != null ? !interest_rate.equals(account.interest_rate) : account.interest_rate != null)
            return false;
        if (is_closed != null ? !is_closed.equals(account.is_closed) : account.is_closed != null) return false;
        if (last_payment != null ? !last_payment.equals(account.last_payment) : account.last_payment != null)
            return false;
        if (last_payment_at != null ? !last_payment_at.equals(account.last_payment_at) : account.last_payment_at != null)
            return false;
        if (matures_on != null ? !matures_on.equals(account.matures_on) : account.matures_on != null) return false;
        if (member_guid != null ? !member_guid.equals(account.member_guid) : account.member_guid != null) return false;
        if (minimum_balance != null ? !minimum_balance.equals(account.minimum_balance) : account.minimum_balance != null)
            return false;
        if (minimum_payment != null ? !minimum_payment.equals(account.minimum_payment) : account.minimum_payment != null)
            return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (original_balance != null ? !original_balance.equals(account.original_balance) : account.original_balance != null)
            return false;
        if (payment_due_at != null ? !payment_due_at.equals(account.payment_due_at) : account.payment_due_at != null)
            return false;
        if (payoff_balance != null ? !payoff_balance.equals(account.payoff_balance) : account.payoff_balance != null)
            return false;
        if (started_on != null ? !started_on.equals(account.started_on) : account.started_on != null) return false;
        if (subtype != null ? !subtype.equals(account.subtype) : account.subtype != null) return false;
        if (total_account_value != null ? !total_account_value.equals(account.total_account_value) : account.total_account_value != null)
            return false;
        if (type != null ? !type.equals(account.type) : account.type != null) return false;
        if (updated_at != null ? !updated_at.equals(account.updated_at) : account.updated_at != null) return false;
        return user_guid != null ? user_guid.equals(account.user_guid) : account.user_guid == null;
    }

    @Override
    public int hashCode() {
        int result = apr != null ? apr.hashCode() : 0;
        result = 31 * result + (apy != null ? apy.hashCode() : 0);
        result = 31 * result + (available_balance != null ? available_balance.hashCode() : 0);
        result = 31 * result + (available_credit != null ? available_credit.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        result = 31 * result + (credit_limit != null ? credit_limit.hashCode() : 0);
        result = 31 * result + (day_payment_is_due != null ? day_payment_is_due.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (institution_code != null ? institution_code.hashCode() : 0);
        result = 31 * result + (interest_rate != null ? interest_rate.hashCode() : 0);
        result = 31 * result + (is_closed != null ? is_closed.hashCode() : 0);
        result = 31 * result + (last_payment != null ? last_payment.hashCode() : 0);
        result = 31 * result + (last_payment_at != null ? last_payment_at.hashCode() : 0);
        result = 31 * result + (matures_on != null ? matures_on.hashCode() : 0);
        result = 31 * result + (member_guid != null ? member_guid.hashCode() : 0);
        result = 31 * result + (minimum_balance != null ? minimum_balance.hashCode() : 0);
        result = 31 * result + (minimum_payment != null ? minimum_payment.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (original_balance != null ? original_balance.hashCode() : 0);
        result = 31 * result + (payment_due_at != null ? payment_due_at.hashCode() : 0);
        result = 31 * result + (payoff_balance != null ? payoff_balance.hashCode() : 0);
        result = 31 * result + (started_on != null ? started_on.hashCode() : 0);
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        result = 31 * result + (total_account_value != null ? total_account_value.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        result = 31 * result + (user_guid != null ? user_guid.hashCode() : 0);
        return result;
    }
}
