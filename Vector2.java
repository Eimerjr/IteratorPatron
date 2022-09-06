public class Vector2 {
    public int[] _datos;

    public Vector2(int valores){ 
        _datos = new int[valores];
        for (int i = 0; i < _datos.length; i++){
            _datos[i] = i; 
        }
    }    
    
    public int getValor(int pos){ 
        return _datos[pos]; 
    }

    public void setValor(int pos, int valor){ 
        _datos[pos] = valor; 
    }

    public int dimension(){ 
        return _datos.length; 
    }
    
    public IteradorVector iterador(){
        return new IteradorVector(this); 
    }
}