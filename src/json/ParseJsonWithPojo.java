package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import json.Pojo.Item;
import json.Pojo.Item.Content;
import json.Pojo.Item.Content.NewsItem;

/*
��Ҫ�����ĸ�ʽ���£�
 {
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
			{  
				"name":NAME,
				"url":URL
			 },
			{ 
				"name":NAME,
				"url":URL
			 }
	    ],
	ͼ�ģ�[
			{  
				"name":NAME,
				"url":URL
			 },
			{  
				"name":NAME,
				"url":URL
			 }
	    ]
	...�������
}
*/

//ʹ��ʵ������fastjson API�ķ�ʽ����json���ݣ���ʵ����Ϊ��
public class ParseJsonWithPojo {
	
	public void parseJosn() {
		long start = System.currentTimeMillis();
		List<String> jsonString = new ArrayList<>();//��ȡ�����Ҫ������json�ַ���
		Map<String, List<Map<String, String>>> categoryData = new HashMap<>();
		for (String string : jsonString) {
			Pojo pojo = JSONObject.parseObject(string, Pojo.class);
			ArrayList<Item> items = pojo.item;			
			for (int i = 0; i < items.size(); i++) {
				Content content = items.get(i).content;
				ArrayList<NewsItem> newsItem = content.news_item;
				for (int j = 0; j < newsItem.size(); j++) {
					String title = newsItem.get(j).title;
					
					String category = "";
					if (title.indexOf("��") != -1) {
						category = title.substring(0, title.indexOf("��"));
					} else {
						if (title.endsWith("֪ͨ")) {
							category = "����";
						} else {
							continue;
						}
					}
					String news_url = newsItem.get(j).url;
					Map<String, String> map = new HashMap<>();
					map.put("title", title);
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
