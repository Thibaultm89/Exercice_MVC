package be.technifutur.thibault.AppMVCExo;

import java.util.Map;

public class Vue implements be.technifutur.applicationMVC.Vue<Model>{
	
	private Model model;

	@Override
	public void start() {
		
	}

	@Override
	public StringBuilder getScreen() {
		StringBuilder sb = new StringBuilder();
		sb.append("Voici le tableau de valeurs");
		Map<String, String> map = this.model.getMap();
		
		for (String key: map.keySet()) {
			sb.append(key + " - " + map.get(key));
		}
		return sb;
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void setModel(Model model) {
		this.model = model;
		
	}

}
