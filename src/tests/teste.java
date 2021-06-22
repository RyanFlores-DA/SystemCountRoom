
package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class teste {
    public static void main(String[] Args){
    
        JSONObject jsonObject;
        
	JSONParser parser = new JSONParser();
        
        String nome, sobrenome, cidade, pais;
        
        try {
			//Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader(
					"src/testes/configs.json"));

			//Salva nas variaveis os dados retirados do arquivo
			nome = (String) jsonObject.get("nome");
			sobrenome = (String) jsonObject.get("sobrenome");
			cidade = (String) jsonObject.get("estado");
			pais = (String) jsonObject.get("pais");

			System.out.printf(
					"Nome: %s\nSobrenome: %s\nEstado: %s\nPais: %s\n",
					nome, sobrenome, cidade, pais);
		}
		//Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    
    
    
    }
}
