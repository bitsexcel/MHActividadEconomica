package com.bitsexcel.mh;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import org.json.XML;

public class ActividadEconomica {

    

    public static void main(String[] args) throws Exception {

        HttpMhAe http = new HttpMhAe();
        XmlMhAe ae = new XmlMhAe();
        FasterXmlMh fxm = new FasterXmlMh();

        //System.out.println("Testing 1 - Send Http GET request");
        //http.sendGet();
        System.out.println("\nTesting 2 - Send Http POST request");
        String xml = http.sendGet();
        //ae.stringToDom(xml);
        String json = fxm.JsonToXml(xml);
        

    }
 }