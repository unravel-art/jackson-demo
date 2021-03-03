import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PackageList {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty(value = "Package")
    private List<Package> packages;


    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    public static PackageList instance() {
        PackageList packageList = new PackageList();
        packageList.setPackages(Package.getData());
        return packageList;
    }
}
