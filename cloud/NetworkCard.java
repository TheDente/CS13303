package cloud;

import cloud.exceptions.CloudGenericException;
import cloud.util.CloudUtil;

public class NetworkCard extends VirtualDevice {
	public static final int MAX_SPEED_MB = 100;            
	public final String macAddress;             
	public final String label;
	public int speedMb = MAX_SPEED_MB;
	public String network;                                         

	
	NetworkCard(int unitNumber) throws CloudGenericException{
		super(unitNumber); 	

		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		this.label = sb.append("Network Card ").append(unitNumber).toString();
		// }
		this.macAddress = CloudUtil.getMACAddress();

		if (unitNumber < 1){
			throw new CloudGenericException ("El valor de unitNumber debe ser mayor a 1");
		}
	}
	
	NetworkCard(String network, int unitNumber)throws CloudGenericException{
		super(unitNumber);

		this.network = network;
		
		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		this.label = sb.append("Network Card ").append(unitNumber).toString();
		// }
		this.macAddress = CloudUtil.getMACAddress();

		if (unitNumber < 1){
			throw new CloudGenericException ("El valor de unitNumber debe ser mayor a 1");
		}

	}

	NetworkCard(String network, int unitNumber, int speedMb)throws CloudGenericException{
		super(unitNumber);

		this.network = network;
		this.speedMb = speedMb;
		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		this.label = sb.append("Network Card ").append(unitNumber).toString();
		// }
		this.macAddress = CloudUtil.getMACAddress();

		if (unitNumber < 1){
			throw new CloudGenericException ("El valor de unitNumber debe ser mayor a 1");
		}
	}
	
	/*
	 * NetworkCard[2]
	 * Sobrecargar el método java.lang.Object.toString() para
	 * mostrar la representación en String de NetworkCard
	 * como lo hacía CloudUtil.printNICInfo()
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {
		sb.append("Etiqueta : ").append(this.label).append("\n");
		sb.append("Unidad   : ").append(this.unitNumber).append("\n");
		sb.append("MAC      : ").append(this.macAddress).append("\n");
		sb.append("Network  : ").append(this.network).append("\n");
		sb.append("Velocidad: ").append(this.speedMb).append("\n");
		// }
		return sb.toString();
	}
}
