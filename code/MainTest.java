package code ;

public class MainTest {
    public static void main(String[] argvs){
        VoitureFactory voiture = new VoitureFactory();
        Voiture centSix = VoitureFactory.newVoiture(Modele.CENT_SIX);
        System.out.println(centSix);
    }
}
