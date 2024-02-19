package configFIle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ConfigFIle {

    //facem o metoda generica care sa deserializeze xml file si sa returneze p bucata pe care mi-o doresc
    //metoda generica - nu merita sa iti faci f multe instante ale metodei daca stii ca este aceeasi actiune dar rezultatul de returnare este diferit
    // T - reprezinta parametrul pe care eu il dau , va tine locul return-ului nostru, practic ii zic cand vreau sa-mi returnezi, vreau sa imi returnezi un driver config, sau altceva

    public static <T> T createConfigNode(Class<T> klass)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(klass);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return klass.cast(unmarshaller.unmarshal(new File("src/test/resources/configFile/shareDataConfig.xml")));
        }
        catch (JAXBException e)
        {
            System.out.println(e.getMessage());
        }
        return null;

    }
}
