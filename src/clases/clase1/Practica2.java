package clases.clase1;

public class Practica2 {
    public static void main(String[] args) {
        //Ejercicio #2: Portugal ha ganado N partidos. Si han ganado mas de 2 partidos imprimir "ganadores",
        //              si ademas de ganar por 2 tambien gano por mas de 10 imprimir "son muy cracks"
        //              Sino han ganado mas de 2 partidos imprimir "perdedores"
        //              Si ademas de no ganar mas de 2 partidos no han ganado ninguno (o sea 0) imprimir "malos"

        int portugalPartidos = 0;

        if (portugalPartidos >= 2){
            System.out.println("ganadores");
            if (portugalPartidos >= 10){
                System.out.println("son muy cracks");
            }
        }else{
            System.out.println("perdedores");
            if (portugalPartidos == 0){
                System.out.println("malos");
            }
        }
    }
}
