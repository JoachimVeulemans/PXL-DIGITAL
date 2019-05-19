comment
naarCijfer is een functie die een tekst bestaande uit letters + spatie omzet naar cijfers van 0 tem 52
input: tekst in letters
output: array met de tekst uitgedrukt in getallen (A=>0, B=>1, ...., Z=>25, a=>26, ..., z>=51, spatie =>52)
endcomment
function naarCijfer(tekst)
## zet de tekst bestaande uit letters + spatie om naar cijfers van 0 tem 52
## input: tekst in letters
## output: array met de tekst uitgedrukt in getallen (A=>0, B=>1, ...., Z=>25, a=>26, ..., z>=51, spatie=>52)
   v:=[];
   for i=1 to strlen(tekst)
     hulp:= ascii(substring(tekst, i, i));
     if (hulp == 32)
       then v:=v|52;
       else if (hulp < 97)
 		then v:=v|hulp-65;
                else v:=v|hulp-71;
            endif
     endif
   end;
   return v;
endfunction;
