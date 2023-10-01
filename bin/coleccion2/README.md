# IMPLEMENTACIÓN DE LOS MÉTODOS equals() y hashCode()
## SOBRESCRITURA DE EQUALS()
- Si no se sobreescribe este método, se heredará la versión definitiva en la clase Object, la comparación de dos referencias devolverá true si  ambas apunta al mismo objeto
- Dado que un mapa (Map) se basa la utilización de claves únicas, los objetos de clase que no soobreescribe el método equals no podran ser utilizado como claves
- A la hora de sobreescribir equals() el programador decide que se entiende por igual, es conveniente que se compruebe  primero que el objeto pasado como parámetro es una instancia de la clase a la que pertenece el objeto con el se compara:
  ```
    public boolean equals(Object obj){
        if((obj instanceof Clase) && ...)
    }
  ```

## SOBREESCRITURA DEL MÉTODO HASHCODE()
El método hashCode() devuelve el valor numérico asociado al objeto. Si se sobreescribe equals() tambien se debe sobreescribir hashCode() teniendo en cuenta que: **dos objetos  considerados iguales utilizando el método equals(), debe tener identicos valores de hascode. Lo contrario no tiene que ser cierto**
El valor hashcode de un onjeto es utilizado por algunas colecciones para saber en que lugar interno debe colocar el objeto, concretamente por las colecciones Hastable,HashMap,HashSet,LikedHashSet y LinkedHashMap.

Cuando se sobreescribe el método hashCode() en una clase hay tener en cuenta que éste deberá cumplir las siguientes pripiedades:
- El valor devuelto por hashCode() no tiene que ser el mismo de una ejecución a otra de la misma aplicación
- Si dos objetos son iguales de acuerdo a equals(), la llamada a sus métodos hasCode() debe dar el mismo resultado 