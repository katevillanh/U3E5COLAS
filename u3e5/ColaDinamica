
package u3e5;

public class ColaDinamica {
 
    public Nodo raiz,cima;
    //int tamaño;
    ColaDinamica(){
        raiz=null;
        cima=null;
    }
    
    public boolean Contiene(){
        if (raiz==null){
            return true;
        }else{
            return false;
        }
    }

    public void Empujar(String dato){
        Nodo nuevo;
        nuevo=new Nodo ();
        nuevo.dato=dato;
        nuevo.siguiente=null;
        if (Contiene()) {
            raiz=nuevo;
            cima=nuevo;
        }else{
            cima.siguiente = nuevo;
            cima=nuevo;
        }
    }

    public String Sacar(){
        if (raiz==null){
            System.out.println("No hay datos");
        }
        if (!Contiene()){
            String elementos=raiz.dato;
            if (raiz==cima){
                raiz=null;
                cima=null;
            }else{
                raiz=raiz.siguiente;
            }
            return elementos;
        } 
        return null;
    }

    public void Mostrar(){
        if (raiz==null){
            System.out.println("No hay datos");
        }else{
        Nodo recorre=raiz;
        while (recorre!=null) {
            System.out.println(recorre.dato);
            recorre=recorre.siguiente;
        }
      }
    }
}
