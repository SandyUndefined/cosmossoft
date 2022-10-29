package com.sandy.cosmossoft.signer;

import android.util.Log;
import com.paytm.pgsdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xml.security.Init;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.signature.XMLSignature;
import org.apache.xml.security.transforms.Transforms;
import org.apache.xml.security.utils.ElementProxy;
import org.w3c.dom.Document;

public class XMLSigner {
    private static final String URI = "#NFe13140782373077000171650290000030531000030538";

    public static String generateSignXML(String inputXML, InputStream privateKeyStream, String keyPass) {
        try {
            InputStream stream = new ByteArrayInputStream(inputXML.getBytes());
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
            f.setNamespaceAware(true);
            Document doc = f.newDocumentBuilder().parse(stream);
            stream.close();
            Init.init();
            ElementProxy.setDefaultPrefix("http://www.w3.org/2000/09/xmldsig#", "");
            XMLSignature xmlSignature = new XMLSignature(doc, URI, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
            Transforms transforms = new Transforms(doc);
            transforms.addTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
            xmlSignature.addDocument("", transforms, "http://www.w3.org/2000/09/xmldsig#sha1");
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(privateKeyStream, keyPass.toCharArray());
            String alias = keyStore.aliases().nextElement();
            Key privateKey = ((KeyStore.PrivateKeyEntry) keyStore.getEntry(alias, new KeyStore.PasswordProtection(keyPass.toCharArray()))).getPrivateKey();
            X509Certificate cert = (X509Certificate) keyStore.getCertificate(alias);
            xmlSignature.addKeyInfo(cert);
            xmlSignature.addKeyInfo(cert.getPublicKey());
            xmlSignature.sign(privateKey);
            doc.getDocumentElement().appendChild(xmlSignature.getElement());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            outputStream.write(Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315").canonicalizeSubtree(doc));
            return outputStream.toString();
        } catch (Exception e) {
            Log.e(Constants.EVENT_ACTION_ERROR, "Error while generating Sign XML", e);
            return "";
        }
    }
}
