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
import org.jsoup.select.Elements;

/**
 *
 * @author ASUS-PC
 */
public class GetElementsUsingTag {

    public static void main(String[] args) throws IOException {

        //the URL of the webpage of interest
        String url = "http://en.wikipedia.org/";

        //connect to url and get document
        Document document = Jsoup.connect(url).get();

        //get elements by Tag
        Elements tagList = document.getElementsByTag("a");

        //This will itarete through the Elements arraylist for each Element
        for (Element element : tagList) {

            //the element variable represents an Element
        }
    }
}
