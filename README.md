# dessinVectorielA3-YM-MA-AdV
Yoann  Moguer, Augustin de Vita, Matthieu Lemonnier

Pour l'instant  l'application permet la génération de fichiers svg contenant des formes simples: Cercle, Ellipse, Ligne, rectange.

Le package geometry contient les informations purement géomètriques, donc indépendantes de ce que l'utilisateur souhaite faire
ensuite (générer un fichier svg, travailler avec la librairie java.Graphics,...)

Le package svg contient les informations pour générer le svg correspondant aux formes entrées pas l'utilisateur.


_________________________________________
LANGAGE SPECIFIQUE
_________________________________________

Un package d'interprétation (qui n'est pas terminé) permettra d'entrer des instructions dans un langage différent de java et de
travailler avec les différents package de traduction proposés.

Pour utiliser le projet dans l'état actuel des choses, il faut ajouter le .jar (disponible dans le dossier "files" à la racine
du projet) au build path.

Ensuite, dans le fichier "files/test.svgproject", on peut écrire les instructions souhaitées (un exemple y est fourni).
Il ne reste plus qu'à éxécuter la classe language.main.Main qui affichera le svg en console (sous forme xml) et générera un
fichier "test.svg" en racine du projet.

Canvas(500,500)   ------> taille du layout, à savoir la feuille de travail sur laquelle seront "posées" les formes.
CERCLE(120,120,50,red) -----> coordonnées du centre (x,y), rayon, et couleur.
