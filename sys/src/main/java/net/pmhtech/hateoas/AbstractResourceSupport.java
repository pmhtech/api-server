package net.pmhtech.hateoas;

import java.util.List;
import java.util.Map;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.http.ResponseEntity;

public abstract class AbstractResourceSupport extends ResourceSupport{
	
	private List<Link> resourceLinks;
	private List<Link> contentsResourceLinks;
	
	public ResponseEntity<Map<String,Object>>createHATEOAS(List<Map<String,Object>> listMap, String apikey) throws Exception {
		
		ResponseEntity<Map<String,Object>> resourceEntity = new ResponseEntity<Map<String,Object>>(null);
	
		this.add(this.resourceLinks);
		return resourceEntity;
	}
	
	public abstract void setResourceLink(List<Link> resourceLinks);
	public List<Link> getResourceLink(){
		return this.resourceLinks;
	}
}