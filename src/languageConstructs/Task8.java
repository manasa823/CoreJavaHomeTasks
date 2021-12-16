package languageConstructs;

public class Task8 {
	
	public String withoutString(String base, String remove) {
		  String result = base.replaceAll("(?i)"+remove,"");
		  return result;
		}
}
