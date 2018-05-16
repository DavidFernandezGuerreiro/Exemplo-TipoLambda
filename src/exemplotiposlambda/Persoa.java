
package exemplotiposlambda;

import java.util.function.Supplier;

/**
 *
 * @author dfernandezguerreiro
 */
public class Persoa {
    
    private String nome;
    private String apelido;
    private String direccion;

    public Persoa() {
    }

    public Persoa(String nome, String apelido, String direccion) {
        this.nome=nome;
        this.apelido=apelido;
        this.direccion=direccion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido=apelido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+", apelido: "+apelido+", direccion: "+direccion;
    }
    
    Supplier<Persoa>per; //lo creamos fuera del metodo crear(), para poder llamarlo desde el metodo ver().
    public void crear(){ //vamos a crear una persona y la vamos a retornar.->Proveedores: no recibo pero si devuelvo. //pepita,perez,urzaiz
        per=()->{return(new Persoa("Pepita","Pérez","Urzaiz"));
        };
//        System.out.println(per.get());
    }
    
    public void ver(){
        System.out.println(per.get());
    }
    
}
