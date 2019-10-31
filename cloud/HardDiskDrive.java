package cloud;

import cloud.exceptions.CloudGenericException;

public class HardDiskDrive extends VirtualDevice {
	String id;						// Identificador único
	long capacityGB;				// Capacidad en GB
	String label;	                // Etiqueta
	
	private static final int MIN_CAPACITY = 1;
	private static final int CAPACITY_MULTIPLE = 40;


	public HardDiskDrive(long capacityGB, int unitNumber) throws CloudGenericException {
		super(unitNumber);

		
		if ( capacityGB < MIN_CAPACITY ) {
			throw new CloudGenericException("La capacidad minima es " + MIN_CAPACITY);
		}
		this.capacityGB = capacityGB;

		if ( capacityGB % CAPACITY_MULTIPLE != 0 ) {
			throw new CloudGenericException("La capacidad debe ser multiplo de " + CAPACITY_MULTIPLE);
		}

		StringBuilder sb = new StringBuilder();
		this.label = sb.append("Hard Disk ").append(unitNumber).toString();
		
	}

	
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		sb.append("Etiqueta : ").append(this.label).append("\n");
		sb.append("Unidad   : ").append(this.unitNumber).append("\n");
		sb.append("Capacidad: ").append(this.capacityGB).append("\n");
		
		return sb.toString();
	}
}
