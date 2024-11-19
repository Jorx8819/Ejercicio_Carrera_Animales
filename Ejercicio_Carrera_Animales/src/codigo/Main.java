package codigo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("Simba");
        Animal perro = new Animal("Luna");
        Animal zorro = new Animal("Thor");
        Random rn = new Random();
        for (int turno = 1; turno <= 10; turno++) {
            gato.correr(rn.nextInt(9) + 1);
            perro.correr(rn.nextInt(9) + 1);
            zorro.correr(rn.nextInt(9) + 1);
        }
        System.out.println(gato.getNombre() + " " + gato.getDistancia() + " metros");
        System.out.println(perro.getNombre() + " " + perro.getDistancia() + " metros");
        System.out.println(zorro.getNombre() + " " + zorro.getDistancia() + " metros");
    }
}