package ca.eaq.transformers.models;

public class UrlInfo {

	private String transformers;
	private String transformer;
	private String battle;

	public UrlInfo() {
		this.transformers = "/transformers/";
		this.transformer = "/transformer/{id}/";
		this.battle = "/battle/";
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

}
