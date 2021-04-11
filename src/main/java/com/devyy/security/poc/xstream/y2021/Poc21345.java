package com.devyy.security.poc.xstream.y2021;

import com.devyy.security.poc.xstream.utils.PocLoader;
import com.thoughtworks.xstream.XStream;

/**
 * version <= 1.4.15
 */
public class Poc21345 {
    public static void main(String[] args) {
        String xml = PocLoader.getPoc("CVE-2021-21345.xml");
        XStream xstream = new XStream();
        xstream.fromXML(xml);
    }
}
