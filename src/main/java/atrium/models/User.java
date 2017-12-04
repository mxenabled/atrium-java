public class User {
    private String guid;
    private String identifier;
    private String is_disabled;
    private String metadata;

    public String getGuid() {
        return guid;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getIs_disabled() {
        return is_disabled;
    }

    public String getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("guid='").append(guid).append('\'');
        sb.append(", identifier='").append(identifier).append('\'');
        sb.append(", is_disabled='").append(is_disabled).append('\'');
        sb.append(", metadata='").append(metadata).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (guid != null ? !guid.equals(user.guid) : user.guid != null) return false;
        if (identifier != null ? !identifier.equals(user.identifier) : user.identifier != null) return false;
        if (is_disabled != null ? !is_disabled.equals(user.is_disabled) : user.is_disabled != null) return false;
        return metadata != null ? metadata.equals(user.metadata) : user.metadata == null;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (is_disabled != null ? is_disabled.hashCode() : 0);
        result = 31 * result + (metadata != null ? metadata.hashCode() : 0);
        return result;
    }
}

