package Test;

import code.Entretien;
import code.Modele;
import code.Voiture;
import code.VoitureFactory;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;


public class VoitureTest {
    @Test
    public void test_get_marque() throws Exception {
        Voiture test =  VoitureFactory.newVoiture(Modele.MODEL_S) ;
        Assertions.assertEquals(code.Marque.TESLA , test.getMarque());
    }

    @Test
    public void test_get_prix() throws Exception {
        Voiture test =  VoitureFactory.newVoiture(Modele.MODEL_S) ;
        Assertions.assertEquals(138990 , test.getPrix());
    }

    @Test
    public void test_get_note() throws Exception {
        Voiture test =  VoitureFactory.newVoiture(Modele.MODEL_S) ;
        Assertions.assertEquals(5 , test.getNote());
    }

    @Test
    public void test_get_NbMain() throws Exception {
        Voiture test =  VoitureFactory.newVoiture(Modele.MODEL_S) ;
        Assertions.assertEquals(0 , test.getNbMains());
    }

    @Test
    public void test_notation() throws Exception {
        Voiture test = VoitureFactory.newVoiture(Modele.MODEL_S) ;
        Voiture test2 = VoitureFactory.newVoitureOccasion(Modele.MODEL_S , 2022 , 42000 , "11AAA11" , Entretien.PASENTRETENUE , 138990 , 0) ;
        Assertions.assertEquals(5 , test.getNote());
        Assertions.assertEquals(4 , test2.getNote());
    }

    @Test
    public void test_estimation() throws Exception {
        Voiture test2 = VoitureFactory.newVoitureOccasion(Modele.MODEL_S , 2022 , 82000 , "11AAA11" , Entretien.PASENTRETENUE , 138990 , 4) ;
        Assertions.assertEquals(115825, test2.getPrix());
    }


}
