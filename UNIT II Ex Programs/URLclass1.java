// Java program to demonstrate working of URL 
import java.net.MalformedURLException; 
import java.net.URL; 
public class URLclass1 
{ public static void main(String[] args) throws MalformedURLException 
	{ // creates a URL with string representation. 
		URL url1 = 
		new URL("http://bvicam.in/spec-subject-files/Object%20Oriented%20Programming%20and%20JAVA%20"); 
		// creates a URL with a protocol,hostname,and path 
		URL url2 = new URL("http", "www.bvicam.ac.in", "/bjit/"); 
		URL url3 = new URL("http://bvicam.in/search/node/faculty"); 
		// print the string representation of the URL. 
		System.out.println("URL1:"+url1.toString()); 
		System.out.println("URL2:"+url2.toString()); 
		System.out.println(); 
		System.out.println("Different components of the URL3-"); 
		// retrieve the protocol for the URL 
		System.out.println("Protocol:- " + url3.getProtocol()); 
		// retrieve the hostname of the url 
		System.out.println("Hostname:- " + url3.getHost()); 
		// retrieve the defalut port 
		System.out.println("Default port:- " + url3.getDefaultPort()); 
		// retrieve the query part of URL 
		System.out.println("Query:- " + url3.getQuery()); 
		// retrive the path of URL 
		System.out.println("Path:- " + url3.getPath()); 
		// retrive the file name 
		System.out.println("File:- " + url3.getFile()); 
		// retrieve the reference 
		System.out.println("Reference:- " + url3.getRef()); 
	} 
} 
