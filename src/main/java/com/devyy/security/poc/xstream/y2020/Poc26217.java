package com.devyy.security.poc.xstream.y2020;

import com.devyy.security.poc.xstream.utils.PocLoader;
import com.thoughtworks.xstream.XStream;

/**
 * version <= 1.4.13
 */
public class Poc26217 {
    public static void main(String[] args) {
        String xml = PocLoader.getPoc("CVE-2020-26217.xml");
        XStream xstream = new XStream();
        xstream.fromXML(xml);
    }
}
