package be.technifutur.thibault.AppMVCExo;

import java.util.HashMap;
import java.util.Map;

public class Model {
	
	private boolean finish;
	private Map<String,String> appMap = new HashMap<String,String>();
	
	public void addToMap(String s1, String s2) {
		this.appMap.put(s1, s2);
	}
	
	public void removeFromMap(String s1, String s2) {
		this.appMap.remove(s1);
	}
	
	public void setFinish(boolean b) {
		this.finish = b;
	}
	
	public boolean getFinish() {
		return this.finish;
	}
	
	public Map<String, String> getMap(){
		return this.appMap;
	}

}
