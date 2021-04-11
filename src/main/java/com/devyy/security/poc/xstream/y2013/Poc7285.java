package com.devyy.security.poc.xstream.y2013;

import com.devyy.security.poc.xstream.utils.PocLoader;
import com.thoughtworks.xstream.XStream;
import org.company.model.Contact;

/**
 * version <= 1.4.6
 */
public class Poc7285 {
    public static void main(String[] args) {
        String xml = PocLoader.getPoc("CVE-2013-7285.xml");
        XStream xstream = new XStream();
        Contact contact = (Contact)xstream.fromXML(xml);
    }
}
