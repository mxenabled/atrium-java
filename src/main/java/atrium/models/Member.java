import java.util.Arrays;

public class Member {
    private String aggregated_at;
    private Challenge[] challenges;
    private String guid;
    private String has_processed_accounts;
    private String has_processed_transactions;
    private String identifier;
    private String institution_code;
    private String is_being_aggregated;
    private String metadata;
    private String name;
    private String status;
    private String successfully_aggregated_at;
    private String user_guid;

    public String getAggregated_At() {
        return aggregated_at;
    }

    public Challenge[] getChallenges() {
        return challenges;
    }

    public String getGuid() {
        return guid;
    }

    public String getHas_Processed_Accounts() {
        return has_processed_accounts;
    }

    public String getHas_Processed_Transactions() {
        return has_processed_transactions;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getInstitution_Code() {
        return institution_code;
    }

    public String getIs_Being_Aggregated() {
        return is_being_aggregated;
    }

    public String getMetadata() {
        return metadata;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSuccessfully_Aggregated_At() {
        return successfully_aggregated_at;
    }

    public String getUser_Guid() {
        return user_guid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("aggregated_at='").append(aggregated_at).append('\'');
        sb.append(", challenges='").append(Arrays.toString(challenges)).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", has_processed_accounts='").append(has_processed_accounts).append('\'');
        sb.append(", has_processed_transactions='").append(has_processed_transactions).append('\'');
        sb.append(", identifier='").append(identifier).append('\'');
        sb.append(", institution_code='").append(institution_code).append('\'');
        sb.append(", is_being_aggregated='").append(is_being_aggregated).append('\'');
        sb.append(", metadata='").append(metadata).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", successfully_aggregated_at='").append(successfully_aggregated_at).append('\'');
        sb.append(", user_guid='").append(user_guid).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Member member = (Member) o;

        if (aggregated_at != null ? !aggregated_at.equals(member.aggregated_at) : member.aggregated_at != null)
            return false;
        if (!Arrays.equals(challenges, member.challenges)) return false;
        if (guid != null ? !guid.equals(member.guid) : member.guid != null) return false;
        if (has_processed_accounts != null ? !has_processed_accounts.equals(member.has_processed_accounts) : member.has_processed_accounts != null)
            return false;
        if (has_processed_transactions != null ? !has_processed_transactions.equals(member.has_processed_transactions) : member.has_processed_transactions != null)
            return false;
        if (identifier != null ? !identifier.equals(member.identifier) : member.identifier != null) return false;
        if (institution_code != null ? !institution_code.equals(member.institution_code) : member.institution_code != null)
            return false;
        if (is_being_aggregated != null ? !is_being_aggregated.equals(member.is_being_aggregated) : member.is_being_aggregated != null) return false;
        if (metadata != null ? !metadata.equals(member.metadata) : member.metadata != null) return false;
        if (name != null ? !name.equals(member.name) : member.name != null) return false;
        if (status != null ? !status.equals(member.status) : member.status != null) return false;
        if (successfully_aggregated_at != null ? !successfully_aggregated_at.equals(member.successfully_aggregated_at) : member.successfully_aggregated_at != null)
            return false;
        return user_guid != null ? user_guid.equals(member.user_guid) : member.user_guid == null;
    }

    @Override
    public int hashCode() {
        int result = aggregated_at != null ? aggregated_at.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(challenges);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (has_processed_accounts != null ? has_processed_accounts.hashCode() : 0);
        result = 31 * result + (has_processed_transactions != null ? has_processed_transactions.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (institution_code != null ? institution_code.hashCode() : 0);
        result = 31 * result + (is_being_aggregated != null ? is_being_aggregated.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (successfully_aggregated_at != null ? successfully_aggregated_at.hashCode() : 0);
        result = 31 * result + (user_guid != null ? user_guid.hashCode() : 0);
        return result;
    }
}
