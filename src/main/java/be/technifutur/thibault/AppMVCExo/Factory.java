package be.technifutur.thibault.AppMVCExo;

import be.technifutur.applicationMVC.MVCFactory;

public class Factory implements MVCFactory<Model> {

	private Model model;
	private Controller ctrl;
	private Vue vue;

	public Model getModel() {
		if (this.model == null) {
			this.model = new Model();
		}
		return this.model;
	}

	public Controller getController() {
		if (this.ctrl == null) {
			this.ctrl = new Controller();
		}
		return this.ctrl;
	}

	public Vue getVue() {
		if (this.vue == null) {
			this.vue = new Vue();
		}
		return this.vue;
	}

}
