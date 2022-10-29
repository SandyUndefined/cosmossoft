package com.sandy.cosmossoft.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "DeviceInfo")
public class DeviceInfo {
    @Element(name = "additional_info")
    public additional_info add_info;
    @Attribute(name = "dc")

    /* renamed from: dc */
    public String f10dc;
    @Attribute(name = "dpId")
    public String dpId;
    @Attribute(name = "mc")

    /* renamed from: mc */
    public String f11mc;
    @Attribute(name = "mi")

    /* renamed from: mi */
    public String f12mi;
    @Attribute(name = "rdsId")
    public String rdsId;
    @Attribute(name = "rdsVer")
    public String rdsVer;
}
