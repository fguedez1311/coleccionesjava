package coleccion2;

public class Libro {
    private String titulo;
    private String autor;
    private Integer ISBN;
    
    public Libro(String titulo, String autor, Integer ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN=ISBN;
    }
    /* public boolean equals(Object obj){
        if (obj instanceof Libro){
            Libro otro=(Libro)obj;
            if(this.ISBN==otro.ISBN){
                return true;
            }
            else{
                return false;

            }

        }
        else{
            return false;
        }
    } */
    

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (ISBN == null) {
            if (other.ISBN != null)
                return false;
        } else if (!ISBN.equals(other.ISBN))
            return false;
        return true;
    }
    
}
