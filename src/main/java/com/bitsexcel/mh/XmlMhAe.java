/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bitsexcel.mh;

import java.io.IOException;

/**
 *
 * @author jdaniel
 */
public class XmlMhAe {
    public static void stringToDom(String xmlSource) 
        throws IOException {
    java.io.FileWriter fw = new java.io.FileWriter("my-file.xml");
    fw.write(xmlSource);
    fw.close();
}
}