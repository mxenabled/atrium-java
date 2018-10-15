public class CategorizedTransaction {
    private String amount;
    private String category;
    private String description;
    private String is_bill_pay;
    private String is_direct_deposit;
    private String is_expense;
    private String is_fee;
    private String is_income;
    private String is_international;
    private String is_overdraft_fee;
    private String is_payroll_advance;
    private String type;

    public String getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
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

    public String getIs_International() {
        return is_international;
    }

    public String getIs_Overdraft_Fee() {
        return is_overdraft_fee;
    }

    public String getIs_Payroll_Advance() {
        return is_payroll_advance;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CategorizedTransaction{");
        sb.append("amount='").append(amount).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", is_bill_pay='").append(is_bill_pay).append('\'');
        sb.append(", is_direct_deposit='").append(is_direct_deposit).append('\'');
        sb.append(", is_expense='").append(is_expense).append('\'');
        sb.append(", is_fee='").append(is_fee).append('\'');
        sb.append(", is_income='").append(is_income).append('\'');
        sb.append(", is_international='").append(is_international).append('\'');
        sb.append(", is_overdraft_fee='").append(is_overdraft_fee).append('\'');
        sb.append(", is_payroll_advance='").append(is_payroll_advance).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategorizedTransaction that = (CategorizedTransaction) o;

        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (is_bill_pay != null ? !is_bill_pay.equals(that.is_bill_pay) : that.is_bill_pay != null) return false;
        if (is_direct_deposit != null ? !is_direct_deposit.equals(that.is_direct_deposit) : that.is_direct_deposit != null)
            return false;
        if (is_expense != null ? !is_expense.equals(that.is_expense) : that.is_expense != null) return false;
        if (is_fee != null ? !is_fee.equals(that.is_fee) : that.is_fee != null) return false;
        if (is_income != null ? !is_income.equals(that.is_income) : that.is_income != null) return false;
        if (is_international != null ? !is_international.equals(that.is_international) : that.is_international != null) return false;
        if (is_overdraft_fee != null ? !is_overdraft_fee.equals(that.is_overdraft_fee) : that.is_overdraft_fee != null)
            return false;
        if (is_payroll_advance != null ? !is_payroll_advance.equals(that.is_payroll_advance) : that.is_payroll_advance != null)
            return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (is_bill_pay != null ? is_bill_pay.hashCode() : 0);
        result = 31 * result + (is_direct_deposit != null ? is_direct_deposit.hashCode() : 0);
        result = 31 * result + (is_expense != null ? is_expense.hashCode() : 0);
        result = 31 * result + (is_fee != null ? is_fee.hashCode() : 0);
        result = 31 * result + (is_income != null ? is_income.hashCode() : 0);
        result = 31 * result + (is_international != null ? is_international.hashCode() : 0);
        result = 31 * result + (is_overdraft_fee != null ? is_overdraft_fee.hashCode() : 0);
        result = 31 * result + (is_payroll_advance != null ? is_payroll_advance.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
