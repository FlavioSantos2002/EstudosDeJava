package instrumentos;

import model.Instrumento;

public final class Piano implements Instrumento {


    public Piano() {

    }

    @Override
    public void tocar() {
        System.out.println("estou tocando o piano");
    }

}
