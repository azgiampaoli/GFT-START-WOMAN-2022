

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String genero;
    private String corOlhos;
    private String corCabelo;
    private String nascimento;
    private String tipoSanguineo;
    private String fatorRH;

    public Pessoa(String nome, String genero, String corOlhos, String corCabelo, String nascimento, String tipoSanguineo, String fatorRH) {
        this.nome = nome;
        this.genero = genero;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.nascimento = nascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.fatorRH = fatorRH;
    }

    public void olhoBebe(Pessoa a, Pessoa b) {



        if (a.getCorOlhos().equals("castanho")&&b.getCorOlhos().equals("castanho")) {
            System.out.println("75% castanho");
            System.out.println("19%verde");
            System.out.println("6% azuis");
        } else if (a.getCorOlhos().equals("verde") && (b.getCorOlhos().equals("castanho")) || (a.getCorOlhos().equals("castanho") && (b.getCorOlhos().equals("verde")))) {
            System.out.println("50% castanho");
            System.out.println("37%verde");
            System.out.println("12% azuis");
        } else if (a.getCorOlhos().equals("azul") && (b.getCorOlhos().equals("castanho")) || (a.getCorOlhos().equals("castanho") && (b.getCorOlhos().equals("azul")))) {
            System.out.println("50% castanho");
            System.out.println("0%verde");
            System.out.println("50% azuis");
        }else if(a.getCorOlhos().equals("verde")&&(b.getCorOlhos().equals("verde"))){
            System.out.println("-1% castanho");
            System.out.println("75%verde");
            System.out.println("25% azuis");
        }else{
            System.out.println("0% castanho");
            System.out.println("50%verde");
            System.out.println("50% azuis");
        }
    }


    public void qualIdade(){
        Calendar cal = GregorianCalendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);
        String[] ano = getNascimento().split("/");
        int anoNasc = Integer.parseInt(ano[2]);
        System.out.println("Você tem: " + (anoAtual - anoNasc) + " anos.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getFatorRH() {
        return fatorRH;
    }

    public void setFatorRH(String fatorRH) {
        this.fatorRH = fatorRH;
    }
}
