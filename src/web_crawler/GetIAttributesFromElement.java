/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author ASUS-PC
 */
public class GetIAttributesFromElement {

    public static void main(String[] args) throws IOException {
        //the URL of the webpage of interest
        String url = "http://en.wikipedia.org/";

        //connect to url and get document
        Document document = Jsoup.connect(url).get();

        //get elements by ID
        Element element = document.getElementById("content");

        //get attribute "name" from the element 
        String name = element.attr("name");

        //get all attributes of element 
        Attributes attributes = element.attributes();

        //this will iterate the Attributes object
        for (Attribute attribute : attributes) {

            //print the HTML of each attribute
            System.out.println(attribute.html());

            //print the Key of each attribute
            System.out.println(attribute.getKey());

            //print the value of each attibute
            System.out.println(attribute.getValue());
        }
    }
}
