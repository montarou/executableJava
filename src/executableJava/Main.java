package executableJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		@SuppressWarnings("unused")
		DashBoard dash = new DashBoard();
		
        // Recuperer le repertoire courant en java
		// getProperty renvoie la valeur de la 
		// « propriété d'environnement Java » spécifiée en paramètre 
		// Ici user.dir = Repertoire de Travail courant de l'user
		String pwd = System.getProperty("user.dir");
		System.out.println("le repertoire courant est : "+pwd);
		
		// On récupère le dossier contenant les fichiers temporaires
		String tempFolder = System.getProperty( "java.io.tmpdir" );
		System.out.println( "tempFolder :" + tempFolder );
		
		// On récupère toutes les propriétés d'environnement
        Properties properties = System.getProperties();
        
        // Pour chacune d'entre elle, et on affiche son nom et sa valeur 
        for( Object key : properties.keySet() ) {
            String value = System.getProperty( (String) key );
            System.out.printf( "%-30s == %s\n", key, value );
        }
		
		TextFieldTest bbb = new TextFieldTest();
		
	}
	
}
