package com.example.demo.utils.region;

import net.sf.json.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 创建人:连磊
 * 日期: 2018/5/19. 15:30
 * 描述：
 */
public class IpRegionUtil {

    private static Logger logger = LoggerFactory.getLogger(IpRegionUtil.class);

    public static String host = "http://iploc.market.alicloudapi.com";

    public static String path = "/v3/ip";

    public static String method = "GET";

    public static String appCode = "0a4510c9650f465a984683c3a162203e";

    public static String getIpRegion(String ip){
        String region = "";
        String host = "http://iploc.market.alicloudapi.com";
        String path = "/v3/ip";
        String method = "GET";
        String appcode = "0a4510c9650f465a984683c3a162203e";//"你自己的AppCode";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("ip",ip);
        JSONObject jsonObject = null;
        if (ip.matches("(0:0:0:0:0:0:0:1|127.0.0.1)")){
            logger.debug("当前访问是在本机上。。。。");
            return "";
        }
        try {
            HttpResponse httpResponse = HttpUtils.doGet(host, path, method, headers, querys);
            jsonObject = JSONObject.fromObject( EntityUtils.toString(httpResponse.getEntity(),"UTF-8"));
            System.out.println(jsonObject.toString());
            if (!jsonObject.containsKey("province")){
                return "";
            }
            String province = jsonObject.getString("province");
            if (province.equals("局域网")){
                logger.debug("当前访问使用的是局域网，无法破解。。。。。");
                return "";
            }
            region = province + jsonObject.getString("city");
        }catch (Exception e){
            e.printStackTrace();
        }
        return region;
    }

}
