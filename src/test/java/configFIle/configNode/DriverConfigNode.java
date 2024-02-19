package configFIle.configNode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DriverConfigNode {

    @XmlElement(name= "LocalBrowser")
    public String localBrowser;

    @XmlElement (name = "Url")
    public String url;

    @XmlElement (name = "Headless")
    public String headelss;

    @XmlElement (name = "Resolution")
    public String resolution;

    @XmlElement (name = "Gpu")
    public String gpu;

    @XmlElement(name = "Extentions")
    public String extentions;


}
