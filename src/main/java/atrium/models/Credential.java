public class Credential {
    private String field_name;
    private String guid;
    private String label;
    private String type;

    public String getField_Name() {
        return field_name;
    }

    public String getGuid() {
        return guid;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credential{");
        sb.append("field_name='").append(field_name).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Credential that = (Credential) o;

        if (field_name != null ? !field_name.equals(that.field_name) : that.field_name != null) return false;
        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        return type != null ? type.equals(that.type) : that.type == null;
    }

    @Override
    public int hashCode() {
        int result = field_name != null ? field_name.hashCode() : 0;
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
