import java.util.HashMap;
import java.util.Map;

public class MovieData {

    public static Map<String, Movie> DATABASE = new HashMap<>();
    static {
        DATABASE.put("Deadpool", new Movie("Deadpool", "", "Action/Comedy",
                "Tim Miller", "Rhett Reese & Paul Wernick", 2016,
                "Ein früherer Special-Forces-Soldat, der zu einem Söldner geworden ist," +
                        " wird einem verbotenen Experiment unterworfen, nach dem er die Kraft der " +
                        "beschleunigten Heilung erhält und fortan als Deadpool auftritt."));
        DATABASE.put("Deadpool 2", new Movie("Deadpool 2","","Action/Comedy",
                "David Leitch","Rhett Reese & Paul Wernick & Ryan Reynolds", 2018,
                "Deadpool stellt ein neues Team zusammen, die \"X-Force\"," +
                        " um ein Kind vor Cable zu retten, der von einer möglichen Zeitlinie " +
                        "in der Zukunft gekommen ist, um den Jungen zu töten."));
        DATABASE.put("Deadpool & Wolverine", new Movie("Deadpool & Wolverine", "", "Action/Comedy",
                "Shawn Levy","Rhett Reese & Paul Wernick & Ryan Reynolds", 2024,
                "Wolverine schließt sich dem \"Söldner mit der großen Klappe\" im dritten Teil der Deadpool-Filmreihe an."));
        DATABASE.put("Avengers", new Movie("Avengers", "", "Action/Science-Fiction",
                "Joss Whedon", "Joss Whedon & Zak Penn", 2012,
                "Die mächtigsten Helden der Erde müssen zusammenkommen und lernen," +
                        " gemeinsam als Team zu kämpfen, wenn sie den bösen Loki und seine Alien-Armee" +
                        " darin hindern wollen, die Menschheit zu versklaven."));
        DATABASE.put("Avengers: Age of Ultron", new Movie("Avengers: Age of Ultron", "", "Action/Science-Fiction",
                "Joss Whedon", "Joss Whedon & Stan Lee & Jack Kirby", 2015,
                "Tony Stark und Bruce Banner wollen ein Friedensprogramm namens Ultron in Gang bringen, " +
                        "doch dabei geht einiges schief. Das Ergebnis ist die bösartige künstliche Intelligenz Ultron, " +
                        "die die Menschheit ausrotten will."));
        DATABASE.put("Avengers: Infinity War", new Movie("Avengers: Infinity War", "", "Action/Science-Fiction",
                "Anthony Russo & Joe Russo", "Christopher Markus & Stephen McFeely & Stan Lee", 2018,
                "Die Avengers und ihre Verbündeten müssen bereit sein, alles zu opfern, um den mächtigen Thanos zu besiegen, " +
                        "bevor sein galaktischer Zerstörungsplan dem Universum ein Ende bereitet."));
        DATABASE.put("Avengers: Endgame", new Movie("Avengers: Endgame", "", "Action/Science-Fiction",
                "Anthony Russo & Joe Russo","Christopher Markus & Stephen McFeely & Stan Lee", 2019,
                "Nach der Katastrophe von \"Avengers: Infinity War\" liegt das Universum in Trümmern. " +
                        "Mit Hilfe der restlichen Verbündeten sammeln die Avengers ihre Kräfte, um den Irrsinn Thanos' rückgängig zu machen " +
                        "und das Gleichgewicht wiederherzustellen."));
        DATABASE.put("Barbie", new Movie("Barbie", "", "Abenteuer/Comedy/Fantasy",
                "Greta Gerwig", "Greta Gerwig & Noah Baumbach", 2023,
                "Barbie und Ken haben die Zeit ihres Lebens in der farbenfrohen und scheinbar perfekten Welt von Barbie-Land. " +
                        "Als sie jedoch die Chance bekommen, in die reale Welt einzutauchen, machen sie dort Erfahrungen, die ihr Leben verändern."));
        DATABASE.put("Maze Runner", new Movie("Maze Runner", "", "Action/Mystery/Science-Fiction/Thriller",
                "Wes Ball", "Noah Oppenheim & Grant Pierce Myers & T.S. Nowlin", 2014,
                "Thomas landet, nachdem sein Gedächtnis gelöscht wurde, in einer Gruppe männlicher Jugendlicher. Kurz darauf erfährt er, " +
                        "dass sie alle in einem Labyrinth gefangen sind, in dem er sich mit anderen \"Läufern\" zusammentun muss, wenn sie auch nur die " +
                        "geringste Aussicht darauf haben wollen, zu entkommen."));
        DATABASE.put("Maze Runner 2", new Movie("Maze Runner 2","", "Action/Mystery/Science-Fiction/Thriller",
                "Wes Ball", "T.S. Nowlin & James Dashner", 2015,
                "Nachdem sie dem Labyrinth entkommen konnten, sehen sich die Gladers mit einer ganzen Reihe neuer Herausforderungen konfrontiert. " +
                        "Auf offener Strecke, inmitten einer verwüsteten Landschaft, folgt ein unvorstellbares Hindernis auf das nächste."));
        DATABASE.put("Maze Runner 3", new Movie("Maze Runner 3", "", "Action/Mystery/Science-Fiction/Thriller",
                "Wes Ball", "T.S. Nowlin & James Dashner", 2018,
                "Der junge Held Thomas macht sich auf eine Mission auf, ein Gegenmittel für eine tödliche Krankheit namens \"Flare\" zu finden."));
        DATABASE.put("Divergent", new Movie("Divergent", "", "Action/Abenteuer/Science-Fiction/Mystery/Drama",
                "Neil Burger", "Evan Daugherty & Vanessa Taylor & Veronica Roth", 2014,
                "In einer nach Tugenden aufgeteilten Welt, erfährt Tris, dass sie eine \"Unbestimmte\" ist und nicht eine bestimmte Gruppe hineinpasst. " +
                        "Diese werden als Gefahr für den gesellschaftlichen Frieden angesehen und deshalb gejagt. So müssen Tris und die mysteriösen Vier herausfinden, " +
                        "was \"Unbestimmte\" gefährlich macht, bevor es für sie zu spät ist."));
        DATABASE.put("Insurgent", new Movie("Insurgent", "", "Action/Abenteuer/Science-Fiction/Mystery/Drama",
                "Robert Schwentke", "Brian Duffield & Akiva Goldsman & Mark Bomback", 2015,
                "Beatrice Prior muss sich ihren inneren Dämonen stellen und ihren Kampf gegen ein mächtiges Bündnis fortsetzen, " +
                        "das ihre Gesellschaft mit Hilfe anderer auf ihrer Seite auseinander zu reißen droht."));
        DATABASE.put("Allegiant", new Movie("Allegiant","", "Action/Abenteuer/Science-Fiction/Mystery/Drama",
                "Robert Schwentke", "Noah Oppenheim & Adam Cooper & Bill Collage", 2016,
                "Nach den erschütternden Ereignissen von Insurgent - Die Bestimmung Teil sind Tris und Four " +
                        "gezwungen zu fliehen und die gänzlich unbekannte Welt außerhalb der Mauern Chicagos zu entdecken."));
        DATABASE.put("The Hunger Games", new Movie("The Hunger Games", "", "Action/Abenteuer/Science-Fiction/Thriller",
                "Gary Ross", "Gary Ross & Suzanne Collins & Billy Ray", 2012,
                "Katniss Everdeen nimmt den Platz ihrer jüngeren Schwester bei den Hungerspielen ein: ein im Fernsehen übertragener Wettkampf, " +
                        "bei dem zwei Jugendliche aus jedem der zwölf Distrikte von Panem nach dem Zufallsprinzip ausgewählt werden, um bis zum Tod zu kämpfen."));
        DATABASE.put("The Hunger Games: Catching Fire", new Movie("The Hunger Games: Catching Fire", "","Action/Abenteuer/Science-Fiction/Thriller",
                "Francis Lawrence", "Simon Beaufoy & Michael Arndt & Suzanne Collins", 2013,
                "Katniss Everdeen und Peeta Mellark werden zur Zielscheibe des Kapitols, nachdem ihr Sieg bei den 74. " +
                        "Hungerspielen eine Rebellion in den Distrikten von Panem entfacht hat."));
        DATABASE.put("The Hunger Games: Mockingjay 1", new Movie("The Hunger Games: Mockingjay 1", "", "Action/Abenteuer/Science-Fiction/Thriller",
                "Francis Lawrence", "Peter Craig & Danny Strong & Suzanne Collins", 2014,
                "Katniss Everdeen ist in Distrikt 13, nachdem sie die Spiele für immer zerstört hat. Unter der Führung von Präsident Coin und dem Rat ihrer " +
                        "vertrauten Freunde breitet Katniss ihre Flügel aus, während sie darum kämpft, Peeta und eine Nation, die von ihrem Mut bewegt wird, zu retten."));
        DATABASE.put("The Hunger Games: Mockingjay 2", new Movie("The Hunger Games: Mockingjay 2", "", "Action/Abenteuer/Science-Fiction/Thriller",
                "Francis Lawrence", "Peter Craig & Danny Strong & Suzanne Collins", 2015,
                "Als der Krieg von Panem eskaliert und in der Zerstörung anderer Distrikte endet, muss Katniss Everdeen, die widerwillige Anführerin der Rebellion, " +
                        "eine Armee gegen President Snow aufstellen, während alles, was ihr lieb ist, in Gefahr ist."));
        DATABASE.put("The Hunger Games: The Ballad of Songbirds and Snakes", new Movie("The Hunger Games: The Ballad of Songbirds and Snakes", "", "Action/Abenteuer/Science-Fiction/Thriller",
                "Francis Lawrence", "Michael Lesslie & Michael Arndt & Suzanne Collins", 2023,
                "Vorgeschichte um den jungen Coriolanus Snow, der als Mentor bei den 10. Hungerspielen zwischen dem weiblichen Tribut aus Bezirk 12 und " +
                        "seiner Stellung in der Gesellschaft hin- und hergerissen ist und im Zuge dessen die Spiele neu gestaltet"));
        DATABASE.put("The Hunger Games: Sunrise on the Reaping", new Movie("The Hunger Games: Sunrise on the Reaping", "", "Action/Abenteuer/Science-Fiction/Thriller",
                "Francis Lawrence", "Billy Ray & Suzanne Collins & Michael Lesslie", 2026,
                "Erkundet Panem 24 Jahre vor Katniss' Saga, beginnend am Morgen der Ernte der 50. Hungerspiele, " +
                        "an denen ein junger Haymitch Abernathy teilnimmt."));
    }

}
