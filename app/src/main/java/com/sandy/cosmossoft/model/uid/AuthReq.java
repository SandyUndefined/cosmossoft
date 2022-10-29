package com.sandy.cosmossoft.model.uid;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Namespace(reference = "http://www.uidai.gov.in/authentication/uid-auth-request/2.0")
@Root(name = "Auth")
public class AuthReq {
    @Element(name = "Hmac", required = false)
    public String Hmac;
    @Attribute(name = "ac", required = true)

    /* renamed from: ac */
    public String f157ac;
    @Element(name = "Data", required = false)
    public Data data;
    @Attribute(name = "lk", required = true)

    /* renamed from: lk */
    public String f158lk;
    @Element(name = "Meta", required = false)
    public Meta meta;
    @Attribute(name = "rc", required = true)

    /* renamed from: rc */
    public String f159rc;
    @Attribute(name = "sa", required = true)

    /* renamed from: sa */
    public String f160sa;
    @Element(name = "Skey", required = false)
    public Skey skey;
    @Attribute(name = "tid", required = true)
    public String tid;
    @Attribute(name = "txn", required = true)
    public String txn;
    @Attribute(name = "uid", required = true)
    public String uid;
    @Element(name = "Uses", required = false)
    public Uses uses;
    @Attribute(name = "ver", required = true)
    public String ver;
}
