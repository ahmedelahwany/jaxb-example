package LegoSet;


import javax.xml.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data



public class Weight {

    @XmlValue
    private double value;

    @XmlAttribute
    private String unit;

}