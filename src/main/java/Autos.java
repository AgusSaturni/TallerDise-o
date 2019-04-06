
public class Autos {

public boolean encendido = false;
public int velocidad=0;

public void encender() {
	encendido = true;
}

public void apagar() {
	encendido = false;
}
public void frenar() {
	velocidad = 0;
}

public void acelerar(int velocidadPedida) {
	velocidad = velocidadPedida;
}

}

