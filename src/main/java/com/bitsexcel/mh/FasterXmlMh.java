/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bitsexcel.mh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;



/**
 *
 * @author jdaniel
 */
public class FasterXmlMh {
    public String JsonToXml(String jsonStr) throws JsonProcessingException, IOException{
        
         
        ObjectMapper jsonMapper = new ObjectMapper();
        JsonNode node = jsonMapper.readValue(jsonStr, JsonNode.class);
        XmlMapper xmlMapper = new XmlMapper();
                xmlMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
                xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
                xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_1_1, true);
                xmlMapper.writeValue(new File("result.xml"), node);
        StringWriter sw = new StringWriter();
        xmlMapper.writeValue(sw, node);
        System.out.println(sw.toString());
        return sw.toString();
    }
    
}
