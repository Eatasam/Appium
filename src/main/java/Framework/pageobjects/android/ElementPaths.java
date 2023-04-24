package Framework.pageobjects.android;

public enum ElementPaths {
USERNAME("com.rowriter.rotouchandroid:id/username","admin"),
PASSWORD("com.rowriter.rotouchandroid:id/password","touch"),
SOMEINT("com.rowriter.rotouchandroid:id/username",1);

	private String elementPath = "";
    private String key = "";
    private int someInt;

private ElementPaths(String elementPath,String key) {
	// TODO Auto-generated constructor stub
	this.elementPath = elementPath;
	this.key = key;
}

private ElementPaths(String elementPath,int someInt) {
	// TODO Auto-generated constructor stub
	this.elementPath = elementPath;
	this.someInt = someInt;
}
public String getPath() {
	return elementPath;
}
public String getKey() {
	return key;
}

public int getSomeInt() {
	return someInt;
}
}
