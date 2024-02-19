package configFIle.configNode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class DataBaseConfigNode {

    @XmlElement(name= "Port")
    public String port;

    @XmlElement (name = "DatabaseName")
    public String database;

    @XmlElement (name = "Username")
    public String username;

    @XmlElement (name = "Password")
    public String password;

    @XmlElement (name = "Gpu")
    public String gpu;

    @XmlElement(name = "Extentions")
    public String extentions;


}
