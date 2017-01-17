-----------------
--- EXECUTABLES
-----------------

Le dossier "Executables" contient le fichier .jar du projet. Pour le lancer,
il suffit de cliquer sur : 
- "lancez-moi-windows.bat", si vous etes sous Windows.
- "lancez-moi-linux.sh", si vous etes sous Linux.
- Directement sur le fichier "IHMMastermind.jar", si vous etes sous Mac.

Remarque : La machine virtuelle JAVA (JVM) doit �tre install� sur votre machine, et le chemin vers
l'executable java, doit faire partie de vos variables d'environnement.

---------------
--- SOURCES
---------------

Le dossier contient les classes java du projet. 
Le sous dossier "Projet Netbeans" est le projet r�aliser sous netbeans.


Les 3 strat�gies sont impl�ment�es dans le fichier ThreadStrategie,
par les m�thodes : 
strategie1(...) 
strategie2(...) 
strategie3(...) 

Nous avons impl�menter ces m�thodes de la mani�re la plus statique possible, afin de facilit�
leur portage vers d'autre langage non orient� objet ainsi que leur parall�lisation.

Ses m�thodes sont donc compl�tement ind�pendante de toute variable de classe, cependant pour 
pouvoir les lancer en parall�les nous avons d� les encapsuler dans un Thread et enlever 
leur mot cl� "static".

-------------
--- RAPPORT
-------------

Le dossier "Rapport" contient les fichiers PDF constituant le rapport et les annexes.
Le sous-dossier "Sources LateX" contient les fichiers .tex n�cessaire � la compilation en pdf.