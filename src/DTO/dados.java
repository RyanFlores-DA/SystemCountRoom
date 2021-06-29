
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


public class dados {
    private Document document;
    public dados (Document document){
        this.document = document;
    }
    public static void main(String[] Args){
        try {
            Document document = Jsoup.connect("http://www.bde.pe.gov.br/visualizacao/Visualizacao_formato2.aspx?codFormatacao=1569&CodInformacao=1300&Cod=3").get();
            dados parseTexto = new dados(document);
            parseTexto.getTexto();
        } catch (IOException ex) {
            Logger.getLogger(HtmlYear.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getTexto() {
        Elements elements = document.getElementsByTag("tr");
        for(Element element : elements){
            String test = element.getElementsByClass("dadoNum_n2_impar").text();
            //String textoBibl = element.getElementsByTag("p").text();
            System.out.println(test);
        }
    }
   /* public List<HtmlYear> getParserText(){
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
    }*/
}
