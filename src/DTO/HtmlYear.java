
package DTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlYear {
    private Document document;
    private String textoDoAno;
    private String diaTextoAno;

    public String getTextoDoAno() {
        return textoDoAno;
    }

    public String getDiaTextoAno() {
        return diaTextoAno;
    }

    public HtmlYear(String textoDoAno, String diaTextoAno) {
        this.textoDoAno = textoDoAno;
        this.diaTextoAno = diaTextoAno;
    }
    
    public HtmlYear(Document document){
        this.document = document;
    }
    public static void main(String[] Args){
        try {
            Document document = Jsoup.connect("https://wol.jw.org/pt/wol/h/r5/lp-t").get();
            HtmlYear parseTexto = new HtmlYear(document);
            parseTexto.getTexto();
        } catch (IOException ex) {
            Logger.getLogger(HtmlYear.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getTexto() {
        Elements elements = document.getElementsByClass("tabContent");
        for(Element element : elements){
            String textoAno = element.getElementsByTag("h2").text();
            String textoBibl = element.getElementsByTag("p").text();
            System.out.println(textoAno + "\n" + textoBibl);
        }
    }
    public List<HtmlYear> getParserText(){
        HtmlYear parser;
        List<HtmlYear> parserList = new ArrayList<HtmlYear>();
        Elements elements = document.getElementsByClass("tabContent");
        for(Element element : elements){
            String txtDia = element.getElementsByTag("h2").text();
            String textoBibl = element.getElementsByTag("p").text();
            System.out.println(txtDia + "\n" + textoBibl);
            
            parser = new HtmlYear(textoBibl,txtDia);
            parserList.add(parser);
        }
        return parserList;
    }
}
