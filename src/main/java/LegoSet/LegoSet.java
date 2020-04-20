package LegoSet;


import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces","tags","minifigs","weight","url"})
@Data
public class LegoSet {


    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private String theme;
    private String subtheme;
    private String name;
    private URL url;
    private Weight weight;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;


    @XmlAttribute
    private int number;

}
