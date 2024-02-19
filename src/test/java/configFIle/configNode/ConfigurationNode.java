package configFIle.configNode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "configuration")
public class ConfigurationNode {
    @XmlElement(name = "DriverConfigNode")
    public DriverConfigNode driverConfigNode;

    @XmlElement(name = "DataBaseConfigNode")
    public DataBaseConfigNode dataBaseConfigNode;

}
