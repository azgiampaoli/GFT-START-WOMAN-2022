/*
Castanho + Castanho 75% castanho/19% verdes/6% azuis
Verde + Castanho 50% castanho/37% verdes/12% azuis
Azul + Castanho 50% castanho/0% verdes/50% azuis
Verde + Verde -1% castanho/75% verdes/25% azuis
Verde + Azul 0% castanho/50% verdes/50% azuis*/

public class Main {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa("joao", "masculino", "castanho", "loiro", "12/10/1996", "O", "+");
        Pessoa julia = new Pessoa("julia", "feminino", "azul", "ruivo", "12/02/1995", "A", "+");
        Pessoa pedro = new Pessoa("pedro", "masculino", "verde", "castanho", "13/07/2004", "A", "-");
        Pessoa joana = new Pessoa("joana", "feminino", "castanho", "loiro", "28/01/2006","AB","+");
        Pessoa raquel = new Pessoa("raquel", "feminino", "verde", "castanho", "30/03/2009", "B", "+");
        Pessoa manuel = new Pessoa("manuel", "masculino", "azul", "ruivo", "15/12/2015", "B", "+");

        joao.qualIdade();
        joao.olhoBebe(joao,julia);
        joao.olhoBebe(joao,joana);
        joao.olhoBebe(joao,raquel);
        pedro.olhoBebe(pedro,raquel);
        pedro.olhoBebe(pedro,julia);




    }
}
