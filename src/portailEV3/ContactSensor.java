package portailEV3;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3TouchSensor;

public class ContactSensor {

	EV3TouchSensor contactSensor;

	ContactSensor(Port port) {
		this.contactSensor = new EV3TouchSensor(port);
	}

	boolean contact() {

		float[] sample = new float[contactSensor.sampleSize()];
		contactSensor.fetchSample(sample, 0);

		float etat = sample[0];
		
		// (�tat==1) c'est un bool�en Il renvoie vrai si �tat vaut 1, faux sinon
		return etat == 1;

	}

}
