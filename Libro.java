
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, int numeroDeVecesPrestado, boolean texto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = numeroDeVecesPrestado;
        esLibroDeTexto = texto;
    }
    
    public String getAutor (){
        return autor;
    }
    
    public String getTitulo (){
        return titulo;
    }
    
    public int getNumeroPaginas (){
        return numeroPaginas;
    }
    
    public String getnumeroReferencia (){
        return numeroReferencia;
    }
    
    public int getvecesPrestado (){
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto (){
        return esLibroDeTexto;
    }
    
    public void prestar (){
        vecesPrestado = vecesPrestado + 1;
    }
    
    public void setnumeroReferencia (String numeroDeReferencia){
        if (numeroDeReferencia.length()>=3){
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println("Error el numero de referencia debe tener al menos 3 caracteres");
        }
    }
    
    public void imprimeAutor () {
        System.out.println ("El autor se llama " + autor);
    }
    
    public void imprimeTitulo () {
        System.out.println ("El titulo del libro es " + titulo);
    }
    
    public void imprimirDetalles () {
        String numeroReferenciaAMostrar = "zzz";
        if (numeroReferencia == ""){
            numeroReferencia = numeroReferenciaAMostrar;
        }
        else {
            numeroReferenciaAMostrar = numeroReferencia;
        }
        
        String libroDeTexto;
        if (esLibroDeTexto){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }
        
        System.out.println ("Título: "+titulo+", Autor: "+autor+", Páginas: " +numeroPaginas+", Numero de referencia: " +numeroReferencia+", numero de veces que se a prestado: "+ vecesPrestado+", ¿Es un libro de texto? " +libroDeTexto);
    }
    
    public String getDetalles (){
        String devolver = "";
        
        String numeroReferenciaAMostrar = "zzz";
        if (numeroReferencia == ""){
            numeroReferencia = numeroReferenciaAMostrar;
        }
        else {
            numeroReferenciaAMostrar = numeroReferencia;
        }
        
        String libroDeTexto;
        if (esLibroDeTexto == true){
            libroDeTexto = "correcto";
        }
        else {
            libroDeTexto = "falso";
        }
        
        devolver = "Título: "+titulo+", Autor: "+autor+", Páginas: " +numeroPaginas+", Numero de referencia: " +numeroReferenciaAMostrar+", numero de veces que se a prestado: "+ vecesPrestado+", ¿Es un libro de texto? " +libroDeTexto;
        return devolver;
    }
}