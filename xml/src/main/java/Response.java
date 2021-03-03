import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    @JacksonXmlElementWrapper(localName = "TagsList")
    @JsonProperty(value = "Tags")
    private List<ResponseTags> tags;

    public static Response getInstance() {
        Response response = new Response();
        response.setTags(ResponseTags.getList());
        return response;
    }

    public List<ResponseTags> getTags() {
        return tags;
    }

    public void setTags(List<ResponseTags> tags) {
        this.tags = tags;
    }


}
