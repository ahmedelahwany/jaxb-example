package LegoSet;


import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data



public class Minifig {

    @XmlValue
    private String value;

    @XmlAttribute
    private int count;

}

