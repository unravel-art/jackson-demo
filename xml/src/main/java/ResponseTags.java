import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTags {

    @JacksonXmlProperty(
            isAttribute = true, localName = "type"
    )
    private String type;

    @JacksonXmlElementWrapper(localName = "Tag")
    @JsonProperty(value = "Definition")
    private List<ResponseTag> tags;

    public static List<ResponseTags> getList() {
        ResponseTags instance = new ResponseTags();
        instance.setType("insuredInfo");
        instance.setTags(ResponseTag.getList());

        List<ResponseTags> list = new ArrayList<>();
        list.add(instance);
        return list;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ResponseTag> getTags() {
        return tags;
    }

    public void setTags(List<ResponseTag> tags) {
        this.tags = tags;
    }
}
