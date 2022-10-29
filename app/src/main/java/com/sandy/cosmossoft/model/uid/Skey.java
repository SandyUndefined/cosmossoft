package com.sandy.cosmossoft.model.uid;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class Skey {
    @Attribute(name = "ci", required = false)

    /* renamed from: ci */
    public String f165ci;
    @Text(required = true)
    public String value;
}
