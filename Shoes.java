package lawrence.java.coding;

public class Shoes {
	private String kind;
	
	public Shoes(String kind) {
		this.kind = kind;
	}
	public void newFeatures() {
		System.out.println("New Features");
	}
	public void setNewFeatures(String kind) {
		this.kind = kind;
	}
	public String getNewFeatures() {
		return kind;
	}
	
}
