package json;

import java.util.ArrayList;

public class Pojo {

	public int total_count;
	public int item_count;
	public ArrayList<Item> item;

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public int getItem_count() {
		return item_count;
	}

	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}

	public class Item {
		public String media_id;
		public Content content;

		public String getMedia_id() {
			return media_id;
		}

		public void setMedia_id(String media_id) {
			this.media_id = media_id;
		}

		public Content getContent() {
			return content;
		}

		public void setContent(Content content) {
			this.content = content;
		}

		public class Content {
			public ArrayList<NewsItem> news_item;
			public String update_time;

			public ArrayList<NewsItem> getNews_item() {
				return news_item;
			}

			public void setNews_item(ArrayList<NewsItem> news_item) {
				this.news_item = news_item;
			}

			public String getUpdate_time() {
				return update_time;
			}

			public void setUpdate_time(String update_time) {
				this.update_time = update_time;
			}

			public class NewsItem {
				public String title;
				public String thumb_media_id;
				public String show_cover_pic;
				public String author;
				public String digest;
				public String content;
				public String url;
				public String content_source_url;

				public String getTitle() {
					return title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getThumb_media_id() {
					return thumb_media_id;
				}

				public void setThumb_media_id(String thumb_media_id) {
					this.thumb_media_id = thumb_media_id;
				}

				public String getShow_cover_pic() {
					return show_cover_pic;
				}

				public void setShow_cover_pic(String show_cover_pic) {
					this.show_cover_pic = show_cover_pic;
				}

				public String getAuthor() {
					return author;
				}

				public void setAuthor(String author) {
					this.author = author;
				}

				public String getDigest() {
					return digest;
				}

				public void setDigest(String digest) {
					this.digest = digest;
				}

				public String getContent() {
					return content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getUrl() {
					return url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getContent_source_url() {
					return content_source_url;
				}

				public void setContent_source_url(String content_source_url) {
					this.content_source_url = content_source_url;
				}

			}
		}
	}
}
