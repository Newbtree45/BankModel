package bank;

public class Online extends Bank {
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String toString(){
	return("URL: "+url+ " "+ super.toString());
	}
}
