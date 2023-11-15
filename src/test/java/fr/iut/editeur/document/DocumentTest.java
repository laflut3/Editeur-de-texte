package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DocumentTest extends TestCase {

    private Document doc;

    @BeforeEach
    public void init(){
        doc = new Document();
    }

    @Test
    public void Test_Doc_ajouter(){
        doc.ajouter("hello");
        assertEquals(doc.getTexte(), "hello");
    }

    @Test
    public void Test_Doc_remplacer_mot_meme_longuer(){
        doc.ajouter("hello");
        doc.remplacer(0,5,"bingo");
        assertEquals(doc.getTexte(), "bingo");
    }

    @Test
    public void Test_Doc_remplacer_mot_pas__meme_longuer(){
        doc.ajouter("hello");
        doc.remplacer(0,5,"leo");
        assertEquals(doc.getTexte(), "leo");
    }

    @Test
    public void Test_Doc_remplacer_rien(){
        doc.ajouter("hello");
        doc.remplacer(0,5,"");
        assertEquals(doc.getTexte(), "");
    }

    @Test
    public void Test_Doc_majuscule(){
        doc.ajouter("hello");
        doc.majuscules(0,5);
        assertEquals(doc.getTexte(), "HELLO");
    }

    @Test
    public void Test_Doc_effacer(){
        doc.ajouter("hello");
        doc.effacer(0,5);
        assertEquals(doc.getTexte(), "");
    }

    @Test
    public void Test_Doc_effacer_une_partie(){
        doc.ajouter("hello");
        doc.effacer(0,3);
        assertEquals(doc.getTexte(), "l");
    }

    @Test
    public void Test_Doc_clear(){
        doc.ajouter("hello");
        doc.clear();
        assertEquals(doc.getTexte(), "l");
    }
}
