
package DTO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiDTO {
    private double temperatura;
    private String descricao;
    
    public ApiDTO(){
    
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void apiResult(){
        try{
			URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Recife&lang=pt_br&appid=061f8b2693bdec8c084095b022fadb06&&units=metric");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			if (conn.getResponseCode() != 200) {
				System.out.print("deu erro... HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output,json="";
			while ((output = br.readLine()) != null) {
				json += output;
			}
                        JSONObject obj = new JSONObject(json);
                        //FORMATANDO JSON PARA PEGAR RESULTADOS ESPECIFICOS
                        JSONObject res = obj.getJSONArray("weather").getJSONObject(0);
                        JSONObject res2 = obj.getJSONObject("main");

                        //System.out.println("Temperatura da Cidade: "+res2.getDouble("temp"));
                        //System.out.println("Id da Cidade: "+res.getInt("id"));
                        setTemperatura(res2.getDouble("temp"));
                        setDescricao(res.getString("description"));
			conn.disconnect();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
}
