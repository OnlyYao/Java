package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/*
 * 解析json的方式通常有两种
 * 
 * 1、使用fastjson的API解析
 * 2、通过实体类集合fastjson解析
 * 
 * 需要解析的格式如下：
 * {
  "total_count": TOTAL_COUNT,
  "item_count": ITEM_COUNT,
  "item": [{
      "media_id": MEDIA_ID,
      "content": {
          "news_item": [{
              "title": TITLE,
              "thumb_media_id": THUMB_MEDIA_ID,
              "show_cover_pic": SHOW_COVER_PIC(0 / 1),
              "author": AUTHOR,
              "digest": DIGEST,
              "content": CONTENT,
              "url": URL,
              "content_source_url": CONTETN_SOURCE_URL
          },
          //多图文消息会在此处有多篇文章
          ]
       },
       "update_time": UPDATE_TIME
   },
   //可能有多个图文消息item结构
 ]
}

解析完成后的目标json格式：
{
	资讯：[
			{   },
			{   }
	    ],
	图文：[
			{   },
			{   }
	    ]
	...更多分类
}
 */

//使用纯fasjson API进行解析
public class ParseJson {

	public void parseJson() {
		long start = System.currentTimeMillis();
		List<String> jsonString = new ArrayList<>();//获取多个需要解析的json字符串
		Map<String, List<Map<String, String>>> categoryData = new HashMap<>();
		for (String string : jsonString) {
			JSONObject jsonResult = JSONObject.parseObject(string);
			JSONArray itemArray = jsonResult.getJSONArray("item");
			for (int i = 0; i < itemArray.toArray().length; i++) {
				JSONObject itemObject = itemArray.getJSONObject(i);
				JSONObject contentObject = itemObject.getJSONObject("content");
				JSONArray newsArray = contentObject.getJSONArray("news_item");
				for (int j = 0; j < newsArray.toArray().length; j++) {
					JSONObject newsObject = newsArray.getJSONObject(j);
					String news_title = newsObject.getString("title");
					//业务逻辑：news_title中如果含有：就获取该title和URL，如果不含则判断是否含有"通知"，含有就获取title和URL
					String category = "";
					if (news_title.indexOf("：") != -1) {
						category = news_title.substring(0, news_title.indexOf("："));
					} else {
						if (news_title.endsWith("通知")) {
							category = "公告";
						} else {
							continue;
						}
					}
					String news_url = newsObject.getString("url");
					Map<String, String> map = new HashMap<>();
					map.put("title", news_title);
					map.put("url", news_url);
					if (!categoryData.containsKey(category)) {
						categoryData.put(category, new ArrayList<Map<String,String>>());
					}
					categoryData.get(category).add(map);
				}
			}
		}
		JSONObject object = (JSONObject) JSONObject.toJSON(categoryData);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(object);
	}
}
