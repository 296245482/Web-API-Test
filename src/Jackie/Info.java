package Jackie;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 29624 on 2016/7/7.
 */
public class Info {
    public static String getPath(String url, String param) {
        //发送 GET 请求
//        String s = Request.sendGet("http://demochina.synology.me:7090/webapi/query.cgi",
//                                          "api=SYNO.API.Info&method=Query&version=1&query=SYNO.API.Auth,SYNO.SurveillanceStation");
        String s = Request.sendGet(url, param);
//        System.out.println(s);
        String path = "";
        try{
            JSONObject json = new JSONObject(s);
            path = json.getString("data");

            JSONObject json2 = new JSONObject(path);
            path = json2.getString("SYNO.API.Auth");

            JSONObject json3 = new JSONObject(path);
            path = json3.getString("path");
        }catch(JSONException e){
            e.printStackTrace();
        }
        System.out.println(path);
        return path;
    }
//    public static void main(String[] args){
//        getPath("http://demochina.synology.me:7090/webapi/query.cgi",
//                                          "api=SYNO.API.Info&method=Query&version=1&query=SYNO.API.Auth,SYNO.SurveillanceStation");
//    }
}
