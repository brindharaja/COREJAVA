import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser extends DefaultHandler {
    public static void main(String[] args) {
        try{
            SAXParserFactory fact=SAXParserFactory.newInstance();
            SAXParser parser=fact.newSAXParser();
            parser.parse(new File("C:\\Users\\rbrin\\IdeaProjects\\untitled\\Day14\\src\\College.xml"),new SaxParser());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void startDocument() throws SAXException{
        System.out.println("Docx Started");
    }
    public void endDocument() throws SAXException{
        System.out.println("Docx Ended");
    }
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
        System.out.println("Start Element ::"+qName);
    }
    public void endElement(String uri,String localName, String qName) throws SAXException{
        System.out.println("End Element ::"+qName);
    }
    public void characters(char[] ch,int start,int length) throws SAXException{
        System.out.println("Character ::"+new String(ch,start,length));
    }
}