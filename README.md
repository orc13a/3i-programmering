# Pseudokode
## Inserton sort
### Trin 1
Tag plads 2 i arrayen.
### Trin 2
Sammenlign pladsen en gang til højre.
### Trin 3
Er værdien til højre større, så byt plads.
### Trin 4
Tag 3 plads i arrayen og sammenlign med pladsen til højre.
### Trin 5
Er værdien større byt, dermed sammenlign igen mod højre og hvis værdien er større, byt.
### Loop
Trinene køres i et loop.
---
Insertion sort virker altså på den møde at man tager en plads i arrayen og sammenligner med pladsen en gang til højre.
Hvis der byttes sammenligner man igen en plads mod højre. Der sammenlignes indtil at værdien er større og at man når starten af arrayen.
---
### Eksemple
En array kunne se sådan ud her: `[5, 2, 4, 6, 3, 1]`.
Vi starter med at tage plads 2 som har værdien 2.
Dermed sammenligner vi med en plads mod højre som har værdien 5.
Da 5 er større end 2 bytter de to plads. Da vi nu er på plads 1, tager vi plads 3 som har værdien 4.
Sammenligner vi en mod højre som har værdien 5 og de bytter. Nu sammen ligner vi 4 med 2 og der byttes ikke.
Dermed gå vi videre til plads 4 som har værdien 6 og trinene kørers igen.