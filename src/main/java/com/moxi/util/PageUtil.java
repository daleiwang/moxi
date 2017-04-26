package com.moxi.util;

public class PageUtil {

	
	public static String getPageContent(String url,int pageCount,int pageCurrent){
		
		
		String first = url.replace("%page%", 0+"");
		String prev = url.replace("%page%", pageCurrent-1+"");
		
		String last = url.replace("%page%", 0+"");
		String next = url.replace("%page%", 0+"");
		
		
		StringBuffer html = new StringBuffer();
		
		html.append("<li class=\"footable-page-arrow"+(pageCurrent<=1?" disabled":"")+"\"><a href=\""+first+"\">«</a></li>");
		html.append("<li class=\"footable-page-arrow"+(pageCurrent<=1?" disabled":"")+"\"><a href=\"#first\">‹</a></li>");
		
		for(int i = 0 ;i < pageCount; i++){
			
			html.append("<li class=\"footable-page-arrow\"><a href=\"#first\">«</a></li>");
		}
		
		html.append("<li class=\"footable-page-arrow\"><a href=\"#first\">«</a></li>");
		html.append("<li class=\"footable-page-arrow\"><a href=\"#first\">«</a></li>");
		
		
		
		
		
		return "";
	}
	
}


//<li class="footable-page-arrow disabled"><a href="#first">«</a></li>
//<li class="footable-page-arrow"><a href="#prev">‹</a></li>
//<li class="footable-page"><a href="#">1</a></li>
//<li class="footable-page active"><a href="#">2</a></li>
//<li class="footable-page"><a href="#">3</a></li>
//<li class="footable-page"><a href="#">4</a></li>
//<li class="footable-page"><a href="#">5</a></li>
//<li class="footable-page-arrow"><a href="#next">›</a></li>
//<li class="footable-page-arrow"><a href="#last">»</a></li>

