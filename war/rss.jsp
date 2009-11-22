<%@ page contentType="text/xml;charset=UTF-8" language="java" %>
<%@ page import="com.swradioafrica.model.ContentItem" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>

<% List<ContentItem> contentItems = (List<ContentItem>)request.getAttribute("contentItems"); %>
<rss>
	<channel>
		<title>SW Radio Africa</title>
		<link>http://www.swradioafrica.com</link>
		<description>The independent voice of Zimbabwe</description>
		<language>en-gb</language>
		<lastBuildDate><%= new Date() %></lastBuildDate>
		
		<% for(ContentItem item : contentItems) { %>
		<item>
			<title><%= item.title %></title>
			<link><%= item.url %></link>
			<description><%= item.body %></description>
			<pubDate><%= item.publishedDate %></pubDate>
		</item>
		<% } %>
	</channel>
</rss>