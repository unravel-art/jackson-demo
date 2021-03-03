import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Package {

    @JsonProperty(value = "Header")
    private Header header;

    @JsonProperty(value = "Response")
    private Response response;

    public static List<Package> getData() {
        Package instance = new Package();
        instance.setHeader(Header.getInstance());
        instance.setResponse(Response.getInstance());

        List<Package> list = new ArrayList<>();
        list.add(instance);
        return list;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
