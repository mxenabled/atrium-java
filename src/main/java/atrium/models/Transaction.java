public class Transaction {
    private String account_guid;
    private String amount;
    private String category;
    private String check_number;
    private String check_number_string;
    private String created_at;
    private String date;
    private String description;
    private String guid;
    private String is_bill_pay;
    private String is_direct_deposit;
    private String is_expense;
    private String is_fee;
    private String is_income;
    private String is_overdraft_fee;
    private String is_payroll_advance;
    private String latitude;
    private String longitude;
    private String member_guid;
    private String memo;
    private String merchant_category_code;
    private String original_description;
    private String posted_at;
    private String status;
    private String top_level_category;
    private String transacted_at;
    private String type;
    private String updated_at;
    private String user_guid;

    public String getAccount_Guid() {
        return account_guid;
    }

    public String getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getCheck_Number() {
        return check_number;
    }

    public String getCheck_Number_String() {
        return check_number_string;
    }

    public String getCreated_At() {
        return created_at;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getGuid() {
        return guid;
    }

    public String getIs_Bill_Pay() {
        return is_bill_pay;
    }

    public String getIs_Direct_Deposit() {
        return is_direct_deposit;
    }

    public String getIs_Expense() {
        return is_expense;
    }

    public String getIs_Fee() {
        return is_fee;
    }

    public String getIs_Income() {
        return is_income;
    }

    public String getIs_Overdraft_Fee() {
        return is_overdraft_fee;
    }

    public String getIs_Payroll_Advance() {
        return is_payroll_advance;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getMember_Guid() {
        return member_guid;
    }

    public String getMemo() {
        return memo;
    }

    public String getMerchant_Category_Code() {
        return merchant_category_code;
    }

    public String getOriginal_Description() {
        return original_description;
    }

    public String getPosted_At() {
        return posted_at;
    }

    public String getStatus() {
        return status;
    }

    public String getTop_Level_Category() {
        return top_level_category;
    }

    public String getTransacted_At() {
        return transacted_at;
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
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("account_guid='").append(account_guid).append('\'');
        sb.append(", amount='").append(amount).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", check_number='").append(check_number).append('\'');
        sb.append(", created_at='").append(created_at).append('\'');
        sb.append(", date='").append(date).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", is_bill_pay='").append(is_bill_pay).append('\'');
        sb.append(", is_direct_deposit='").append(is_direct_deposit).append('\'');
        sb.append(", is_expense='").append(is_expense).append('\'');
        sb.append(", is_fee='").append(is_fee).append('\'');
        sb.append(", is_income='").append(is_income).append('\'');
        sb.append(", is_overdraft_fee='").append(is_overdraft_fee).append('\'');
        sb.append(", is_payroll_advance='").append(is_payroll_advance).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", member_guid='").append(member_guid).append('\'');
        sb.append(", memo='").append(memo).append('\'');
        sb.append(", merchant_category_code='").append(merchant_category_code).append('\'');
        sb.append(", original_description='").append(original_description).append('\'');
        sb.append(", posted_at='").append(posted_at).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", top_level_category='").append(top_level_category).append('\'');
        sb.append(", transacted_at='").append(transacted_at).append('\'');
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

        Transaction that = (Transaction) o;

        if (account_guid != null ? !account_guid.equals(that.account_guid) : that.account_guid != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (check_number != null ? !check_number.equals(that.check_number) : that.check_number != null) return false;
        if (created_at != null ? !created_at.equals(that.created_at) : that.created_at != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (is_bill_pay != null ? !is_bill_pay.equals(that.is_bill_pay) : that.is_bill_pay != null) return false;
        if (is_direct_deposit != null ? !is_direct_deposit.equals(that.is_direct_deposit) : that.is_direct_deposit != null)
            return false;
        if (is_expense != null ? !is_expense.equals(that.is_expense) : that.is_expense != null) return false;
        if (is_fee != null ? !is_fee.equals(that.is_fee) : that.is_fee != null) return false;
        if (is_income != null ? !is_income.equals(that.is_income) : that.is_income != null) return false;
        if (is_overdraft_fee != null ? !is_overdraft_fee.equals(that.is_overdraft_fee) : that.is_overdraft_fee != null)
            return false;
        if (is_payroll_advance != null ? !is_payroll_advance.equals(that.is_payroll_advance) : that.is_payroll_advance != null)
            return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (member_guid != null ? !member_guid.equals(that.member_guid) : that.member_guid != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (merchant_category_code != null ? !merchant_category_code.equals(that.merchant_category_code) : that.merchant_category_code != null)
            return false;
        if (original_description != null ? !original_description.equals(that.original_description) : that.original_description != null)
            return false;
        if (posted_at != null ? !posted_at.equals(that.posted_at) : that.posted_at != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (top_level_category != null ? !top_level_category.equals(that.top_level_category) : that.top_level_category != null)
            return false;
        if (transacted_at != null ? !transacted_at.equals(that.transacted_at) : that.transacted_at != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (updated_at != null ? !updated_at.equals(that.updated_at) : that.updated_at != null) return false;
        return user_guid != null ? user_guid.equals(that.user_guid) : that.user_guid == null;
    }

    @Override
    public int hashCode() {
        int result = account_guid != null ? account_guid.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (check_number != null ? check_number.hashCode() : 0);
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (is_bill_pay != null ? is_bill_pay.hashCode() : 0);
        result = 31 * result + (is_direct_deposit != null ? is_direct_deposit.hashCode() : 0);
        result = 31 * result + (is_expense != null ? is_expense.hashCode() : 0);
        result = 31 * result + (is_fee != null ? is_fee.hashCode() : 0);
        result = 31 * result + (is_income != null ? is_income.hashCode() : 0);
        result = 31 * result + (is_overdraft_fee != null ? is_overdraft_fee.hashCode() : 0);
        result = 31 * result + (is_payroll_advance != null ? is_payroll_advance.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (member_guid != null ? member_guid.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (merchant_category_code != null ? merchant_category_code.hashCode() : 0);
        result = 31 * result + (original_description != null ? original_description.hashCode() : 0);
        result = 31 * result + (posted_at != null ? posted_at.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (top_level_category != null ? top_level_category.hashCode() : 0);
        result = 31 * result + (transacted_at != null ? transacted_at.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        result = 31 * result + (user_guid != null ? user_guid.hashCode() : 0);
        return result;
    }
}
