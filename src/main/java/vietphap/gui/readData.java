package vietphap.gui;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readData {
    public static void main(String[] arg) throws IOException, ParseException {

        JSONParser jsonparser=new JSONParser();

        FileReader reader=new FileReader(".DiaDiem.json");

        Object obj=jsonparser.parse(reader);

        JSONObject empjisonobj=(JSONObject)obj;

        String HC =(String) empjisonobj.get("Historical_Characters");
        String Tit =(String) empjisonobj.get("Title");
        String ID =(String) empjisonobj.get("ID");
        String HE =(String) empjisonobj.get("Historical_Events");

        System.out.println("Nhân vật: "+HC);
        System.out.println("Nhan đề: "+Tit);
        System.out.println("ID: "+ID);
        System.out.println("Sự kiện lịch sử: "+HE);

    }
}
