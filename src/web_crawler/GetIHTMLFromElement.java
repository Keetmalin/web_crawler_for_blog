/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_crawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author ASUS-PC
 */
public class GetIHTMLFromElement {
    
        public static void main(String[] args) throws IOException {
        //the URL of the webpage of interest
        String url = "http://en.wikipedia.org/";

        //connect to url and get document
        Document document = Jsoup.connect(url).get();

        //get elements by ID
        Element element = document.getElementById("content");

        //get innerHTML of the element 
        String name = element.html();

        //get outerHTML of the element
        String attributes = element.outerHtml();
    }    
}
