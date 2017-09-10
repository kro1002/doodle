package parsingDoodle;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class musicdevelopmentsParsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document doc = null;
		try {
			//doc = Jsoup.connect("http://www.ssaurel.com/blog").get();
			doc = Jsoup.connect("http://www.musicdevelopments.com/").get();
			
			String title = doc.title();
			System.out.println("Title:" + title);
			
			
			//배열
			Elements links = doc.select("a[href]");
			
			for(Element link : links) {
				System.out.println("\nLink : " + link.attr("href"));
				System.out.println("Text : " + link.text());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

/* a[href]에 대한 for문으로 텍스트를 가져온다. 첫번재 텍스트는 주조(href) 두번째는 태그사이에 있는 name(text) 
 * 
 * 아래는 요소검사에 있는 내용
 * <title>Music Prototyping and Automated Music Composition Software - RapidComposer</title>

 * <tr align="left"><td><a href="http://www.musicdevelopments.com/rapidcomposer.html" class="mainlevel" id="active_menu">RapidComposer</a></td></tr>

 * 
 * 
 * 
 * 
 * 
 * 
 * */

