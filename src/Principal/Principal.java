package minhasmusicas;

public class Principal {
    public static void main(String[] args) {
        Audio musica = new Audio();
        musica.setTitulo("Máscara");
        musica.getTotalCurtidas();
        musica.getTotalReproducoes();

        musica.exibirFichaTecnica();


    }
}
