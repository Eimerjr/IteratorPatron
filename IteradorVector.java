public class IteradorVector{
    private int[] _vector;
    private int _posicion;
 	
    public IteradorVector(Vector2 vector) {
        _vector = vector._datos;
        _posicion = 0;
    }
 	 	
    public boolean hasNext(){
        if (_posicion < _vector.length) 
		 return true;
	 else
		 return false;
    }

    public Object next(){
	 int valor = _vector[_posicion];
	 _posicion++;
	 return valor;
    }


public static void main(String argv[]) {
    Vector2 vector = new Vector2(5);
    
    //Creación del iterador
    IteradorVector iterador = vector.iterador();
    
    //Recorrido con el iterador
    while (iterador.hasNext())
        System.out.println(iterador.next());    	    	
}
}