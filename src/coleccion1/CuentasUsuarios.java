package coleccion1;

import java.util.HashSet;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 =new Cliente("Antonio Banderas", "0001", 20000);
        Cliente cl2 =new Cliente("Rafael Nadal", "0002", 25000);
        Cliente cl3 =new Cliente("Penelope Cruz", "0003", 300000);
        Cliente cl4 =new Cliente("Julio Iglesia", "0004", 500000);
        Cliente cl5 =new Cliente("Julio Iglesia", "0007", 500000);

        Set<Cliente> clientesBanco=new HashSet<>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for(Cliente cliente:clientesBanco){
            System.out.println(cliente);
        }


    }
}
