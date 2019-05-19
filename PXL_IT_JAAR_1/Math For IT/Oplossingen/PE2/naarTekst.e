comment
naarTekst is een functie die een array van getallen van 0 tem 52 omzet naar een tekst
(0=>A, 1=>B, ...., 25=>Z, 26=>a, ..., 51=>z, 52=> spatie)
input: array van getallen van 0 tem 52
output: tekst
endcomment
function naarTekst(v)
## zet een array van getallen van 0 tem 52 omzet naar een tekst (0=>A, 1=>B, ...., 25=>Z, 26=>a, ..., 51=>z, 52=>spatie)
## input: array van getallen van 0 tem 52
## output: tekst
   tekst:= "";
   for i=1 to length(v)
     if (v[i] == 52)
       then tekst:=tekst|" ";
       else if (v[i] <= 25)
             then tekst:=tekst|char(v[i]+65);
             else tekst:=tekst|char(v[i]+71);
            endif
     endif
   end;
   return tekst;
endfunction;
