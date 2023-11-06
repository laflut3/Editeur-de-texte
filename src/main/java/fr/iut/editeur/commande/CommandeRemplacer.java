package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {
    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String chaine;
        try {
            chaine = parameters[3];
            this.document.remplacer(start, end, chaine);
        }catch (ArrayIndexOutOfBoundsException e){
            chaine = "";
            this.document.remplacer(start, end, chaine);
        }
        super.executer();
    }

}