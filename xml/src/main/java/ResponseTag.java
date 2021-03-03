import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseTag {

    @JacksonXmlProperty(
            isAttribute = true,
            localName = "name"
    )
    private String name;

    @JacksonXmlText
    private String value;

    public static List<ResponseTag> getList() {
        ResponseTag instance = new ResponseTag();
        instance.setName("type");
        instance.setValue("label");
        List<ResponseTag> list = new ArrayList<>();
        list.add(instance);
        return list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
