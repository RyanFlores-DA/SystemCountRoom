
package MAIN;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class OpenWeather {
    
    private String temperatura;
    private String descricao;

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
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
                        
                        //JSONArray weather = obj.getJSONArray("weather");
                        //int lat = obj.getInt("lat");
                        //System.out.println("Lat: " + lat);
                        //FORMATANDO JSON PARA PEGAR RESULTADOS ESPECIFICOS
                        JSONObject res = obj.getJSONArray("weather").getJSONObject(0);
                        System.out.println("Id da Cidade: "+res.getInt("id"));
                        String clima ="";
                        if("Clouds".equals(res.getString("main"))){
                            clima = "Nublado";
                            System.out.println("Clima: " + clima );
                        }
                        
			//System.out.println(json);
			conn.disconnect();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    
}
