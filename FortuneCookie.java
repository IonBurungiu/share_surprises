package P2;

import java.util.ArrayList;
import java.util.Random;

public class FortuneCookie implements ISurprise {
   private ArrayList<String> postcards = new ArrayList<>();
   private String postcard;

    public FortuneCookie() {

        System.out.println("S-a creat FortuneCookie");
        generate();
    }

    @Override

    public void enjoy() {
        System.out.println("Surpriza este FortuneCookie si are urmator mesajul :\n"+this.postcard);
    }

    public void generate(){

        postcards.add("01. Fuge pe deal ca pe vale." );
        postcards.add("02. Furnică cu furnică, fie cât de mică, face mare mușuroi.");
        postcards.add("03. Când surpriza e regulă, regula devine surpriză." );
        postcards.add("04. Surpriza este locul prin care intră creativitatea." );
        postcards.add("05. Secretul umorului este surpriza." );
        postcards.add("06. Omul este trecător şi trupul său în pulbere se schimbă, dar cartea lui îl face nemuritor." );
        postcards.add("07. Nimic nu e sigur, inclusiv faptul că nimic nu e sigur." );
        postcards.add("08. Nu ştiam nimic şi am persistat în credinţa că timpul miracolelor crude nu a trecut." );
        postcards.add("09. Atâta timp cât sunt în viaţă, prefer să filozofez pe tema vieţii. Pe tema morţii voi filozofa după ce voi fi murit." );
        postcards.add("10. Distruge-ți inamicii transformându-i in prieteni." );
        postcards.add("11. Prietenia înseamnă a fi frate și soră, două suflete ce se ating fără să se confunde, două degete ale aceleiași mâini. \n" );
        postcards.add("12. Un prieten este cineva care are aceiași dușmani ca și tine." );
        postcards.add("13. Femeia e ca luna: azi luminoasă, mâine întunecată." );
        postcards.add("14. A avea doi ochi înseamnă o mândrie; unul singur înseamnă a avea totuşi ceva." );
        postcards.add("15. Iubirea e ca ploaia uşoară ce cade neauzit, dar naşte torente." );
        postcards.add("16. E mai bine să trezeşti pe cine doarme decât să trezeşti pe cine se preface că doarme." );
        postcards.add("17. Unul care-ţi mulţumeşte des pentru un fleac, te lasă sarac." );
        postcards.add("18. Cine nu călătoreşte nu cunoaşte valoarea oamenilor." );
        postcards.add("19. Orb e cel ce n-a citit în viaţa lui o carte." );
        postcards.add("20. Vorbă multă, ochiul vânăt." );

        Random random = new Random();
        int numberR = random.nextInt(20) % 20;
        this.postcard=postcards.get(numberR);
    }
}
