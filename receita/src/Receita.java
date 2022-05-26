import java.util.ArrayList;

public class Receita {

    private String nomeReceita;
    private ArrayList<String> ingredientes = new ArrayList<>();
    private int tempoPreparo;
    private String modoPreparo;


    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingrediente) {
        this.ingredientes.add(String.valueOf(ingrediente));
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    @Override
    public String toString() {
        return "Receita{" +
                "nomeReceita='" + nomeReceita + '\'' +
                ", ingredientes=" + ingredientes +
                ", tempoPreparo=" + tempoPreparo + "minutos" +
                ", modoPreparo='" + modoPreparo + '\'' +
                '}';
    }

    public void receita(Receita a){
        a.toString();

    }

    public String qualReceita(String ingred){
        for(String ingr: getIngredientes()){
            if(getIngredientes().contains(ingr)){
            }
        }
        return getIngredientes().toString();
    }



}




