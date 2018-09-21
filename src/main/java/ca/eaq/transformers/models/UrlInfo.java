package ca.eaq.transformers.models;

public class UrlInfo {

	private String transformers;
	private String battle;
	private String documentation;

	public UrlInfo() {
		this.transformers = "/transformers/";
		this.battle = "/battle/";
		this.documentation = "/swagger-ui.html#/";
	}

	public String getTransformers() {
		return transformers;
	}

	public String getBattle() {
		return battle;
	}
	
	public String getDocumentation() {
		return documentation;
	}

}
