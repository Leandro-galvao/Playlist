import java.util.ArrayList;
public class Playlist{
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Wake up in the sky");
        listaParaIlhaDeserta.add("Dancin");
        listaParaIlhaDeserta.add("No guidance");
        listaParaIlhaDeserta.add("Ms. Jackson");
        listaParaIlhaDeserta.add("Losing my religion");
        listaParaIlhaDeserta.add("Young, wild and free");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        
        listaParaIlhaDeserta.remove(1);
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());

        int indexA = 2;
        int indexB = 4;
        String temp = listaParaIlhaDeserta.get(indexA);
        listaParaIlhaDeserta.set(2, listaParaIlhaDeserta.get(indexB));
        listaParaIlhaDeserta.set(indexB, temp);
        System.out.println(listaParaIlhaDeserta);
    }
}
