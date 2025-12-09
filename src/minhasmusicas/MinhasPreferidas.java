package minhasmusicas;

public class MinhasPreferidas {


    public void inclui(Audio audio1){
        if (audio1.getClassificacao() >= 8){
            System.out.println(audio1.getTitulo() + " é considerado sucesso absoluto"+
                    " e preferido por todos!");
        } else {
            System.out.println(audio1.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
}
