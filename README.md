# dessinVectorielA3-YM-MA-AdV
Yoann  Moguer, Augustin de Vita, Matthieu Lemonnier

Pour l'instant l'application permet la génération de fichiers svg contenant des formes simples: Cercle, Ellipse, Ligne, Rectange. D'autres formes pourraient être ajoutées au cours du développement si cela est souhaité.

Le package geometry contient les informations purement géomètriques, donc indépendantes de ce que l'utilisateur souhaite faire ensuite (générer un fichier svg, créer un nouveau module graphique,...)


_________________________________________
### Utilisation du programme ###
_________________________________________

La classe main.Main permet de lancer l'éxecution du programme.

Une fenêtre s'ouvre alors où l'utilisateur peut rentrer des instructions pour dessiner.

Les instructions doivent être précédées de **Canvas(w,h)** où w est la largeur de la feuille de travail et h la hauteur.

Les différentes formes possibles doivent être écrites sous la forme suivante :

- **CERCLE(x,y,r,color)** où le couple (x,y) est les coordonnées du centre du cercle, r le rayon du cercle et color le nom d'une couleur en anglais. (Exemple : CERCLE(120,120,50,blue))
- **ELLIPSE(x,y,r1,r2,color)** où le couple (x,y) est les coordonnées du centre de l'ellipse, r1 et r2 les rayons de l'ellipse et color le nom d'une couleur en anglais. (Exemple : ELLIPSE(120,120,20,30,black))
- **LINE(x1,y1,x2,y2,w,color)** où le couple (x1,y1) est les coordonnées du point de départ de la ligne, le couple (x2,y2) est les coordonnées du point d'arrivée de la ligne, w est la largeur du trait et color le nom d'une couleur en anglais. (Exemple : LINE(50,50,150,150,2,red))
- **RECT(x,y,w,h,color)** où le couple (x,y) est les coordonnées du point de départ du rectangle, w est la largeur du rectangle, h est la hauteur du rectangle et color le nom d'une couleur en anglais. (Exemple : RECT(150,150,20,50,green))

L'utilisateur choisi ensuite quel module utilisé (SVG ou descriptif pour l'instant), clique sur "valider" et enfin choisi où il veut suavegarder son fichier.

_________________________________________
### Langages spécifiques ###
_________________________________________

2 langages (ou modules) sont proposés dans cette implémentation :

- Le langage **SVG** : le programme créera alors un fichier .svg en utilisant les instructions écrites par l'utilisateur.
- Un langage **Descriptif** : ce langage décrit les entrées de l'utilisateur. Le programme créera un fichier .txt contenant la transcription des entrées en langage descriptif.

La modularité du programme permet d'ajouter quelconque modul/langage dans le package visitors.implementations en implémentant simplement l'interface Visitor.
