import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {
        toXmlTest();
        toPojoTest();
    }

    public static void toXmlTest() throws JsonProcessingException {
        PackageList packageList = PackageList.instance();
        String xml = toXml(packageList);
        System.out.println(xml);
    }

    public static String toXml(Object object) throws JsonProcessingException {
        ObjectMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(object);
    }

    public static void toPojoTest() throws JsonProcessingException {
        String xml = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?>\n" +
                "<PackageList xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "\t<Package>\n" +
                "\t\t<Header>\n" +
                "\t\t\t<version>2</version>\n" +
                "\t\t\t<RequestType>106</RequestType>\n" +
                "\t\t\t<InsureType>100</InsureType>\n" +
                "\t\t\t<SessionId>201607181630158683</SessionId>\n" +
                "\t\t\t<SellerId>1465959568477</SellerId>\n" +
                "\t\t\t<SendTime>2018-12-27 19:33:33</SendTime>\n" +
                "\t\t\t<Status>100</Status>\n" +
                "\t\t\t<ErrorMessage></ErrorMessage>\n" +
                "\t\t</Header>\n" +
                "\t\t<Response>\n" +
                "\t\t\t<packageType>optional</packageType>\n" +
                "\t\t\t<compreOrg>null</compreOrg>\n" +
                "\t\t\t<isCompreX>null</isCompreX>\n" +
                "\t\t\t<TagsList>\n" +
                "\t\t\t\t<Tags type=\"insuredInfo\">\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredIdNo</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">��������֤������</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\">412728199211130053</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredEmail</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">������������</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredName</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">������������</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\">��˼</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredMobile</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">���������ֻ�</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\">17310563002</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">input</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredIdStartDate</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">֤������ʼ����</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"data\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">input</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredIdEndDate</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">֤������ֹ����</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"data\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">input</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">insuredIdAddress</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">֤���ŵ�ַ</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"data\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t</Tags>\n" +
                "\t\t\t\t<Tags type=\"applicantInfo\">\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">applicantIdNo</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">Ͷ����֤������</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\">412728199211130053</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t\t<Tag>\n" +
                "\t\t\t\t\t\t<Definition name=\"type\">label</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"key\">applicantEmail</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"label\">Ͷ��������</Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"value\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"premium\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"dataUrl\"></Definition>\n" +
                "\t\t\t\t\t\t<Definition name=\"checkUrl\"></Definition>\n" +
                "\t\t\t\t\t</Tag>\n" +
                "\t\t\t\t</Tags>\n" +
                "\t\t\t</TagsList>\n" +
                "\t\t</Response>\n" +
                "\t</Package>\n" +
                "</PackageList>\n";
        PackageList packageList = toPojo(xml, PackageList.class);
    }

    public static <T> T toPojo(String xml, Class<T> clazz) throws JsonProcessingException {
        ObjectMapper xmlMapper = new XmlMapper();
        return  xmlMapper.readValue(xml, clazz);
    }
}
