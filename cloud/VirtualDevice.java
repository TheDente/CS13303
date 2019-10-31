package cloud;

public class VirtualDevice{

   // protected final int key;
   /*
    public VirtualDevice(int key, int unitNumber) {
        this.key = key;
        this.unitNumber = unitNumber;
    }

    public int getkey()
    {
        return this.key;
    }
*/

    protected int unitNumber;
    protected Description descripcion;

    public VirtualDevice(int unitNumber) {
        this.unitNumber = unitNumber;
    }

 
    public int getunitNumber()
    {
        return this.unitNumber;
    }

    public Description getdescripcion(){
        return this.descripcion;
    }

    public void setunitNumber(int unitNumber)
    {
        this.unitNumber = unitNumber;
    }

    public void setdescripcion(Description descripcion) {
       
        this.descripcion = descripcion;

    }



}