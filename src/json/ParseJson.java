package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/*
 * ����json�ķ�ʽͨ��������
 * 
 * 1��ʹ��fastjson��API����
 * 2��ͨ��ʵ���༯��fastjson����
 * 
 * ��Ҫ�����ĸ�ʽ���£�
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
          //��ͼ����Ϣ���ڴ˴��ж�ƪ����
          ]
       },
       "update_time": UPDATE_TIME
   },
   //�����ж��ͼ����Ϣitem�ṹ
 ]
}

������ɺ��Ŀ��json��ʽ��
{
	��Ѷ��[
			{   },
			{   }
	    ],
	ͼ�ģ�[
			{   },
			{   }
	    ]
	...�������
}
 */

//ʹ�ô�fasjson API���н���
public class ParseJson {

	public void parseJson() {
		long start = System.currentTimeMillis();
		List<String> jsonString = new ArrayList<>();//��ȡ�����Ҫ������json�ַ���
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
					//ҵ���߼���news_title��������У��ͻ�ȡ��title��URL������������ж��Ƿ���"֪ͨ"�����оͻ�ȡtitle��URL
					String category = "";
					if (news_title.indexOf("��") != -1) {
						category = news_title.substring(0, news_title.indexOf("��"));
					} else {
						if (news_title.endsWith("֪ͨ")) {
							category = "����";
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
