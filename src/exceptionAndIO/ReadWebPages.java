package exceptionAndIO;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadWebPages {
	Pattern HYPER_PATTERN = Pattern.compile("<a href=\".*\">.*</a>");
	ArrayList<String> links = new ArrayList<String>();
	
	public static void main(String[] args) {
		ReadWebPages fristDepthOfSearch = new ReadWebPages();
		fristDepthOfSearch.readPage("http://java.sun.com//index.html");
		
		
		fristDepthOfSearch.readListOfLinks();
	}
	

	public void readPage(String linkURL) {
		Scanner in = null;
		try {
			in = getSteam(linkURL);
			while (in.hasNext()) {
				String line = in.nextLine();
				String hyperLink = getHyperLinks(line);
				String link = getLink(hyperLink);
				if (link != null) links.add(link);
			}
		} catch (MalformedURLException e) {
			System.err.println("Cannot find the link");
		} catch (IOException e) {
			System.err.println("Cannot read from the provided link");
		} finally {
			in.close();
		}
	}
	
	public void readListOfLinks() {
		for (String link: links)
			System.out.println(link);
	}
	
	public Scanner getSteam(String link) throws MalformedURLException, IOException{
		URL locator = new URL(link);
		Scanner in = new Scanner(locator.openStream());
		return in;
	}
	
	public String getHyperLinks(String line) {
		Matcher matchHyper = HYPER_PATTERN.matcher(line);
		String hyperLink = null;
		
		while (matchHyper.find())
			hyperLink = matchHyper.group();
		return hyperLink;
	}
	
	public String getLink(String line) {
		if (line != null) {
			Pattern linkPattern = Pattern.compile("\"(http:|https:)[/a-zA-Z0-9.]+\"");
			Matcher matchLink = linkPattern.matcher(line);
			String link = null;
			
			while (matchLink.find())
				link = matchLink.group();
			return link;
		}
		else return null;
	}
}
