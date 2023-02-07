import java.lang.reflect.Constructor;

/**Clase para manejar las entradas de un blog.
 * La clase se modificó el 07/02/2023 por Albert Pérez Baleyto.
 * Esta es la versión 3.0
 */
public class EntradaBlogAPB {

/** Separador es el carácter que separa ENTRADA DE del nombre del autor*/

        public static char separador=':';
        private int id;
        private String texto;
        private String autor;

        /***/
    /**
     * Constructor de la clase. Recibe el número de entrada, el nombre del autor de la entrada y
     * el texto que contiene la entrada. Si el número de entrada es negativo, lanza una excepción.
     * @param id
     * @param autor
     * @param texto
     * @throws IllegalArgumentException
     */
	public EntradaBlogAPB(int id,String autor,String texto)throws IllegalArgumentException{
            if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
            this.id=id;
            this.autor=autor;
            this.texto=texto;
        }

        /** */
    /**
     * Sobreimpresión del metodo toString que devuelve String combinado del autor + texto.
     * @return cad
     */
    @Override
        public String toString(){
            String cad="";
            cad+="\nENTRADA DE"+separador+autor;
            cad+="\n "+texto;
            return cad;
        }


    /**
     * Devuelve el número de la entrada
     * @return id
     */
    public int getId(){
            return this.id;
        }


    /**
     * Devuelve el texto completo de la entrada
     * @return texto
     */
    public String getTexto(){
            return this.texto;
        }

    /**
     * Devuelve el nombre del autor de la entrada en mayúsculas
     * @return autor.toUpperCase
     */
    public String getAutor(){
            return this.autor.toUpperCase();
        }

    /**
     * Devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
     * @return autor
     */
    public String devuelveAutor(){
            return this.autor;
        }

    /**
     * Main donde creamos una entrada de blog con valor negativo para ver si funciona bien la captura de error.
     * @param args
     */
    public static void main(String[] args) {
            //Modificar.
            EntradaBlogAPB e1=new EntradaBlogAPB (-3,"ana","Últimas noticias, está disponible BixBy 2.0");
            System.out.println(e1);
        }
        //class
    }


