package africa.atps.DailyRapport.constants;

public class Constants {
    private static final String[] ENTETE = {"cmpg_id", "cmpg_nom", "cmpg_status", "cmpg_date", "cmpg_fichier", "cmpg_fichier_original",
        "cmpg_txtsms", "cmpg_esp", "cmpg_partner", "cmpg_mois", "cmpg_type", "frais_id", "cmpg_user",
        "cmpg_type_canal", "cmpg_canal", "cmpg_created", "filiale", "entite", "montant_total", "frais_total",
        "cmpg_nbclients", "canal_id"};

    private static final String[] testEntete = {"1","2","3","4"};

    public static String[] getEntete() {
        return testEntete;
    }

}
