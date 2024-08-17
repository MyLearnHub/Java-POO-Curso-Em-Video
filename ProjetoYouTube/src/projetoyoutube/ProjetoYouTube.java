package projetoyoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video videos[] = new Video[3];
        
        videos[0] = new Video("Aula 1 de POO");
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Aula 10 de HTML5");
        
        Gafanhoto gafanhotos[] = new Gafanhoto[2];
        gafanhotos[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        gafanhotos[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        System.out.println(videos[0].toString());
        System.out.println(gafanhotos[0].toString());
    }
}
