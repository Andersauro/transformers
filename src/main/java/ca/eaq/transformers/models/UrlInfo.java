package ca.eaq.transformers.models;

public class UrlInfo {

	private String transformers;
	private String transformer;
	private String battle;
	private String documentation;

	public UrlInfo() {
		this.transformers = "/transformers/";
		this.transformer = "/transformer/{id}/";
		this.battle = "/battle/";
		this.documentation = "/swagger-ui.html#/";
	}

	public String getTransformers() {
		return transformers;
	}

	public String getTransformer() {
		return transformer;
	}

	public String getBattle() {
		return battle;
	}
	
	public String getDocumentation() {
		return documentation;
	}

}
