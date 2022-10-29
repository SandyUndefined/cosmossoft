package com.sandy.cosmossoft.model.uid;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "AuthRes", strict = false)
public class AuthRes {
    @Attribute(name = "actn", required = false)
    public String actn;
    @Attribute(name = "code", required = false)
    public String code;
    @Attribute(name = "err", required = false)
    public String err;
    @Attribute(name = "info", required = false)

    /* renamed from: info  reason: collision with root package name */
    public String f3492info;
    @Attribute(name = "ret", required = false)
    public String ret;
    @Attribute(name = "ts", required = false)

    /* renamed from: ts */
    public String f161ts;
    @Attribute(name = "txn", required = false)
    public String txn;
}
