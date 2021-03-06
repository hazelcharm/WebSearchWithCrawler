//============================================================================
// Name        : CrawledURL.java
// Author      : Srilakshmi Sruthi Pasumarthy
// Description : This class is used as a custom data structure- has two attributes crawled URL and it's depth.
//============================================================================

public class CrawledURL implements Comparable<CrawledURL>{

	public int depth;
	public String url;
	
	public CrawledURL(int depth, String url) {
		super();
		this.depth = depth;
		this.url = url;
		
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	@Override
	public int compareTo(CrawledURL compareObj) {
		
		int compareDepth = ((CrawledURL) compareObj).getDepth();
		
		return this.depth - compareDepth;
	}
	
}
