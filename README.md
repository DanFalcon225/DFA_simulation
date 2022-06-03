# DFA_simulation

Current program simulates DFA behaviour which is aim to process a defined language.

∑ = {E,G,L,O,X}
L = {w ∈ Σ*: w contains sub word with any number of Os between G in front and GLE at the back of the sub word}

In our case language is consisted of five letters over alphabet, however
apart of language itself we also have a sub word. Sub word states that language must
contain any number of Os between G in front and GLE at the back of the sub word.

By analysing mentioned sub word, we can see relevant transitions for G, O, G, L, E
(as language accept any number of Os we represent transition O as a loop).

The below picture demonstrates relevant transition diagram for named DFA (DFA is in minimized form)

<img width="337" alt="image" src="https://user-images.githubusercontent.com/93957570/171964961-5ebdaf98-49ad-4e19-a6ce-0a000fa9bb71.png">

The below picture shows relevant tests using configuration sequence:

<img width="605" alt="image" src="https://user-images.githubusercontent.com/93957570/171965040-635b1ca2-2403-465e-ba7a-706a9ccfa862.png">



