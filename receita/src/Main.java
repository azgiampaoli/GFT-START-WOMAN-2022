
public class Main {
    public static void main(String[] args) {

        Receita receita = new Receita();

        Receita arroz = new Receita();
        arroz.setNomeReceita("arroz");
        arroz.setIngredientes("1 xicara de arroz cru");
        arroz.setIngredientes("1 colher de sal");
        arroz.setIngredientes("2 xicaras de agua");
        arroz.setModoPreparo("Frite o arroz adicione o sal e após a agua");
        arroz.setTempoPreparo(25);

        Receita pudim = new Receita();
        pudim.setNomeReceita("pudim");
        pudim.setIngredientes("4 ovos");
        pudim.setIngredientes("2 latas de leite condensado");
        pudim.setIngredientes("2 latas de leite");
        pudim.setModoPreparo("Misturar todos os igrendientes e cozinhar em banho-maria");
        pudim.setTempoPreparo(90);


        System.out.println(arroz.toString());
        System.out.println(pudim.toString());

        System.out.println(arroz.qualReceita("1 xicara de arroz cru"));








    }
}
