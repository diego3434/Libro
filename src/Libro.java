public class Libro {
   String  titulo;
   String autor;
   String anioPublicacion;

   public Libro( String titulo, String autor, String anioPublicacion){
      this.titulo =titulo;
      this.autor =autor;
      this.anioPublicacion =anioPublicacion;
       
   }

   public void  imprimir(){
      System.out.println("El titulo del libro es; "+titulo);
      System.out.println("El autor del libro es; "+autor);
      System.out.println("El año de publicacion del libro es; "+anioPublicacion);
      System.out.println("\n");
   }

}
