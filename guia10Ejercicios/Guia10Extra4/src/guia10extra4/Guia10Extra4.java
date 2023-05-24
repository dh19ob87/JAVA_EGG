/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia10extra4;

/**
 *
 * @author diego
 */
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author diego
 */

class Persona {
    public long id;
    public String nombre;
    
    public Persona (){}
    
    public Persona (long id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

public class Guia10Extra4 {

    public static void main(String[] args) {
        try {
            URL dataPersonas = new URL("https://randomuser.me/api/?results=10&inc=id,name");
//            URLConnection urlCon = dataPersonas.openConnection();
            HttpURLConnection conexion = (HttpURLConnection) dataPersonas.openConnection();
            conexion.setRequestMethod("GET");
            conexion.connect();

            int codigoRespuesta = conexion.getResponseCode();

            if (codigoRespuesta != 200) {
                System.out.println(codigoRespuesta);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner input = new Scanner(dataPersonas.openStream());

                while (input.hasNext()) {
                    informationString.append(input.nextLine());
                }

                input.close();
                informationString.delete(0, 11);
                int longitud = informationString.length();
                System.out.println(informationString.lastIndexOf("info"));
                informationString.delete(informationString.lastIndexOf("info")-2, longitud);
                System.out.println(informationString);

                procesarString(informationString.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void procesarString(String personas) throws ParseException {
        List<JSONArray> nombre;
        System.out.println("personas" + personas);
        System.out.println("Decodificando");
        Object obj = JSONValue.parse(personas);
        JSONArray array = (JSONArray) obj;
        JSONObject objeto = (JSONObject) array.get(0);
        System.out.println("Objeto nombre");
        System.out.println(objeto.get("name"));
        JSONObject last = (JSONObject) objeto.get("name");
        System.out.println("nombre " + last.get("last"));
        System.out.println("Retornando un item");
        nombre = Arrays.asList(array);
        nombre.forEach(System.out::println);
        System.out.println("=====================================");
        JSONParser parser = new JSONParser();
        Object a = parser.parse(personas);
        JSONArray b = (JSONArray) a;
        System.out.println("Campos");
        System.out.println(b.get(0));
        System.out.println("Campos");
        JSONObject c = (JSONObject) b.get(0);
        System.out.println(c.get("id"));
        JSONObject d = (JSONObject) c.get("id");
        System.out.println("id value");
        System.out.println(d.get("value"));
    }
}