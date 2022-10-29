package com.sandy.cosmossoft.model;

import java.util.List;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "CustOpts")
public class CustOpts {
    @ElementList(inline = true, name = "Param", required = false)
    public List<Param> params;
}
