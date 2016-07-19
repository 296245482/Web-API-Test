package Jackie;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 29624 on 2016/7/7.
 */
public class Auth {
    public static String getAuth(String param){

        String sid = "";
        String url = "http://demochina.synology.me:7090/webapi/" +
                        Info.getPath("http://demochina.synology.me:7090/webapi/query.cgi",
                        "api=SYNO.API.Info&method=Query&version=1&query=SYNO.API.Auth,SYNO.SurveillanceStation");
        System.out.println(url);


        String temp = Request.sendGet(url, param);
        try{
            JSONObject json = new JSONObject(temp);
            sid = json.getString("data");

            JSONObject json2 = new JSONObject(sid);
            sid = json2.getString("sid");
        }catch(JSONException e){
            e.printStackTrace();
        }
        System.out.println(sid);
        return sid;
    }
}
