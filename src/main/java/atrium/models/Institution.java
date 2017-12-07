public class Institution {
    private String code;
    private String name;
    private String url;
    private String small_logo_url;
    private String medium_logo_url;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getSmall_Logo_Url() {
        return small_logo_url;
    }

    public String getMedium_Logo_Url() {
        return medium_logo_url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Institution{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", small_logo_url='").append(small_logo_url).append('\'');
        sb.append(", medium_logo_url='").append(medium_logo_url).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Institution that = (Institution) o;

        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (small_logo_url != null ? !small_logo_url.equals(that.small_logo_url) : that.small_logo_url != null)
            return false;
        return medium_logo_url != null ? medium_logo_url.equals(that.medium_logo_url) : that.medium_logo_url == null;
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (small_logo_url != null ? small_logo_url.hashCode() : 0);
        result = 31 * result + (medium_logo_url != null ? medium_logo_url.hashCode() : 0);
        return result;
    }
}
