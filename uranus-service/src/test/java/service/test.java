package service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
 * @author anfeel
 * @version service, v 0.1 2020/1/11 18:53 anfeel Exp $$
 */
public class test {

    @Test
    public void test1() throws IOException {
        Document doc = Jsoup.connect("http://bbs.hupu.com/topic").get();
        System.out.println(doc.title());
        Elements newHeadLines = doc.select("#mp-itn b a");
        for (Element headline : newHeadLines) {
            System.out.println(headline.attr("title") + "\n\t" + headline.absUrl("href"));
        }
    }
}
