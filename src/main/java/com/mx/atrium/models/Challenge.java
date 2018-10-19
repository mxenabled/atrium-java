package com.mx.atrium.models;

import java.util.Arrays;

public class Challenge {
    private String field_name;
    private String guid;
    private String image_data;
    private String label;
    private Option[] options;
    private String type;

    public String getField_Name() {
        return field_name;
    }

    public String getGuid() {
        return guid;
    }

    public String getImage_Data() {
        return image_data;
    }

    public String getLabel() {
        return label;
    }

    public Option[] getOptions() {
        return options;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Challenge{");
        sb.append("field_name='").append(field_name).append('\'');
        sb.append(", guid='").append(guid).append('\'');
        sb.append(", image_data='").append(image_data).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", options='").append(Arrays.toString(options)).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Challenge challenge = (Challenge) o;

        if (field_name != null ? !field_name.equals(challenge.field_name) : challenge.field_name != null) return false;
        if (guid != null ? !guid.equals(challenge.guid) : challenge.guid != null) return false;
        if (image_data != null ? !image_data.equals(challenge.image_data) : challenge.image_data != null) return false;
        if (label != null ? !label.equals(challenge.label) : challenge.label != null) return false;
        if (!Arrays.equals(options, challenge.options)) return false;
        return type != null ? type.equals(challenge.type) : challenge.type == null;
    }

    @Override
    public int hashCode() {
        int result = field_name != null ? field_name.hashCode() : 0;
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (image_data != null ? image_data.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(options);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
