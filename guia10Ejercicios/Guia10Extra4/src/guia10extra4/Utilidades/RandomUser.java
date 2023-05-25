/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia10extra4.Utilidades;

import guia10extra4.Entidad.Alumno;
import guia10extra4.Servicio.AlumnoServicio;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

/**
 *
 * @author diego
 */
public class RandomUser {

    public static LinkedList<Alumno> getUsuarios(int cantidadUsuarios) {
        try {
            String urlApi = "https://randomuser.me/api/?results="+cantidadUsuarios+"&inc=id,name";
            URL dataPersonas = new URL(urlApi);
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
                informationString.delete(0, 11); //Elimina los caracteres innecesarios del inicion de la respuesta de la API
                informationString.delete(informationString.lastIndexOf("info") - 2, informationString.length()); //Elimina los caracteres innecesarios al final de la respuesta de la API
                System.out.println(informationString);
                return procesarString(informationString.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new LinkedList<>();
    }
    
    private static LinkedList<Alumno> procesarString(String personas) throws ParseException {
        AlumnoServicio studentService = new AlumnoServicio();
        LinkedList<Alumno> alumnosEgg = new LinkedList<>();
        Object obj = JSONValue.parse(personas);
        JSONArray array = (JSONArray) obj;
        System.out.println(array.size());
        array.forEach(alumno -> {
            JSONObject rawFullNameData = (JSONObject) ((JSONObject) alumno).get("name");
            JSONObject rawIdData = (JSONObject) ((JSONObject) alumno).get("id");
            
            if (!rawIdData.toString().contains("null")) {
                String nombreAlumno = rawFullNameData.get("first").toString();
                String apellidoAlumno = rawFullNameData.get("last").toString();
                Long idAlumno = Long.valueOf(rawIdData.get("value").toString().replaceAll("[^\\d]", ""));
//                System.out.println(nombreAlumno + " " + apellidoAlumno + " " + idAlumno);
                alumnosEgg.add(studentService.crearAlumno(nombreAlumno, apellidoAlumno, idAlumno, 0));
            }
        });
        return alumnosEgg;
    }
}
