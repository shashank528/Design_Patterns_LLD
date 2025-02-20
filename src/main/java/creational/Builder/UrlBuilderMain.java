package creational.Builder;
class Url
{
    private final String hostname;
    private final String protocol;
    //optional paramter
    private  String port="-1";
    private String queryParam="";
    private String pathparam="";

    private Url(Builder builder) {
        this.hostname=builder.hostname;
        this.protocol=builder.protocol;
        this.port=builder.port;
        this.queryParam=builder.queryParam;
        this.pathparam=builder.pathparam;
    }
    public String toString()
    {
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(protocol).append(hostname);
        if(!port.equalsIgnoreCase("-1"))
        {
            urlBuilder.append(port);
        }
        if(!pathparam.isEmpty())
        {
            urlBuilder.append(pathparam);
        }
        if(!queryParam.isEmpty())
        {
            urlBuilder.append(queryParam);
        }
        return urlBuilder.toString();
    }

    static class Builder
    {
        private String hostname;
        private String protocol;
        //optional
        private  String port="-1";
        private String queryParam="";
        private String pathparam="";
        public Builder()
        {

        }
        public Url build()
        {
            return new Url(this);
        }
        public Builder buildHost(String hostname)
        {
            this.hostname=hostname;
            return this;
        }
        public Builder buildQueryParam(String queryParam)
        {
            this.queryParam=queryParam;
            return this;
        }
        public Builder buildProtocol(String protocol)
        {
            this.protocol=protocol;
            return this;
        }
        public Builder buildPort(String port)
        {
            this.port=port;
            return this;
        }
        public Builder buildPathParam(String pathParam)
        {
            this.pathparam=pathParam;
            return this;
        }
    }
}
public class UrlBuilderMain {
    public static void main(String[] args) {
        Url.Builder builder1 = new Url.Builder();
        Url url1 = builder1.buildProtocol("https://").buildHost("godadday.com").build();
        Url url2 = new Url.Builder().buildProtocol("https://").buildHost("shashank.shekhar.com")
                .buildPort("/8080").buildPathParam("/abs_name").buildQueryParam("?channel=sudocode").build();
        System.out.println("url1 ="+url1);
        System.out.println("url2 ="+url2);

    }
}
