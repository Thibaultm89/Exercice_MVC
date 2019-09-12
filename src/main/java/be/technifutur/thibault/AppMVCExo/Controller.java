package be.technifutur.thibault.AppMVCExo;

public class Controller implements be.technifutur.applicationMVC.Controller<Model> {

	private Model model;

	public void start() {
		this.model.setFinish(false);

	}

	public boolean isFinish() {
		return this.model.getFinish();
	}

	public void newInput(String input) {
		String key = "";
		String value = "";
		String[] array = input.split(",");
		key = array[0].substring(1);
		value = array[1];

		if (input.charAt(0) == '+') {
			model.addToMap(key, value);
		} else if (input.charAt(0) == '-') {
			model.removeFromMap(key, value);
		} else if (input.charAt(0) == 'q') {
			stop();
		}
			
	}

	public boolean hasLastScreen() {
		return true;
	}

	public void stop() {
		this.model.setFinish(true);

	}

	public void setModel(Model model) {
		this.model = model;

	}

}
