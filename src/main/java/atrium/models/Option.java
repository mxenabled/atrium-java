public class Option {
    private String image_data;
    private String label;
    private String value;

    public String getImage_Data() {
        return image_data;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Option{");
        sb.append("image_data='").append(image_data).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option = (Option) o;

        if (image_data != null ? !image_data.equals(option.image_data) : option.image_data != null) return false;
        if (label != null ? !label.equals(option.label) : option.label != null) return false;
        return value != null ? value.equals(option.value) : option.value == null;
    }

    @Override
    public int hashCode() {
        int result = image_data != null ? image_data.hashCode() : 0;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
