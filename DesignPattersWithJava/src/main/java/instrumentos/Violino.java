package instrumentos;

import model.Instrumento;

public final class Violino implements Instrumento {


    public Violino() {
    }



    @Override
    public void tocar() {
    System.out.println("estou tocando o violino");
    }

}
