package com.swradioafrica.utils;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class UrlShortener {

	@Inject private PropertiesRepository propertiesRepository;
	
	public String shorten(String url) throws Exception {
		String API_STRING = "http://api.j.mp/shorten?version=2.0.1&longUrl=%s&login=%s&apiKey=%s";
		String USERNAME = propertiesRepository.loadProperties().JMPUsername;
		String API_KEY = propertiesRepository.loadProperties().JMPKey;
			
		String api_url = String.format(API_STRING, url, USERNAME, API_KEY);
		//HttpClient httpClient = new HttpClient();
		//Response response = httpClient.get(api_url);
		//JSONObject jsonObject = response.asJSONObject();
		//String shortUrl = jsonObject.getJSONObject("results").getJSONObject(url).getString("shortUrl");
		
		return "";
	}
}
